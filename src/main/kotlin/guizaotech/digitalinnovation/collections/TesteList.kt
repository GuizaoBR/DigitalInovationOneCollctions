package guizaotech.digitalinnovation.collections

fun main() {
    val teste1 = TesteObject(name = "teste 1", type = "type 1", salary = 3000.0 )
    val teste2 = TesteObject(name = "teste 2", type = "type 1", salary = 4000.0 )
    val teste3 = TesteObject(name = "teste 3", type = "type 2", salary = 5000.0 )

    val listTest =  listOf(teste1,teste2, teste3)

    listTest.forEach{
        println(it)
    }
    listTest.groupBy {
        it.type
    }.forEach{
        println(it)
    }
}