DESCRIPTION = "A calculator example using static and dynamic libraries"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "file://calculator-1.0.0.zip \
	   file://COPYING \
	  "

S = "${WORKDIR}/${PN}-${PV}"

do_compile() {
  oe_runmake
}

do_install() {
  install -d ${D}${bindir}
  install -d ${D}${libdir}

  install -m 0755 ${S}/bin/calculadora_e ${D}${bindir}
  install -m 0755 ${S}/bin/calculadora_d ${D}${bindir}

  install -m 0755 ${S}/lib/liboperaciones.so ${D}${libdir}
}

FILES_${PN} = "${libdir}/*.so.* ${bindir}"

#For dev packages only
#FILES_${PN}-dev = "${libdir}/*.so"

INSANE_SKIP_${PN} = "ldflags"

#For dev packages only
INSANE_SKIP_${PN}-dev = "ldflags"
