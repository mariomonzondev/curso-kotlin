

const val URL: String = "www.google.es" // Las variables const siempre se declaran de manera Global
var otherNumber: Int = 3               // Es una mala práctica declarar variables var de manera Global
val myNumber: Int = 12

fun main() {

    variablesConstVal()
}

var n: Int = 3 // Variable de acceso global


fun variablesConstVal(){

    // VAR
    otherNumber = 15
    println( otherNumber ) // 15

    // VAL

    //myNumber = 21 // No se puede reasignar la variable
    println( myNumber )

    // CONST
    println(URL)
}