#!/bin/bash
export AZURE_DEVOPS_PAT=qgyhpvgk7ypom22hvzasskddfze6aww2n7ah63pzf3sr7acygrna
git config --global user.email "abhinav.oruganti@effigoglobal.com"
git config --global user.name "abhinav oruganti"

GIT_TAG=$(git describe --tags --abbrev=0)
GIT_COMMIT=$(git rev-parse HEAD)

if [[ "$GIT_TAG" == "" ]]; then
    NEW_TAG="release-$(date +%d-%b-%y)-v1"
else
    TAG_DATE=$(echo $GIT_TAG | awk -F- '{print $2}')
    TAG_VERSION=$(echo $GIT_TAG | awk -F- '{print $5}' | sed 's/v//')

    NOW=$(date +%d-%b-%y)

    if [[ "$TAG_DATE" == "$(date +%d)" ]]; then
        NEW_VERSION=$((TAG_VERSION+1))
        NEW_TAG="release-$NOW-v$NEW_VERSION"
    else
        NEW_TAG="release-$(date +%d-%b-%y)-v1"
    fi

    # Check if tag already exists
    if git rev-parse "$NEW_TAG" >/dev/null 2>&1; then
        # Find latest tag and update it
        LATEST_TAG=$(git describe --tags --abbrev=0 --match="release-$(date +%d-%b-%y)-v*")
        TAG_VERSION=$(echo $LATEST_TAG | awk -F- '{print $5}' | sed 's/v//')
        NEW_VERSION=$((TAG_VERSION+1))
        NEW_TAG="release-$NOW-v$NEW_VERSION"
        git tag -a $NEW_TAG $GIT_COMMIT -m "Updating existing tag $LATEST_TAG to $NEW_TAG"
        git tag -d $LATEST_TAG
    fi
fi

echo "Automated tag: $NEW_TAG"
git tag -a $NEW_TAG $GIT_COMMIT -m "Tagging new build $NEW_TAG"
git push https://bkujcnouykow62cspv7ni4s7q2hjtkjrdfcnd7cya6z257z3akfa@dev.azure.com/Effigo/Enterprise%20Apps/_git/shared-web $NEW_TAG --tags --force --verbose