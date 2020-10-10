import java.lang.NullPointerException

fun main() {

    bucleWhile()
    bucleDoWhile()
    bucleFor()
    bucleForeach()
    bucleForBreak()
    bucleForContinue()
    bucleForBreakLabel()
    bucleForContinueLabel()
}

fun bucleWhile(){

    var cont: Int = 1

    // while -> contadores
    while ( cont <= 5 ){
        println( "mensaje: $cont" )
        cont = cont.inc()
    }
}

fun bucleDoWhile(){

    var cont: Int = 1

    do{
        println( "Mensaje DoWhile: $cont" )
        cont = cont.inc()
    }while ( cont <= 5 )
}

fun bucleFor(){

    val daysOfWeek: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println("Bucle For")
    for ( day in daysOfWeek ){
        println(day)
    }

    println("Bucle For (con índice)")
    for ( (index,day) in daysOfWeek.withIndex() ){
        println( "${index.plus(1)}: $day" )
    }
}

fun bucleForeach(){

    var daysOfWeek = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")

    daysOfWeek.forEach{
        println(it)
    }
}

fun bucleForBreak(){

    println( "BREAK" )
    for(i in 1..3){
        println( "\ni: $i " )
        for ( j in 1..5 ){
            if( j.equals(3) ) break
            println( "j: $j" )
        }
    }
}

fun bucleForContinue(){

    println( "CONTINUE" )
    for ( i in 1..3 ){
        println( "\ni: $i " )
        for ( j in 1..5 ) {
            if ( j.equals(3) ) continue
            println( "j: $j" )
        }
    }
}

fun bucleForBreakLabel(){

    println( "BREAK / LABEL" )
    terminarTodoCiclo@ for( i in 1..3 ){
        println( "\ni: $i" )
        for( j in 1..3 ){
            println( "\nj: $j" )
            for ( k in 1..5 ){
                if ( k.equals(3) ) break@terminarTodoCiclo
                println("k: $k")
            }
        }
    }
}

fun bucleForContinueLabel(){

    println( "CONTINUE / LABEL" )
    terminarTodoCiclo@ for( i in 1..3 ){
        println( "\ni: $i" )
        for( j in 1..3 ){
            println( "\nj: $j" )
            for ( k in 1..5 ){
                if ( k.equals(3) ) continue@terminarTodoCiclo
                println("k: $k")
            }
        }
    }
}


