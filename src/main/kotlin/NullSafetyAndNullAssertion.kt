
fun main() {

    var nullableString: String? = null

    val stringLength = nullableString?.length ?: 0

    println("Length is $stringLength")


    if(nullableString != null) {
        val newLength = nullableString!!.length
    }
}