#!/bin/bash

# Imports private key.
echo "${PGP_PRIVATE_KEY}" > private_key.txt
gpg --import --batch private_key.txt
rm -f private_key.txt

# Exports secrets.
gpg --pinentry-mode loopback --passphrase "${GPG_PASSPHRASE}" --export-secret-keys -o ~/.gnupg/secring.gpg

# Creates gradle directory if not exists.
mkdir -p ~/.gradle

# Sets up gradle properties file.
GRADLE_PROPERTIES_FILE="$1"
cat << EOF > ~/.gradle/gradle.properties
org.gradle.daemon=true
signing.keyId=${GPG_KEYID}
signing.password=${GPG_PASSPHRASE}
signing.secretKeyRingFile=${HOME}/.gnupg/secring.gpg
sonatypeUsername=${SONATYPE_USERNAME}
sonatypePassword=${SONATYPE_PASSWORD}
nexusUsername=${SONATYPE_USERNAME}
nexusPassword=${SONATYPE_PASSWORD}
EOF
