#!/bin/bash

#------------------------------------------------------------------------
# Utility methods
#

fatal()
{
  echo "credentials-local.sh: fatal: $1" 1>&2
  exit 1
}

info()
{
  echo "credentials-local.sh: info: $1" 1>&2
}

#------------------------------------------------------------------------
# Copy credentials into place.
#

info "installing keystore"

cp -v ".ci/credentials/APK Signing/keystore.jks" \
  "release.jks" || exit 1

#------------------------------------------------------------------------
# Add the NYPL nexus properties to the project properties.
#

mkdir -p "${HOME}/.gradle" ||
  fatal "could not create ${HOME}/.gradle"

cat ".ci/credentials/APK Signing/keystore.properties" >> "${HOME}/.gradle/gradle.properties" ||
  fatal "could not read keystore properties"

CREDENTIALS_PATH=$(realpath ".ci/credentials") ||
  fatal "could not resolve credentials path"

cp "${CREDENTIALS_PATH}/Certificates/Palace/Android/play_store_api_key.json" "org.thepalaceproject.deploytest.app/play_store_api_key.json" ||
  fatal "could not copy Play Store key"
