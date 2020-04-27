package qdbm

import kotlinx.cinterop.cstr
import platform.posix.*
import qdbm.cinterop.dbm_open

fun main() {
    val dbm = dbm_open("hello".cstr, O_RDWR or O_CREAT, S_IRUSR or S_IWUSR or S_IRGRP or S_IROTH)
}