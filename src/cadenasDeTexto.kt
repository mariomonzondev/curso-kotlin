fun main() {

    cadenaDeTexto()
    rawString()
}

fun cadenaDeTexto(){

    val name:    String = "Miguel"
    val surname: String = "Santana"

    println( name )
    println( surname )
    println( "Su nombre es \n$name $surname" )

}

fun rawString(){

    val paragraph: String = """
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer in tristique ipsum. Phasellus 
        ut sollicitudin sapien. Quisque vitae lacinia odio, quis imperdiet ante. Sed bibendum laoreet 
        nisl quis condimentum. Pellentesque ultricies dignissim erat ac fringilla. In ullamcorper urna 
        ut cursus pretium. Mauris aliquet tempor ornare. Suspendisse ut fringilla enim, in finibus lorem. 
        Fusce at magna ut nunc laoreet tristique ut ac mi. Praesent lacinia mi a sollicitudin convallis. 
        Proin lobortis commodo lacus at rutrum. Curabitur condimentum nibh tellus, eu venenatis tellus 
        iaculis iaculis.
    """.trimIndent()

    println( paragraph )

    val otherParagraph: String = """
        ** Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer in tristique ipsum. Phasellus 
        ** ut sollicitudin sapien. Quisque vitae lacinia odio, quis imperdiet ante. Sed bibendum laoreet 
        ** nisl quis condimentum. Pellentesque ultricies dignissim erat ac fringilla. In ullamcorper urna 
        ** ut cursus pretium. Mauris aliquet tempor ornare. Suspendisse ut fringilla enim, in finibus lorem. 
        ** Fusce at magna ut nunc laoreet tristique ut ac mi. Praesent lacinia mi a sollicitudin convallis. 
        ** Proin lobortis commodo lacus at rutrum. Curabitur condimentum nibh tellus, eu venenatis tellus 
        ** iaculis iaculis.
    """.trimIndent()

    println( otherParagraph.trimMargin("** ") )
}