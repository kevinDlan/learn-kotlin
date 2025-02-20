fun main () {

    val square : (Int) -> Int = { value -> value * value }


    val squareTwo : (Int) -> Int = { it * it}


    val printMessage = { message: String -> "Message" }


    val sumWithReceiver : Int.(Int) -> Int = { this + 1 }


    val number = 10

    number.sumWithReceiver(10)


    val funInterFaceImplement : MyFunctionInterface = MyFunctionInterface {

    }

    funInterFaceImplement.execute()
}


fun interface  MyFunctionInterface {
    fun execute()

    //fun doSomething()
   /** fun doSomething(){
        println("doSomething")
    }**/
}