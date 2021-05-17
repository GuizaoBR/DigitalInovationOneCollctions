package guizaotech.digitalinnovation.collections

data class TesteObject(
    val name: String = "",
    val type: String = "",
    val salary: Double = 0.0
){
    override fun toString(): String {
        return "${name} - ${type} :  R$: ${salary}"
    }
}
