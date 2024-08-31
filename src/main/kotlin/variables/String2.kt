package variables

fun main() {

//    O rato roeu
//    a $roupa do
//    rei de "Roma".

    val s1 = "O rato roeu\na \$roupa do\nrei de \"Roma\"."
    println(s1)

    val s2 = """
        |O rato roeu
        |  a roupa do
        | rei de "Roma".
        """.trimMargin()
    println()
    println(s2)

}