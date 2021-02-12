DESCRIPTION = "Boot startup for dhclient"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI += "file://COPYING \
            file://dhclient-init.service \
           "

inherit systemd
SYSTEMD_AUTO_ENABLE_{PN} = "enable"
SYSTEMD_SERVICE_${PN} = "dhclient-init.service"

do_install_append () {
   install -d ${D}${systemd_unitdir}/system/
   install -m 0644 ${WORKDIR}/dhclient-init.service ${D}${systemd_unitdir}/system/
}