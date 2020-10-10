fun main() {

    sentenciaIf()
    sentenciaWhen()
}

fun sentenciaIf(){

    val myNumber: Int = 11

    if ( myNumber.equals(9) ){
        println( "Si, son iguales" )
    }else {
        println( "No, no son iguales" )
    }
}

fun sentenciaWhen(){

    val myNumber: Int = 6
    when(myNumber){
        in 1..5 -> println( "Si, esta entre 1 y 5" )
        in 1..3 -> println( "Si, esta entre 1 y 3" )
        !in 5..10 -> println( "No, no esta entre 5 y 10" )
        else -> println( "No esta en ninguno de los rangos anteriores" )
    }
}