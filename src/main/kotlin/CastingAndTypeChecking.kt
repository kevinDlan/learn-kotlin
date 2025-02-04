fun castingAndTypeChecking(obj: Any)
{
    when (obj) {
        is String ->
        {
            println("Obj is String and his length is ${obj.length}")
        }
        is Int -> {
            println("Obj is Int and his is $obj")
        }
    }
}


val name: Any = "Hello"
val num : Any = "100"
//val numTwo: Int = num.toInt()
val numThree: Int = num as Int

val greeting: String = name as String