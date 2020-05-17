val recetas = mutableListOf<String>()

fun main(args: Array<String>) {
    inicio()
}

fun inicio () {
    val menuPrincipal = """
        ╔═══════════════════════════════════════╗
        ║ ***   Bienvenido a Recipe Maker   *** ║
        ╠═══════════════════════════════════════╣
        ║                                       ║
        ║     1.  Hacer una receta              ║
        ║     2.  Ver mis recetas               ║
        ║     3.  Salir                         ║
        ║                                       ║
        ╠═══════════════════════════════════════╣
        ║     Digita una opción                 ║
        ╚═══════════════════════════════════════╝
    """.trimIndent()

    do {
        println(menuPrincipal)
        val response:String? = readLine()


        when (response) {
            "1" -> nuevaReceta()
            "2" -> verReceta(recetas)
            "3" -> salir()
            else -> println("Opción no valida")
        }
    }while (response != "3")
}

fun nuevaReceta () {
    val menuNuevaReceta = """
        ╔═══════════════════════════════════════╗
        ║ ***  Ingredientes - Nueva Receta  *** ║
        ╠═══════════════════════════════════════╣
        ║                                       ║
        ║     1.  Agua                          ║
        ║     2.  Leche                         ║
        ║     3.  Carne                         ║
        ║     4.  Verduras                      ║
        ║     5.  Frutas                        ║
        ║     6.  Cereal                        ║
        ║     7.  Huevos                        ║
        ║     8.  Aceite                        ║
        ║     9.  Salir                         ║
        ║                                       ║
        ╠═══════════════════════════════════════╣
        ║     Digita una opción para agregar    ║ 
        ║     un ingrediente                    ║
        ╚═══════════════════════════════════════╝
    """.trimIndent()

    do {
        println(menuNuevaReceta)
        val responseMenuNR:String? = readLine()

        when (responseMenuNR) {
            "1" -> recetas.add("Agua")
            "2" -> recetas.add("Leche")
            "3" -> recetas.add("Carne")
            "4" -> recetas.add("Verduras")
            "5" -> recetas.add("Frutas")
            "6" -> recetas.add("Cereal")
            "7" -> recetas.add("Huevos")
            "8" -> recetas.add("Aceite")
            "9" -> inicio()
            else -> println("Opción no valida")
        }
    }while (responseMenuNR != "9")

}

fun verReceta (recetass: MutableList<String> = mutableListOf<String>()) {
    println(":: Ver receta ::")
    recetass.withIndex().forEach{
        println("${it.index} --> ${it.value}")
    }
}

fun salir() {
    println(":: Que vuelva pronto, hasta luego ::")
}