package functions

fun main() {
    sayHello("Daniel", 20)
    sayHello("José", 26)
    sayHello("Maria",31)
    sayHello(temperature = 28, name =  "José")
    println("FIM")
}

private fun sayHello(name: String, temperature: Int) {
    println("Hi, $name! Temperature is $temperature degrees")
}