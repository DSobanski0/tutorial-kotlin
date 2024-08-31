package functions

fun main() {
    val r = calculate(30,10)
    println(r)

    calculate(30,10)
}

private fun calculate(a: Int, b: Int): Int {
    return a + b
}