SUMMARY = "Fastest Fourier Transform of the West"
DESCRIPTION = "Clock Configuration via I2C"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "file://myscript.sh \
          file://COPYING    \
          file://hello.service \
          "
RDEPENDS_${PN} += "elfutils bash"

# these 3 lines will have the script run on boot
inherit systemd
SYSTEMD_AUTO_ENABLE_${PN} = "enable"
SYSTEMD_SERVICE_${PN} = "hello.service"

# install it in the correct location for update-rc.d
do_install() {
  install -d ${D}/${bindir}
  install -d ${D}/${systemd_unitdir}/system

  install -m 0755 ${WORKDIR}/myscript.sh ${D}/${bindir}/myscript.sh
  install -m 0644 ${WORKDIR}/hello.service ${D}/${systemd_unitdir}/system
}

FILES_${PN} = "${systemd_unitdir}/system/hello.service \
               ${bindir}/myscript.sh \
               "