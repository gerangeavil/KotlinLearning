package Model

class Verduras(val tipo: String, nombre: String, unidadMedida: String, cantidad: Int): Ingredientes(nombre, unidadMedida, cantidad) {
	fun mostrar(): String {
		return "$tipo $nombre $unidadMedida $cantidad"
	}
}