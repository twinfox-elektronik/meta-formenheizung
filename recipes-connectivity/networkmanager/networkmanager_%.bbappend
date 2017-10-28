do_install_append () {
    ln -sf /data/config/network/wifi-wlan0 ${D}${sysconfdir}/NetworkManager/system-connections/wifi-wlan0
}
