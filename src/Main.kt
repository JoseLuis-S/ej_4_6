data class Compra(val cliente: String, val dia: String, val monto: Double)

data class Cliente(val nombre: String, val domicilio: String)

data class Domicilio(val calle: String, val numero: Int) {
    fun dirCompleta() = "Calle $calle $numero"
}

class RepositorioCompras() {
    val listaCompras: MutableList<Compra> = mutableListOf()
    fun agregarCompra(compra: Compra) = listaCompras.add(compra)

    fun domicilio(domicilio: Domicilio) = domicilio.dirCompleta()
}



fun main() {

}