SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL} openssh dnf linux-firmware-bcm43430 \
		 kernel-modules wpa-supplicant bluez5 psmisc  \
		 util-linux coreutils binutils gcc gdb autoconf automake \
		 gstreamer1.0 gstreamer1.0-libav gstreamer1.0-plugins-bad gstreamer1.0-plugins-good gstreamer1.0-vaapi gstreamer1.0-rtsp-server \
		 gstreamer1.0-rtsp-server-apps \
		 lsof net-tools glibc-binaries vim git kmod procps usbutils pciutils iw"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
LICENSE_FLAGS_WHITELIST = "commercial"
DISTRO_FEATURES_append = " pam"
VIDEO_CAMERA = "1"
GPU_MEM_512 = "1"
