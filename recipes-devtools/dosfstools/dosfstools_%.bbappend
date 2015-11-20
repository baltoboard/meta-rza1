DEPENDS += "libiconv"

do_compile() {

	export CROSS_COMPILE=${TARGET_PREFIX}
	export CFLAGS='${TARGET_CC_ARCH} ${TOOLCHAIN_OPTIONS}'
	export LDFLAGS='${TOOLCHAIN_OPTIONS} -liconv'
	oe_runmake
}
