SUMMARY = "Fastest Fourier Transform of the West"
DESCRIPTION = "FFTW library example"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "file://fftw-3.3.8.tar.gz"

S = "${WORKDIR}/${PN}-${PV}"

EXTRA_OECONF += "--enable-shared"
inherit autotools

PROVIDES =+ "${PN}-staticdev"

FILES_${PN} = "${libdir}/*.so* ${bindir}/*"
FILES_${PN}-staticdev = "${libdir}/cmake* ${includedir} ${datadir}"
