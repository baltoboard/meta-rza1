FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

INSANE_SKIP_libavcodec_pn-libav = "textrel"

SRC_URI += "file://ipv6.patch"
