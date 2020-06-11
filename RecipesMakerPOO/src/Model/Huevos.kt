package Model

class Huevos(val clasificacion: String, nombre: String, unidadMedida: String, cantidad: Int): Ingredientes(nombre, unidadMedida, cantidad) {
	fun mostrar(): String {
		return "$clasificacion $nombre $unidadMedida $cantidad"
	}
}