DESCRIPTION = "Cute Files recipe from scratch"
HOMEPAGE = "http://nodered.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=71d98c0a1db42956787b1909c74a86ca"

inherit npm

PR = "r0"

SRC_URI = "\
    npm://registry.npmjs.org;package=cute-files;version=1.0.2 \
    npmsw://${THISDIR}/files/npm-shrinkwrap.json \
"

S = "${WORKDIR}/npm"