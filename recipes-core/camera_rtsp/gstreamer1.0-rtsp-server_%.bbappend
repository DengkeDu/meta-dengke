EXTRA_OECONF = "--disable-tests"
do_install_append () {
        install -d ${D}${bindir}
        for file in ${B}/examples/.libs/*;do
                install -m 755 "$file" ${D}${bindir}
        done
}

