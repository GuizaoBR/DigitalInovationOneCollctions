package guizaotech.digitalinnovation.collections

fun main() {
    val teste1 = TesteObject(name = "teste 3", type = "type 1", salary = 6000.0 )
    val teste2 = TesteObject(name = "teste 2", type = "type 1", salary = 4000.0 )
    val teste3 = TesteObject(name = "teste 1", type = "type 2", salary = 6000.0 )
    val map = mapOf(Pair(teste1.name, teste1.salary),
        Pair(teste2.name, teste2.salary),
        Pair(teste3.name, teste3.salary))

    map.forEach{
        println(it)
        println(it.value)
        println(it.key)
    }

}