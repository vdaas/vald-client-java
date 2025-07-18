#
# Copyright (C) 2019-2022 vdaas.org vald team <vald@vdaas.org>
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

USR_LOCAL = /usr/local
BINDIR = $(USR_LOCAL)/bin

VALD_DIR    = vald
VALD_SHA    = VALD_SHA
VALD_CLIENT_JAVA_VERSION = version/VALD_CLIENT_JAVA_VERSION
VALD_CHECKOUT_REF ?= main
PROTOBUF_VERSION = version/PROTOBUF_VERSION
GRPC_JAVA_VERSION = version/GRPC_JAVA_VERSION
JAVA_LTS_LATEST_VERSTION = version/JAVA_VERSION_LTS_LATEST
JAVA_LTS_STABLE_VERSTION = version/JAVA_VERSION_LTS_STABLE

K3D_MAKEFILE_URL=https://raw.githubusercontent.com/vdaas/vald/main/Makefile.d/k3d.mk
K3D_MAKEFILE=Makefile.d/k3d.mk

PWD    := $(eval PWD := $(shell pwd))$(PWD)

PROTO_ROOT  = $(VALD_DIR)/apis/proto
JAVA_ROOT   = src/main/java
API_ROOT    = org/vdaas/vald/api

MAKELISTS   = Makefile

JAVA_VERSION := $(eval JAVA_VERSION := $(shell cat ./version/JAVA_VERSION))$(JAVA_VERSION)
GRADLE_VERSION := $(eval GRADLE_VERSION := $(shell cat ./version/GRADLE_VERSION))$(GRADLE_VERSION)

TEST_DATASET_PATH = wordvecs1000.json

GRADLE_PROPERTIES_FILE = ~/.gradle/gradle.properties

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
all: clear proto clean

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

.PHONY: clear
## clear all dependency files
clear: clean
	rm -rf $(JAVA_ROOT)

.PHONY: clean
## clean temp files
clean:
	rm -rf $(VALD_DIR)
	rm -rf build
	./gradlew clean

.PHONY: proto
## build proto
proto: $(VALD_DIR) $(JAVA_ROOT)
	@$(call green, "generating .java files...")
	./gradlew bufGenerate \
				bufFormatApply \
				bufFormatCheck \
				bufLint \
				check \
				-x test
	cp -r build/bufbuild/generated/main src
	$(MAKE) -s build

.PHONY: build
## build source
build:
	./gradlew clean
	./gradlew build -x bufFormatApply \
					-x bufFormatCheck \
					-x bufLint \
					-x check \
					-x checkKotlinGradlePluginConfigurationErrors \
					-x checkKotlinGradlePluginConfigurationErrors \
					-x test \
					--stacktrace

$(JAVA_ROOT):
	$(call mkdir, $@)
	$(call rm, -rf, $@/*)

$(VALD_DIR):
	git clone https://$(VALDREPO) $(VALD_DIR)

.PHONY: vald/checkout
## checkout vald repository
vald/checkout: $(VALD_DIR)
	cd $(VALD_DIR) && git checkout $(VALD_CHECKOUT_REF)

.PHONY: vald/origin/sha/print
## print origin VALD_SHA value
vald/origin/sha/print: $(VALD_DIR)
	@cd $(VALD_DIR) && git rev-parse HEAD | tr -d '\n'

.PHONY: vald/sha/print
## print VALD_SHA value
vald/sha/print:
	@cat $(VALD_SHA)

.PHONY: vald/sha/update
## update VALD_SHA value
vald/sha/update: $(VALD_DIR)
	(cd $(VALD_DIR); git rev-parse HEAD | tr -d '\n' > ../$(VALD_SHA))

.PHONY: vald/client/version/print
## print VALD_CLIENT_JAVA_VERSION value
vald/client/version/print:
	@cat $(VALD_CLIENT_JAVA_VERSION)

.PHONY: vald/client/version/update
## update VALD_CLIENT_JAVA_VERSION value
vald/client/version/update: $(VALD_DIR)
	(vald_version=`cat $(VALD_DIR)/versions/VALD_VERSION | sed -e 's/^v//'`; \
		echo "VALD_VERSION: $${vald_version}"; \
		echo "$${vald_version}" > version/VALD_CLIENT_JAVA_VERSION)
	sed -i -e "s/^version = ".*"\$$/version = \"`cat version/VALD_CLIENT_JAVA_VERSION`\"/" build.gradle

.PHONY: test
## Execute test
test: $(TEST_DATASET_PATH)
	./gradlew test

$(TEST_DATASET_PATH):
	curl -L https://raw.githubusercontent.com/rinx/word2vecjson/master/data/wordvecs1000.json -o $(TEST_DATASET_PATH)

.PHONY: ci/deps/install
## install deps for CI environment
ci/deps/install:
	@echo "Nothing to do"

.PHONY: ci/deps/update
## update deps for CI environment
ci/deps/update: sync/k3d/mk

.PHONY: ci/package/prepare
## prepare for publich
ci/package/prepare:
	./gradlew clean
	./script/prepare_gradle_properties.sh ${GRADLE_PROPERTIES_FILE}

.PHONY: ci/package/publish
## publich packages
ci/package/publish: build
	./gradlew -Prelease --stacktrace publishToSonatype closeAndReleaseSonatypeStagingRepository

.PHONY: version/java
## Print Java version
version/java:
	@echo $(JAVA_VERSION)

.PHONY: version/gradle
## Print Gradle version
version/gradle:
	@echo $(GRADLE_VERSION)

Makefile.d:
	mkdir -p Makefile.d

sync/k3d/mk: Makefile.d
	rm -rf $(K3D_MAKEFILE)
	curl -fsSLo $(K3D_MAKEFILE) $(K3D_MAKEFILE_URL)

include $(K3D_MAKEFILE)
include Makefile.d/variables.mk
