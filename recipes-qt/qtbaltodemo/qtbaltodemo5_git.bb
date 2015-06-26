DESCRIPTION = "QT balto demo"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://qtbaltodemo.pro;md5=d7d3f76176e7a9381a5776ac01d9477f"

PV = "1.2+gitr${SRCPV}"

SRCREV = "b4adc9e67dd5b877644d834845b23cbf4bc6e0a1"
SRC_URI = "git://github.com/baltoboard/qtbaltodemo.git;branch=master"

S = "${WORKDIR}/git"

DEPENDS = "qtbase qtsvg"

require recipes-qt/qt5/qt5.inc

do_install_append () {
	install -d ${D}${bindir}
	install -m 755 ${WORKDIR}/build/examples/baltodemo/baltodemo ${D}${bindir}/baltodemo5
}

