# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "apipkg: namespace control and lazy-import mechanism"
HOMEPAGE = "https://github.com/pytest-dev/apipkg"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bb0320b04a0a503f12f69fea479de9"

# SRC_URI = "https://files.pythonhosted.org/packages/a8/af/07a13b1560ebcc9bf4dd439aeb63243cbd8d374f4f328691470d6a9b9804/apipkg-${PV}.tar.gz"
SRC_URI[md5sum] = "6d2bc4d9358e046cc56efc677c976a5c"
SRC_URI[sha256sum] = "37228cda29411948b422fae072f57e31d3396d2ee1c9783775980ee9c9990af6"

S = "${WORKDIR}/apipkg-${PV}"

inherit pypi setuptools

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python-core python-subprocess"
DEPENDS += "setuptools-scm-native"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    aliasimport
#    aliasmodule_proxy
#    api1
#    api1.os2.path
#    apipkg
#    dotted_name_lookup
#    errorloading1
#    extra_attributes
#    firstaccess
#    fromaliasimport.some
#    initpkg_without_old_module
#    my_aliasmodule_proxy
#    mymodule
#    py
#    pytest
#    realtest.x
#    realtest.x.module
#    recmodule


