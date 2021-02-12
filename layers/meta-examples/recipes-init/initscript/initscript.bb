SUMMARY = "Fastest Fourier Transform of the West"
DESCRIPTION = "Clock Configuration via I2C"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "file://myscript \
          file://COPYING    \
          "

# these 3 lines will have the script run on boot
inherit update-rc.d
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME = "myscript"

# install it in the correct location for update-rc.d
do_install() {
  install -d ${D}/${INIT_D_DIR}
  install -m 0755 ${WORKDIR}/myscript ${D}${INIT_D_DIR}/myscript
}