# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Admin and deploy tool for Ceph"
HOMEPAGE = "https://github.com/ceph/ceph-deploy"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   debian/copyright
# NOTE: Original package / source metadata indicates license is: MIT
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fad038f1a70a3c32499458b75941f66f \
                    file://debian/copyright;md5=e04da0f4056d7ab6b457b0d8d8d8f84b"

SRC_URI = "https://github.com/ceph/ceph-deploy/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "5e1cbb2099997b5eca48f4b5ff4233b9"
SRC_URI[sha256sum] = "f8309b26afb222a325cec0a31779d91e58aa8b8b5ed6d3d891370eb076d696c0"

# NOTE: spec file indicates the license may be "MIT"
inherit setuptools

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python-argparse python-contextlib python-core python-datetime \
                   python-io python-json python-lang python-logging python-netclient \
                   python-setuptools python-shell python-subprocess python-textutils \
                   python-execnet \
"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    configparser
#    mock
#    pytest
#    remoto
#    urllib.error
#    urllib.parse
#    urllib.request


