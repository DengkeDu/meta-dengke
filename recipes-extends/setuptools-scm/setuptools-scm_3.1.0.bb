# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

SRC_URI = "https://github.com/pypa/setuptools_scm/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "a60fe9b69c3a8f451684e52ae5c767aa"
SRC_URI[sha256sum] = "e332acf30f86f2a30c5a0cabe18dcc08b811c04de436948725932cffe8ebc51f"

S = "${WORKDIR}/setuptools_scm-${PV}"

inherit setuptools

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python-core"
BBCLASSEXTEND = "native nativesdk"
