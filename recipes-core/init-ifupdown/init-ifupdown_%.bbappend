FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI_append = " file://interfaces-rpi \
"
do_install_append () {
	install -m 0644 ${WORKDIR}/interfaces-rpi ${D}${sysconfdir}/network/interfaces	
}
