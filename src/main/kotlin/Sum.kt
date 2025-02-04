

fun sum(a: Int, b: Int): Int {

    return a + b;
}

fun isPair(num:Int): Boolean {
    return num%2 == 0
}

fun division(a: Int, b: Int): Number {

    try {
        return (a / b).toDouble()
    }catch (e:Exception){
        println(e.message)
        return -1
    }
}

fun sums(vararg numbers:Int) : Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}