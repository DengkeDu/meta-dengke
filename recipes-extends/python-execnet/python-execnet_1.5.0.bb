# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "execnet: rapid multi-Python deployment"
HOMEPAGE = "http://codespeak.net/execnet"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bb0320b04a0a503f12f69fea479de9"

# SRC_URI = "https://files.pythonhosted.org/packages/ab/c0/9496c35092eac2523ee8993ca3690b2d0aa95ef56623035b9c890745ac55/execnet-${PV}.tar.gz"
SRC_URI[md5sum] = "8df56985c656642cd26d233a1c74837c"
SRC_URI[sha256sum] = "a7a84d5fa07a089186a329528f127c9d73b9de57f1a1131b82bb5320ee651f6a"

S = "${WORKDIR}/execnet-${PV}"

inherit pypi setuptools

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS_${PN} += "python-apipkg"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python-apipkg python-core python-crypt python-ctypes python-io python-lang python-shell python-subprocess python-textutils python-threading"
DEPENDS += "setuptools-scm-native"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    __builtin__
#    __main__
#    msvcrt
#    queue
#    register
#    rlcompleter2
#    servicemanager
#    subprocess32
#    thread
#    win32event
#    win32evtlogutil
#    win32service
#    win32serviceutil


