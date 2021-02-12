FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://80-eth.network \
    file://80-wlan.network \
"

FILES_${PN} += " \
    ${sysconfdir}/systemd/network/80-eth.network \
    ${sysconfdir}/systemd/network/80-wlan.network \
"

do_install_append() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/80-eth.network ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/80-wlan.network ${D}${sysconfdir}/systemd/network
}