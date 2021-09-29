package fp.chap02.control_syntax

import java.lang.Integer.parseInt

const val x = 3

fun main(args: Array<String>) {
    when(x) {
        1 -> print("x == 1")
        2, 3 -> print("x == 2 or 3")
        parseInt("4") -> print("x == 4")
        else -> print("else number")
    }
}