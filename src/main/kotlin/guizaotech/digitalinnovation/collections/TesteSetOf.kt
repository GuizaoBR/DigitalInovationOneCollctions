package guizaotech.digitalinnovation.collections

import kotlin.reflect.typeOf

fun main() {
    val teste1 = TesteObject(name = "teste 3", type = "type 1", salary = 6000.0 )
    val teste2 = TesteObject(name = "teste 2", type = "type 1", salary = 4000.0 )
    val teste3 = TesteObject(name = "teste 1", type = "type 2", salary = 6000.0 )
    val setTeste = setOf(teste1,teste2)
    val setTeste2 = setOf(teste3)
    val setTesteFinal = setTeste.union(setTeste2)
    println("java ${setTeste.javaClass.name}")
    println("kotlin ${setTeste.javaClass.kotlin}")

    setTeste.forEach {
        println(it)
    }
    println("---------------")
    setTeste2.forEach {
        println(it)
    }
    println("---------------")
    setTesteFinal
        .sortedByDescending {
            it.salary
        }

        .forEach {
        println(it)
    }

    println("---------------")
    setTesteFinal
        .sortedWith(compareByDescending<TesteObject> { it.salary }.thenBy { it.name })
        .forEach {
            println(it)
        }

}