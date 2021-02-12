DESCRIPTION = "A Doom Clone based on SDL"
LICENSE = "GPLv2"

DEPENDS = "libsdl2 libsdl2-mixer libsdl2-net pkgconfig"

LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://www.chocolate-doom.org/downloads/3.0.1/chocolate-doom-3.0.1.tar.gz;name=code \
          http://www.jbserver.com/downloads/games/doom/misc/shareware/doom1.wad.zip;name=wad  \
          file://100startdoom.sh \
          file://COPYING \
          "
SRC_URI[code.md5sum] = "9080b4c0a4e6383d841c51d4d245cad8"
SRC_URI[code.sha256sum] = "d435d6177423491d60be706da9f07d3ab4fabf3e077ec2a3fc216e394fcfc8c7"

SRC_URI[wad.md5sum] = "677ccd710d7cc014ac0eaffcd1072e09"
SRC_URI[wad.sha256sum] = "c1d1f430e623b5b02693a2ab42988f951fb66ae3bd3add06e557bdf36af0e24f"

S = "${WORKDIR}/${PN}-${PV}"

inherit autotools gettext pkgconfig

FILES_${PN} = "${datadir} ${bindir} \
              /etc/X11/Xsession.d/100startdoom.sh \
              "

do_install_append() {
  install -d ${D}/${datadir}
  install -d ${D}/etc/X11/Xsession.d

  install -m 0644 ${WORKDIR}/DOOM1.WAD ${D}/${datadir}/DOOM1.WAD
  install -m 0755 ${WORKDIR}/100startdoom.sh ${D}/etc/X11/Xsession.d/100startdoom.sh
}