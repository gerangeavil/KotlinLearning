package Model

class Granos(val grupo: String, nombre: String, unidadMedida: String, cantidad: Int): Ingredientes(nombre, unidadMedida, cantidad) {
	fun mostrar(): String {
		return "$grupo $nombre $unidadMedida $cantidad"
	}
}