SUMMARY = "Fastest Fourier Transform of the West"
DESCRIPTION = "Clock Configuration via I2C"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "file://ngrok \
          file://COPYING \
          "

do_install() {
  install -d ${D}/${bindir}
  install -m 0755 ${WORKDIR}/ngrok ${D}/${bindir}/ngrok
}