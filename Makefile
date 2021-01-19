#
# Copyright (C) 2019-2020 Vdaas.org Vald team ( kpango, rinx, kmrmt )
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#    https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

REPO       ?= vdaas
NAME        = vald
VALDREPO    = github.com/$(REPO)/$(NAME)
LANGUAGE    = java
PKGNAME     = $(NAME)-client-$(LANGUAGE)
PKGREPO     = github.com/$(REPO)/$(PKGNAME)

VALD_DIR    = vald
VALD_SHA    = VALD_SHA
VALD_CLIENT_JAVA_VERSION = VALD_CLIENT_JAVA_VERSION

PWD    := $(eval PWD := $(shell pwd))$(PWD)
GOPATH := $(eval GOPATH := $(shell go env GOPATH))$(GOPATH)

PROTO_ROOT  = vald/apis/proto
JAVA_ROOT   = src/main/java
API_ROOT    = org/vdaas/vald/api

PROTOS = \
	v1/agent/core/agent.proto \
	v1/gateway/vald/vald.proto \
	v1/vald/filter.proto \
	v1/vald/insert.proto \
	v1/vald/object.proto \
	v1/vald/remove.proto \
	v1/vald/search.proto \
	v1/vald/update.proto \
	v1/vald/upsert.proto \
	v1/payload/payload.proto

PROTOS     := $(PROTOS:%=$(PROTO_ROOT)/%)
JAVASOURCES = $(PROTOS:$(PROTO_ROOT)/%.proto=$(JAVA_ROOT)/$(API_ROOT)/%.java)

pr:
	@echo $(PROTOS)
	@echo $(JAVASOURCES)

PROTO_PATHS = \
	$(PWD) \
	$(PWD)/$(VALD_DIR) \
	$(GOPATH)/src \
	$(GOPATH)/src/github.com/gogo/googleapis

MAKELISTS   = Makefile

red    = /bin/echo -e "\x1b[31m\#\# $1\x1b[0m"
green  = /bin/echo -e "\x1b[32m\#\# $1\x1b[0m"
yellow = /bin/echo -e "\x1b[33m\#\# $1\x1b[0m"
blue   = /bin/echo -e "\x1b[34m\#\# $1\x1b[0m"
pink   = /bin/echo -e "\x1b[35m\#\# $1\x1b[0m"
cyan   = /bin/echo -e "\x1b[36m\#\# $1\x1b[0m"

define go-get
	GO111MODULE=on go get -u $1
endef

define go-get-no-mod
	GO111MODULE=off go get -u $1
endef

define mkdir
	mkdir -p $1
endef

.PHONY: all
## execute clean and proto
all: clean proto

.PHONY: help
## print all available commands
help:
	@awk '/^[a-zA-Z_0-9%:\\\/-]+:/ { \
	  helpMessage = match(lastLine, /^## (.*)/); \
	  if (helpMessage) { \
	    helpCommand = $$1; \
	    helpMessage = substr(lastLine, RSTART + 3, RLENGTH); \
      gsub("\\\\", "", helpCommand); \
      gsub(":+$$", "", helpCommand); \
	    printf "  \x1b[32;01m%-35s\x1b[0m %s\n", helpCommand, helpMessage; \
	  } \
	} \
	{ lastLine = $$0 }' $(MAKELISTS) | sort -u
	@printf "\n"

.PHONY: clean
## clean
clean:
	rm -rf $(JAVA_ROOT)
	rm -rf $(VALD_DIR)

.PHONY: proto
## build proto
proto: $(JAVASOURCES) $(JAVA_ROOT)/com/google/protobuf/GoGoProtos.java

