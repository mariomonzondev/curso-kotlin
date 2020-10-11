import java.lang.NullPointerException

fun main() {

    doubleBangTryCatch()
    llamadaSegura()
}

fun doubleBangTryCatch(){

    //Double Bang - try-catch
    try {
        //Declarar variables de valor null
        var computer: String?
        computer = null

        var computerLength: Int = computer!!.length // Si usamos Double Bang, necesitamos usar try catch
    }catch (e: NullPointerException){
        println( "Introduce un valor. No esta permitido valores nulos" )
    }
}

fun llamadaSegura(){

    //Llamada segura
    var computer: String? = null
    var computerLength: Int? = computer?.length
    println( "Longitud: $computerLength" )

    //Operador Elvis
    var keyboard: String? = null
    val keyboardLength: Int = keyboard?.length ?: 0
    println( keyboardLength )

    //Listas con valores null
    val listWithNulls: List<Int?> = listOf<Int?>(7, null, null, 4)
    println( "Lista con Null: $listWithNulls" )

    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println( listWithoutNulls )
}