import com.sun.org.apache.bcel.internal.generic.SWITCH

fun main(args: Array<String>) {
    //RecipeMaker_2020
    println("----------Bienvenido a Recipe Maker---------- \n¿Que te apetece preparar hoy?")
    begin()
}

fun begin() {
    println(
        "Seleccione una de las siguientes opciones:" +
                "\n1. Hacer una receta.\n2. Ver mis recetas.\n3.Salir"
    )
    val respuestaUsuario: String? = readLine()

    when (respuestaUsuario) {
        "1", "hacer una receta" -> makeRecipe()
        "2", "ver mis recetas" -> viewRecipe()
        "3", "salir" -> println("\nGracias, Vuelve pronto y nunca pares de cocinar ;)")
        else -> println("Selecciona una opcion valida. ${begin()}")
    }
}

val ingredientes: Array<String> =
    arrayOf("Agua.", "Leche.", "Carne.", "Verduras.", "Frutas.", "Cereal.", "Huevos.", "Aceite.")

fun makeRecipe() {

    println("Selecciona los ingredientes:\n")
    for (i in ingredientes) {
        println("$i")
    }
    println("\n¿Cual de los ingredientes quieres utilizar?:\n")
    val respuestaUsuario2: String? = readLine()
    if (respuestaUsuario2.equals("1") || respuestaUsuario2.equals("agua")) {
        println("El ingrediente que seleccionaste es: ${ingredientes[0]}")
        println(
            "\n¿Deseas continuar y ver tus recetas o quieres salir del sistema?" +
                    "\n1. Continuar a recetas" +
                    "\n2. Salir"
        )
        val respuestaUsuario3: String? = readLine()
        if (respuestaUsuario3.equals("1") || respuestaUsuario3.equals("continuar a recetas")) {
            viewRecipe()
        }
        else if (respuestaUsuario3.equals("2") || respuestaUsuario3.equals("salir")) {
            println("\nGracias, Vuelve pronto y nunca pares de cocinar ;)")
        }
    }
    else if (respuestaUsuario2.equals("2") || respuestaUsuario2.equals("leche")) {
        println("El ingrediente que seleccionaste es: ${ingredientes[1]}")
        println(
            "\n¿Deseas continuar y ver tus recetas o quieres salir del sistema?" +
                    "\n1. Continuar a recetas" +
                    "\n2. Salir"
        )
        val respuestaUsuario3: String? = readLine()
        if (respuestaUsuario3.equals("1") || respuestaUsuario3.equals("continuar a recetas")) {
            viewRecipe()
        }
        else if (respuestaUsuario3.equals("2") || respuestaUsuario3.equals("salir")) {
            println("\nGracias, Vuelve pronto y nunca pares de cocinar ;)")
        }
    }
    else if (respuestaUsuario2.equals("3") || respuestaUsuario2.equals("carne")) {
        println("El ingrediente que seleccionaste es: ${ingredientes[2]}")
        println(
            "\n¿Deseas continuar y ver tus recetas o quieres salir del sistema?" +
                    "\n1. Continuar a recetas" +
                    "\n2. Salir"
        )
        val respuestaUsuario3: String? = readLine()
        if (respuestaUsuario3.equals("1") || respuestaUsuario3.equals("continuar a recetas")) {
            viewRecipe()
        }
        else if (respuestaUsuario3.equals("2") || respuestaUsuario3.equals("salir")) {
            println("\nGracias, Vuelve pronto y nunca pares de cocinar ;)")
        }
    }
    else if (respuestaUsuario2.equals("4") || respuestaUsuario2.equals("verduras")) {
        println("El ingrediente que seleccionaste es: ${ingredientes[3]}")
        println(
            "\n¿Deseas continuar y ver tus recetas o quieres salir del sistema?" +
                    "\n1. Continuar a recetas" +
                    "\n2. Salir"
        )
        val respuestaUsuario3: String? = readLine()
        if (respuestaUsuario3.equals("1") || respuestaUsuario3.equals("continuar a recetas")) {
            viewRecipe()
        }
        else if (respuestaUsuario3.equals("2") || respuestaUsuario3.equals("salir")) {
            println("\nGracias, Vuelve pronto y nunca pares de cocinar ;)")
        }
    }
    else if (respuestaUsuario2.equals("5") || respuestaUsuario2.equals("frutas")) {
        println("El ingrediente que seleccionaste es: ${ingredientes[4]}")
        println(
            "\n¿Deseas continuar y ver tus recetas o quieres salir del sistema?" +
                    "\n1. Continuar a recetas" +
                    "\n2. Salir"
        )
        val respuestaUsuario3: String? = readLine()
        if (respuestaUsuario3.equals("1") || respuestaUsuario3.equals("continuar a recetas")) {
            viewRecipe()
        }
        else if (respuestaUsuario3.equals("2") || respuestaUsuario3.equals("salir")) {
            println("\nGracias, Vuelve pronto y nunca pares de cocinar ;)")
        }
    }
    else if (respuestaUsuario2.equals("6") || respuestaUsuario2.equals("cereal")) {
        println("El ingrediente que seleccionaste es: ${ingredientes[5]}")
        println(
            "\n¿Deseas continuar y ver tus recetas o quieres salir del sistema?" +
                    "\n1. Continuar a recetas" +
                    "\n2. Salir"
        )
        val respuestaUsuario3: String? = readLine()
        if (respuestaUsuario3.equals("1") || respuestaUsuario3.equals("continuar a recetas")) {
            viewRecipe()
        }
        else if (respuestaUsuario3.equals("2") || respuestaUsuario3.equals("salir")) {
            println("\nGracias, Vuelve pronto y nunca pares de cocinar ;)")
        }
    }
    else if (respuestaUsuario2.equals("7") || respuestaUsuario2.equals("huevos")) {
        println("El ingrediente que seleccionaste es: ${ingredientes[6]}")
        println(
            "\n¿Deseas continuar y ver tus recetas o quieres salir del sistema?" +
                    "\n1. Continuar a recetas" +
                    "\n2. Salir"
        )
        val respuestaUsuario3: String? = readLine()
        if (respuestaUsuario3.equals("1") || respuestaUsuario3.equals("continuar a recetas")) {
            viewRecipe()
        }
        else if (respuestaUsuario3.equals("2") || respuestaUsuario3.equals("salir")) {
            println("\nGracias, Vuelve pronto y nunca pares de cocinar ;)")
        }
    }
    else if (respuestaUsuario2.equals("8") || respuestaUsuario2.equals("aceite")) {
        println("El ingrediente que seleccionaste es: ${ingredientes[7]}")
        println(
            "\n¿Deseas continuar y ver tus recetas o quieres salir del sistema?" +
                    "\n1. Continuar a recetas" +
                    "\n2. Salir"
        )
        val respuestaUsuario3: String? = readLine()
        if (respuestaUsuario3.equals("1") || respuestaUsuario3.equals("continuar a recetas")) {
            viewRecipe()
        }
        else if (respuestaUsuario3.equals("2") || respuestaUsuario3.equals("salir")) {
            println("\nGracias, Vuelve pronto y nunca pares de cocinar ;)")
        }
    } else {
        println("Por favor selecciona una opcion valida.")
        makeRecipe()
    }
}

fun viewRecipe() {
    println("Aqui estan tus recetas:\n")
    for (i in ingredientes) {
        println("$i")
    }
}

