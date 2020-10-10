fun main() {

    rangos()
}

fun rangos(){

    val oneToTen: IntRange          = 1..10
    val AtoH:     CharRange         = 'A'..'H'
    val tenToOne: IntProgression    = 10 downTo 1
    val HtoA:     CharProgression   = 'H' downTo 'A'

    println( "Del 1 al 10" )
    for ( i in oneToTen ){
        println(i)
    }

    println( "Del 10 al 1" )
    for ( i in tenToOne ){
        println(i)
    }

    println( "De la A a la H" )
    for ( letter in AtoH ){
        println( letter )
    }

    println( "De la H a la A" )
    for ( letter in HtoA ){
        println( letter )
    }

}