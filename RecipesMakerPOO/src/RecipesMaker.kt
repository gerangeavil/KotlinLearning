import Model.*

val libroRecetas: MutableList<MutableList<String>> = mutableListOf()

fun main(args: Array<String>) {
	val menu1: List<String> = listOf("══════════════════════════════════════════","1. Hacer una receta", "2. Ver mis recetas", "3. Salir")

	do {
		for (item in menu1) {
			println(item)
		}
		println("Digite una opción del menú: ")
		val response:String? = readLine()

		when (response) {
			"1" -> nuevaReceta()
			"2" -> verReceta(libroRecetas)
			"3" -> println(":: Que vuelva pronto, hasta luego ::")
			else -> println("Opción no valida")
		}
	}while (response != "3")
}

fun nuevaReceta() {

	val aceitesI: Ingredientes = Ingredientes("Aceites", "litros", 0)
	val aguaI: Ingredientes = Ingredientes("Agua", "litros", 0)
	val carnesI: Ingredientes = Ingredientes("Carnes", "gramos", 0)
	val cerealesI: Ingredientes = Ingredientes("Cereales", "gramos", 0)
	val frutasI: Ingredientes = Ingredientes("Frutas", "gramos", 0)
	val granosI: Ingredientes = Ingredientes("Granos", "gramos", 0)
	val huevosI: Ingredientes = Ingredientes("Huevos", "unidad", 0)
	val lacteosI: Ingredientes = Ingredientes("Lacteos", "gramos", 0)
	val pescadosI: Ingredientes = Ingredientes("Pescados", "gramos", 0)
	val polloI: Ingredientes = Ingredientes("Pollo", "gramos", 0)
	val verdurasI: Ingredientes = Ingredientes("Verduras", "gramos", 0)

	val menu2: List<String> = listOf(
			aceitesI.nombre(),
			aguaI.nombre(),
			carnesI.nombre(),
			cerealesI.nombre(),
			frutasI.nombre(),
			granosI.nombre(),
			huevosI.nombre(),
			lacteosI.nombre(),
			pescadosI.nombre(),
			polloI.nombre(),
			verdurasI.nombre())

	println("Digite el nombre de la receta")
	val nombreReceta:String? = readLine()
	val listaVacia: List<String> = listOf(nombreReceta.toString())
	val receta: Recetas = Recetas(nombreReceta.toString(), listaVacia)

	do {
		var contador: Int = 0
		for ((index, item) in menu2.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Salir")

		val response:String? = readLine()

		when (response) {
			"1" -> nuevaRecetaAceites(receta)
			"2" -> nuevaRecetaAgua(receta)
			"3" -> nuevaRecetaCarnes(receta)
			"4" -> nuevaRecetaCereales(receta)
			"5" -> nuevaRecetaFrutas(receta)
			"6" -> nuevaRecetaGranos(receta)
			"7" -> nuevaRecetaHuevos(receta)
			"8" -> nuevaRecetaLacteos(receta)
			"9" -> nuevaRecetaPescados(receta)
			"10" -> nuevaRecetaPollo(receta)
			"11" -> nuevaRecetaVerduras(receta)
			"12" -> println("Salir")
			else -> println("Opción no valida")
		}
	}while (response != "12")
	libroRecetas.add(receta.listado() as MutableList<String>)
}

fun nuevaRecetaAceites(receta: Recetas) {
	val aceite1: Aceites = Aceites("Extra", "Aceite de girasol", "mililitros", 0)
	val aceite2: Aceites = Aceites("Media", "Aceite de oliva", "mililitros", 0)

	val menu: List<String> = listOf(
			aceite1.nombre(),
			aceite2.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Regresar")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				aceite1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(aceite1.itemReceta())
			}
			"2" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				aceite2.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(aceite2.itemReceta())
			}
			"3" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "3")
}

fun nuevaRecetaAgua(receta: Recetas) {
	val agua1: Agua = Agua(4, "Agua mineral", "mililitros", 0)
	val agua2: Agua = Agua(6, "Agua filtrada", "mililitros", 0)

	val menu: List<String> = listOf(
			agua1.nombre(),
			agua2.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Regresar")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				agua1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(agua1.itemReceta())
			}
			"2" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				agua2.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(agua2.itemReceta())
			}
			"3" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "3")
}

fun nuevaRecetaCarnes(receta: Recetas) {
	val carne1: Carnes = Carnes("Cerdo", "Carne de cerdo", "gramos", 0)
	val carne2: Carnes = Carnes("Res", "Carne de res", "gramos", 0)

	val menu: List<String> = listOf(
			carne1.nombre(),
			carne2.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Regresar")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				carne1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(carne1.itemReceta())
			}
			"2" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				carne2.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(carne2.itemReceta())
			}
			"3" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "3")
}

fun nuevaRecetaCereales(receta: Recetas) {
	val cereal1: Cereales = Cereales("Manual", "Arroz", "gramos", 0)
	val cereal2: Cereales = Cereales("Manual", "Avena", "gramos", 0)
	val cereal3: Cereales = Cereales("Manual", "Maiz", "gramos", 0)
	val cereal4: Cereales = Cereales("Manual", "Trigo", "gramos", 0)

	val menu: List<String> = listOf(
			cereal1.nombre(),
			cereal2.nombre(),
			cereal3.nombre(),
			cereal4.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Regresar")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				cereal1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(cereal1.itemReceta())
			}
			"2" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				cereal2.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(cereal2.itemReceta())
			}
			"3" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				cereal3.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(cereal3.itemReceta())
			}
			"4" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				cereal4.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(cereal4.itemReceta())
			}
			"5" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "5")
}

