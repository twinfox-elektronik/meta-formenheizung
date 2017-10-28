#include recipes-core/images/rpi-hwup-image.bb
include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
    packagegroup-base \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'networkmanager', '', d)} \
    "