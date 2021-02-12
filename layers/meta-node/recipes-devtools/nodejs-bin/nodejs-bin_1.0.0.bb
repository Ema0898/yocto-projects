DESCRIPTION = "A recipe to install compiled NodeJS"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "file://node-v14.15.1-linux-armv7l.zip \
	   file://COPYING \
	  "
#SRC_URI[sha256sum] = "887588884bfa386b38aeba0c00ec6292df8b1457328ea9969dd8e794fa13adff"

S = "${WORKDIR}/${PN}-${PV}"

RDEPENDS_${PN} += "bash python3-core"

do_install() {
  install -d ${D}${bindir}
  install -d ${D}${libdir}
  install -d ${D}${datadir}
    
  cp -R ${WORKDIR}/node-v14.15.1-linux-armv7l/bin/* ${D}${bindir}
  cp -R ${WORKDIR}/node-v14.15.1-linux-armv7l/lib/* ${D}${libdir}
  cp -R ${WORKDIR}/node-v14.15.1-linux-armv7l/share/* ${D}${datadir}
}

FILES_${PN} = "${bindir} ${libdir} ${datadir} "

INSANE_SKIP_${PN} = "ldflags"

