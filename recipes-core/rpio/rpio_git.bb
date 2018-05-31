# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Advanced GPIO for the Raspberry Pi. Extends RPi.GPIO with PWM, GPIO interrups, TCP socket interrupts, command line tools and more"
HOMEPAGE = "https://github.com/metachris/RPIO"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   debian/copyright
# NOTE: Original package / source metadata indicates license is: LGPL-3.0+
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "LGPLv3 & Unknown & LGPL-3.0+"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bb3ca60759f3202f1ae42e3519cd06bc \
                    file://debian/copyright;md5=d649edf5fe0d6df23bda355c81f75603"

SRC_URI = "git://github.com/JamesGKent/RPIO.git;branch=v2;protocol=https"

# Modify these as desired
PV = "0.10.1+git${SRCPV}"
SRCREV = "b1112f52ef485d0c0a66c070526fd98b863b05b2"

S = "${WORKDIR}/git"

inherit setuptools

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python-core python-curses python-io python-lang python-logging python-netclient python-subprocess python-textutils python-threading"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    urllib.request

do_configure[noexec] = "1"
