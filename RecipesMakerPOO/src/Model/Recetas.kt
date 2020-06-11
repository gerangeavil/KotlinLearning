package Model

class Recetas(val nombre: String, var receta: List<String>) {

	fun agregarIngrediente(ingrediente: String) {
		this.receta += ingrediente
	}

	fun listado(): List<String> {
		return receta
	}
}