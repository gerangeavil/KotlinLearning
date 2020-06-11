package Model

class Pollo(val presa: String, nombre: String, unidadMedida: String, cantidad: Int): Ingredientes(nombre, unidadMedida, cantidad) {
	fun mostrar(): String {
		return "$presa $nombre $unidadMedida $cantidad"
	}
}