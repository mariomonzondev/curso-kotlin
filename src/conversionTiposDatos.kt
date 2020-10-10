/*

    String a Int e Int a String
    Long a Int e Int a Long
    String to Int, and Int to String Conversion
    Double a Int e Int a Double
    Long a Double y Double a Long
    Char a Int e Int a Char
    String a Long y Long a String
    String a Array y Array a String
    String a Boolean y Boolean a String
    String a Byte y Byte a String
    Int a Byte y Byte a Int

*/

fun main() {

    conversion()
}

fun conversion(){

    val myNumber: Int = 345

    println( myNumber.toByte() )    //89
    println( myNumber.toShort() )   // 345
    println( myNumber.toLong() )    // 345
    println( myNumber.toFloat() )   // 345.0
    println( myNumber.toDouble() )  // 345.0
    println( myNumber.toChar() )    // ř
    println( myNumber.toString() )  // 345
}
