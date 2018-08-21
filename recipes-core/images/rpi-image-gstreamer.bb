SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = " packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

IMAGE_INSTALL += " \ 
        kernel-modules \
	openssh \
	linux-firmware-bcm43430 \
	wpa-supplicant \
	psmisc \
	util-linux \
	coreutils \
	binutils \
	gcc \
	gdb \
	autoconf \
	automake \
	gstreamer1.0 \
	gstreamer1.0-libav \
	gstreamer1.0-plugins-bad \
	gstreamer1.0-plugins-good \
	gstreamer1.0-vaapi \
	gstreamer1.0-rtsp-server \
	gstreamer1.0-rtsp-server-apps \
	gstreamer1.0-plugins-base \
	gstreamer1.0-plugins-ugly \
	gstreamer1.0-python \
	lsof \
	net-tools \
	glibc-binaries \
	vim \
	git \
	kmod \
	procps \
	usbutils \
	pciutils \
	iw \
	python-setuptools \
	dnf \
        "
# We shouldn't not placed IMAGE_FEATURE and DISTRO_FEATURE in this file, those should be in conf/local.conf
# LICENSE_FLAGS_WHITELIST="commercial"
# VIDEO_CAMERA = "1" 
# GPU_MEM_512 = "1" 
# ENABLE_UART = "1" 
# BB_NUMBER_THREADS = "20"
# IMAGE_FEATURES_append = " package-management ssh-server-openssh"
