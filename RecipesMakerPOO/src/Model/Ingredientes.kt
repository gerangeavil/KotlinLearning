package Model

open class Ingredientes(val nombre: String, val unidadMedida: String, var cantidad: Int) {

	fun agregarCantidad(cantidad: Int) {
		this.cantidad = cantidad
	}

	fun itemReceta(): String {
		return "$cantidad $unidadMedida de $nombre"
	}

	fun nombre(): String {
		return "$nombre"
	}
}
