FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# No egl available
QT_CONFIG_FLAGS_append = "${@base_contains('DISTRO_FEATURES', 'x11', \
                            ' -no-eglfs', ' -no-opengl -linuxfb -no-eglfs', d)}"

SRC_URI += " ${@bb.utils.contains("DISTRO_FEATURES", "ipv6", "", "file://noipv6.patch", d)}"

PACKAGECONFIG_DEFAULT_remove = "dbus udev"

# qtwebkit will fail later in the build if icu is not enabled. As Poky does not
# enable it, do it here if needed.
# This should be removed when the reverse dependency is added.
#PACKAGECONFIG_append = " icu"
