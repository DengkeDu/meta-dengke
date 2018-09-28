# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & GPLv3 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=62e1e33aebac5b1bc9fc48a866e2f61b \
                    file://oathtool/COPYING;md5=d32239bcb673463ab874e80d47fae504 \
                    file://liboath/COPYING;md5=4fbd65380cdd255951079008b364516c \
                    file://pam_oath/COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "file:///buildarea1/ddu/yocto/build-x86_64/oath-toolkit-${PV}.tar.gz \
           file://0001-oath-fix-macro-definition-error.patch \
"

S = "${WORKDIR}/${BPN}-toolkit-${PV}"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""
DEPENDS = "gtk-doc-native"
