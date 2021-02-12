SUMMARY = "Test for autotools based library"
DESCRIPTION = "Library for math operations"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "file://liboperaciones-1.0.tar.gz"

S = "${WORKDIR}/${PN}-${PV}"

EXTRA_OECONF += "--enable-shared"
inherit autotools

FILES_${PN} = "${libdir}/*.so* ${bindir}"