$(JAVA_ROOT):
	$(call mkdir, $@)
	$(call rm, -rf, $@/*)

$(JAVASOURCES): vald proto/deps $(JAVA_ROOT)
	@$(call green, "generating .java files...")
	protoc \
		$(PROTO_PATHS:%=-I %) \
		--plugin=protoc-gen-grpc-java=`which protoc-gen-grpc-java` \
		--java_out=$(JAVA_ROOT) \
		--grpc-java_out=$(JAVA_ROOT) \
		$(patsubst $(JAVA_ROOT)/$(API_ROOT)/%.java,$(PROTO_ROOT)/%.proto,$@)

$(JAVA_ROOT)/com/google/protobuf/GoGoProtos.java: proto/deps $(JAVA_ROOT)
	@$(call green, "generating .java files...")
	protoc \
		$(PROTO_PATHS:%=-I %) \
		--plugin=protoc-gen-grpc-java=`which protoc-gen-grpc-java` \
		--java_out=$(JAVA_ROOT) \
		--grpc-java_out=$(JAVA_ROOT) \
		$(GOPATH)/src/github.com/gogo/protobuf/gogoproto/gogo.proto

$(VALD_DIR):
	git clone --depth 1 https://$(VALDREPO) $(VALD_DIR)

.PHONY: vald/sha/print
## print VALD_SHA value
vald/sha/print:
	@cat $(VALD_SHA)

.PHONY: vald/sha/update
## update VALD_SHA value
vald/sha/update: vald
	(cd vald; git rev-parse HEAD > ../$(VALD_SHA))

.PHONY: vald/client/java/version/print
## print VALD_CLIENT_JAVA_VERSION value
vald/client/java/version/print:
	@cat $(VALD_CLIENT_JAVA_VERSION)

.PHONY: vald/client/java/version/update
## update VALD_CLIENT_JAVA_VERSION value
vald/client/java/version/update: vald
	(vald_version=`cat vald/versions/VALD_VERSION | sed -e 's/^v//'`; \
	    client_version=`cat $(VALD_CLIENT_JAVA_VERSION)`; \
	    major=$${client_version%%.*}; client_version="$${client_version#*.}"; \
	    minor=$${client_version%%.*}; client_version="$${client_version#*.}"; \
	    patch=$${client_version%%.*}; client_version="$${client_version#*.}"; \
	    if [ "$${vald_version}" = "$${major}.$${minor}.$${patch}" ]; then \
	        if [ "$${patch}" = "$${client_version}" ]; then \
	            new_version="$${major}.$${minor}.$${patch}.Rev1"; \
	        else \
	            rev="$${client_version#Rev}"; \
	            rev=$$((rev+1)); \
	            new_version="$${major}.$${minor}.$${patch}.Rev$${rev}"; \
	        fi; \
	    else \
	        new_version="$${vald_version}"; \
	    fi; \
	    echo "VALD_VERSION: $${vald_version}, NEW_CLIENT_VERSION: $${new_version}"; \
	    echo "$${new_version}" > VALD_CLIENT_JAVA_VERSION)
	sed -i -e "s/^version = ".*"\$$/version = \"`cat VALD_CLIENT_JAVA_VERSION`\"/" build.gradle

.PHONY: proto/deps
## install proto deps
proto/deps: \
	$(GOPATH)/src/github.com/gogo/protobuf \
	$(GOPATH)/src/github.com/gogo/googleapis \
	$(GOPATH)/src/github.com/envoyproxy/protoc-gen-validate

$(GOPATH)/src/github.com/gogo/protobuf:
	git clone \
		--depth 1 \
		https://github.com/gogo/protobuf \
		$(GOPATH)/src/github.com/gogo/protobuf

$(GOPATH)/src/github.com/gogo/googleapis:
	git clone \
		--depth 1 \
		https://github.com/gogo/googleapis \
		$(GOPATH)/src/github.com/gogo/googleapis

$(GOPATH)/src/github.com/envoyproxy/protoc-gen-validate:
	git clone \
		--depth 1 \
		https://github.com/envoyproxy/protoc-gen-validate \
		$(GOPATH)/src/github.com/envoyproxy/protoc-gen-validate
