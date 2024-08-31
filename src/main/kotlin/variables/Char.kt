package variables

fun main() {

    val c1: Char = 'A'
    println(c1)
    println(c1.code)

    val i = 65
    println(i.toChar())

    val c2 = '1'
    println(c2.isDigit())
    println(c2.isUpperCase())
    println(c2.digitToInt())
}