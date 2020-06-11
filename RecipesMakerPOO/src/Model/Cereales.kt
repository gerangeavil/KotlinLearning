package Model

class Cereales(val procesamiento: String, nombre: String, unidadMedida: String, cantidad: Int): Ingredientes(nombre, unidadMedida, cantidad) {
	fun mostrar(): String {
		return "$procesamiento $nombre $unidadMedida $cantidad"
	}
}