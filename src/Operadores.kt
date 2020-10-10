fun main() {

    operadoresUnarios()
    operadoresBinarios()
}

fun operadoresUnarios(){
    val a: Int = 12
    val b: Int = 3
    val c: Boolean = true

    println( "Operadores Unarios" )
    println( a.unaryPlus() )    // +12
    println( b.unaryMinus() )   // -3
    println( a.inc() )          // 13
    println( b.dec() )          // 2
    println( c.not() )          // falsa
}

fun operadoresBinarios(){
    val a: Int = 12
    val b: Int = 3

    println( "Operadores Binarios" )
    println( a.plus(b) )    // 15
    println( a.minus(b) )   // 9
    println( a.times(b) )   // 36
    println( a.div(b) )     // 4
    println( a.rem(b) )     // 0
}