fun nuevaRecetaFrutas(receta: Recetas) {
	val fruta1: Frutas = Frutas("Normal", "Banano", "gramos", 0)
	val fruta2: Frutas = Frutas("Normal", "Cereza", "gramos", 0)
	val fruta3: Frutas = Frutas("Normal", "Fresa", "gramos", 0)
	val fruta4: Frutas = Frutas("Normal", "Manzana", "gramos", 0)
	val fruta5: Frutas = Frutas("Normal", "Naranja", "gramos", 0)
	val fruta6: Frutas = Frutas("Normal", "Pera", "gramos", 0)

	val menu: List<String> = listOf(
			fruta1.nombre(),
			fruta2.nombre(),
			fruta3.nombre(),
			fruta4.nombre(),
			fruta5.nombre(),
			fruta6.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Regresar")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				fruta1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(fruta1.itemReceta())
			}
			"2" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				fruta2.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(fruta2.itemReceta())
			}
			"3" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				fruta3.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(fruta3.itemReceta())
			}
			"4" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				fruta4.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(fruta4.itemReceta())
			}
			"5" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				fruta5.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(fruta5.itemReceta())
			}
			"6" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				fruta6.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(fruta6.itemReceta())
			}
			"7" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "7")
}

fun nuevaRecetaGranos(receta: Recetas) {
	val grano1: Granos = Granos("Uno", "Frijoles", "gramos", 0)
	val grano2: Granos = Granos("Uno", "Lentejas", "gramos", 0)
	val grano3: Granos = Granos("Uno", "Garbanzos", "gramos", 0)

	val menu: List<String> = listOf(
			grano1.nombre(),
			grano2.nombre(),
			grano3.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Regresar")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				grano1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(grano1.itemReceta())
			}
			"2" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				grano2.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(grano2.itemReceta())
			}
			"3" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				grano3.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(grano3.itemReceta())
			}
			"4" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "4")
}

fun nuevaRecetaHuevos(receta: Recetas) {
	val huevos1: Huevos = Huevos("AA", "Huevos AA", "unidad", 0)

	val menu: List<String> = listOf(
			huevos1.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Regresar")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				huevos1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(huevos1.itemReceta())
			}
			"2" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "2")
}

fun nuevaRecetaLacteos(receta: Recetas) {
	val lacteo1: Lacteos = Lacteos("Uno", "Leche entera", "mililitros", 0)
	val lacteo2: Lacteos = Lacteos("Uno", "Crema de leche", "mililitros", 0)

	val menu: List<String> = listOf(
			lacteo1.nombre(),
			lacteo2.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Regresar")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				lacteo1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(lacteo1.itemReceta())
			}
			"2" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				lacteo2.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(lacteo2.itemReceta())
			}
			"3" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "3")
}

fun nuevaRecetaPescados(receta: Recetas) {
	val pescado1: Pescados = Pescados("Extra", "Atun", "gramos", 0)
	val pescado2: Pescados = Pescados("Extra", "Salmon", "gramos", 0)

	val menu: List<String> = listOf(
			pescado1.nombre(),
			pescado2.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Regresar")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				pescado1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(pescado1.itemReceta())
			}
			"2" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				pescado2.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(pescado2.itemReceta())
			}
			"3" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "3")
}

fun nuevaRecetaPollo(receta: Recetas) {
	val pollo1: Pollo = Pollo("Extra", "Pollo campesino", "gramos", 0)
	val pollo2: Pollo = Pollo("Extra", "Pollo criollo", "gramos", 0)

	val menu: List<String> = listOf(
			pollo1.nombre(),
			pollo2.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Regresar")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				pollo1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(pollo1.itemReceta())
			}
			"2" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				pollo2.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(pollo2.itemReceta())
			}
			"3" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "3")
}

fun nuevaRecetaVerduras(receta: Recetas) {
	val verdura1: Verduras = Verduras("OK", "Ajo", "gramos", 0)
	val verdura2: Verduras = Verduras("OK", "Cebolla", "gramos", 0)
	val verdura3: Verduras = Verduras("OK", "Tomate", "gramos", 0)
	val verdura4: Verduras = Verduras("OK", "Perejil", "gramos", 0)

	val menu: List<String> = listOf(
			verdura1.nombre(),
			verdura2.nombre(),
			verdura3.nombre(),
			verdura4.nombre()
	)

	do {
		var contador: Int = 0
		for ((index, item) in menu.withIndex()) {
			println("${index + 1}. $item")
			contador = index
		}
		println("${contador + 2}. Salir")

		println("Digite opción")
		val response:String? = readLine()

		when (response) {
			"1" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				verdura1.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(verdura1.itemReceta())
			}
			"2" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				verdura2.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(verdura2.itemReceta())
			}
			"3" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				verdura3.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(verdura3.itemReceta())
			}
			"4" -> {
				println("Indique cantidad")
				val cantidad: String? = readLine()
				verdura4.agregarCantidad(cantidad.toString().toInt())
				receta.agregarIngrediente(verdura4.itemReceta())
			}
			"5" -> println("")
			else -> println("Opción no valida")
		}
	}while (response != "5")
}

fun verReceta(libroRecetas: MutableList<MutableList<String>>) {

	for ((index, item) in libroRecetas.withIndex()) {
		println("${index + 1}. $item \n")
	}
}
