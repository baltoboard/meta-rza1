DESCRIPTION = "An image that will launch into the demo application for QT5."
LICENSE = "MIT"
PR = "r3"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_FSTYPES += "tar.bz2"

#baltodemo5

IMAGE_INSTALL += "\
	evtest \
	i2c-tools \
	iperf \
	packagegroup-core-boot \
	qtbaltodemo5 \
	qtbase-fonts \
	qtbase-plugins \
	strace \
"

inherit core-image

