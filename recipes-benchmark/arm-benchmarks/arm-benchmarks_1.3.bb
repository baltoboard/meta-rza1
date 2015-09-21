DESCRIPTION = "ARM Benchmarks"
HOMEPAGE = "https://gforge.ti.com/gf/project/am_benchmarks/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=7aefb5e1cffc7b6a3ef18b803f957922"
SECTION = "system"

PV = "1.3+git${SRCPV}"

BRANCH ?= "master"
SRCREV = "7513adb61cdb5931bd8bcac8275c44ffe2a8e1fd"

SRC_URI = "git://github.com/baltoboard/arm_benchmarks.git;protocol=git;branch=${BRANCH}"

S = "${WORKDIR}/git"

do_compile() {

	export CROSS_COMPILE=${TARGET_PREFIX}
	export CFLAGS='${TARGET_CC_ARCH} ${TOOLCHAIN_OPTIONS}'
	export LDFLAGS='${TOOLCHAIN_OPTIONS}'
	# build the release version
	oe_runmake release
}
do_install() {

	oe_runmake DESTDIR=${D} install
}

