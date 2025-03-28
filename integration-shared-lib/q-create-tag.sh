#!/bin/bash
export AZURE_DEVOPS_PAT=qgyhpvgk7ypom22hvzasskddfze6aww2n7ah63pzf3sr7acygrna
git config --global user.email "abhinav.oruganti@effigoglobal.com"
git config --global user.name "abhinav oruganti"

DATE=$(date +%d-%b-%y)
LATEST_TAG=$(git describe --tags --match="q-release-$DATE-v*" --abbrev=0)
GIT_COMMIT=$(git rev-parse HEAD)

if [[ "$LATEST_TAG" == "q-release-$DATE-v1" ]]; then
    TAG_VERSION=$(echo "$LATEST_TAG" | awk -F- '{print $NF}' | sed 's/v//')
    NEW_VERSION=$((TAG_VERSION+1))
    NEW_TAG="q-release-$DATE-v$NEW_VERSION"
else
    LATEST_VERSION=$(echo "$LATEST_TAG" | awk -F- '{print $NF}' | sed 's/v//')
    if [[ -z "$LATEST_VERSION" ]]; then
        NEW_VERSION=1
    else
        NEW_VERSION=$((LATEST_VERSION+1))
    fi
    NEW_TAG="q-release-$DATE-v$NEW_VERSION"
fi

echo "Automated tag: $NEW_TAG"
git tag -a "$NEW_TAG" "$GIT_COMMIT" -m "Tagging new build $NEW_TAG"
git push https://bkujcnouykow62cspv7ni4s7q2hjtkjrdfcnd7cya6z257z3akfa@dev.azure.com/Effigo/Enterprise%20Apps/_git/integration-shared-lib $NEW_TAG --tags --force --verbose