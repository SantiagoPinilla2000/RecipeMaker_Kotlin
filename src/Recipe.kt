import com.sun.org.apache.bcel.internal.generic.SWITCH

fun main(args : Array<String>){
    //RecipeMaker_2020
    println("----------Bienvenido a Recipe Maker---------- \n¿Que te apetece preparar hoy?")
    begin()
}
fun begin(){
    println("Seleccione una de las siguientes opciones:" +
            "\n1. Hacer una receta.\n2. Ver mis recetas.\n3.Salir")
    val respuestaUsuario : String? = readLine()

    when(respuestaUsuario){
        "1" -> receta()
        "2" -> verReceta()
        "3" -> println("\nGracias, Vuelve pronto y nunca pares de cocinar ;)")
        else -> println("Selecciona una opcion valida."+ begin())
    }
}
fun receta(){
    val ingredientes: List<String> = listOf("1. Agua\n" +
            "2. Leche\n" +
            "3. Carne\n" +
            "4. Verduras\n" +
            "5. Frutas\n" +
            "6. Cereal\n" +
            "7. Huevos\n" +
            "8. Aceite")
    println("Selecciona los ingredientes: $ingredientes")
    val respuestaUsuario2: String? = readLine()
    if (respuestaUsuario2 == "1"){
        val agua = "Agua"
        println(agua)
    }
    if (respuestaUsuario2 == "2"){
        val leche = "Leche"
        println(leche)
    }
    if (respuestaUsuario2 == "3"){
        val carne = "Carne"
        println(carne)
    }
    if (respuestaUsuario2 == "4"){
        val verduras = "Verduras"
        println(verduras)
    }
    if (respuestaUsuario2 == "5"){
        val frutas = "Frutas"
        println(frutas)
    }
    if (respuestaUsuario2 == "6"){
        val cereal = "Cereal"
        println(cereal)
    }
    if (respuestaUsuario2 == "7"){
        val huevos = "Huevos"
        println(huevos)
    }
    if (respuestaUsuario2 == "8"){
        val aceite = "Aceite"
        println(aceite)
    }
    else{
        println("\nPor favor selecciona una opcion valida. Presiona ENTER para continuar")
        val enter: String? = readLine()
        receta()
    }

}
fun verReceta(){
    println("Aqui estan tus recetas:\nPor el momento se encuentra vacia la lista de tus recetas.")
    begin()
}

