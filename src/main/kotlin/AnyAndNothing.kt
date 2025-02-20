fun main () {

     val obj: Any = "Hello"

    val str1 : String? = obj as? String

    val str2: String = obj as String

    val result = try {
        fail("")

    }catch (e : IllegalArgumentException){
        println(e.stackTrace.toString())
    }
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}