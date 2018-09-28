SUMMARY = "User space components of the Ceph file system"
LICENSE = "LGPLv2.1 & GPLv2 & Unknown & Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://COPYING-LGPL2.1;md5=fbc093901857fcd118f065f900982c24 \
                    file://COPYING-GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://COPYING;md5=92d301c8fccd296f2221a68a8dd53828 \
"
SRC_URI = "http://download.ceph.com/tarballs/ceph-${PV}.tar.gz \
           file://0001-Correct-the-path-to-find-version.h-in-rocksdb.patch \
           file://0001-ceph-disable-pybind.patch \
           file://0001-zstd-fix-error-for-cross-compile.patch \
"
SRC_URI[md5sum] = "4b0ee225e153fbb2515fa3f8a3666d17"
SRC_URI[sha256sum] = "32086294d2007fdf64f85fcd919de2f092eeaa897bd8dc7c01e005e14516903c"

DEPENDS = "zlib curl expat openssl udev snappy lz4 keyutils nss nspr openssl openldap \
           valgrind libibverbs xfsprogs libaio gperftools \
           bzip2 boost rocksdb oath python python-sphinx \
           gperf-native \
"
inherit cmake pythonnative python-dir
OECMAKE_GENERATOR = "Unix Makefiles"

EXTRA_OECMAKE = "-DWITH_MANPAGE=OFF \
                 -DWITH_FUSE=OFF \
                 -DWITH_SPDK=OFF \
                 -DWITH_LEVELDB=OFF \
                 -DWITH_LTTNG=OFF \
                 -DWITH_BABELTRACE=OFF \
                 -DWITH_TESTS=OFF \
                 -DWITH_MGR=OFF \
                 -DWITH_MGR_DASHBOARD_FRONTEND=OFF \
                 -DWITH_SYSTEM_BOOST=ON \
                 -DWITH_SYSTEM_ROCKSDB=ON \
"
FILES_${PN} += "\
                ${libdir}/rados-classes/*.so* \
"
