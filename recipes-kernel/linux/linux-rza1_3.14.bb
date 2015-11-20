DESCRIPTION = "RZ/A1 Linux Kernel"
SECTION = "kernel"
LICENSE = "GPLv2"

inherit kernel
require recipes-kernel/linux/linux-dtb.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

COMPATIBLE_MACHINE = "rza1"

PROVIDES += "virtual/kernel"

PV = "3.14+git${SRCPV}"

SRCBRANCH = "master"
SRCREV = "5186267fd38bb05731b1d0156fba6b158a99eb24"
SRC_URI = "git://github.com/renesas-rz/linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"

S = "${WORKDIR}/git"
