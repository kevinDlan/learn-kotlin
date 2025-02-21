
//let
//run
//with
//apply
//also


fun main()
{


    val user: User? = User("Test", 100)


    user?.let {
        println(it.getName)
        println(it.getAge())
    }


    //run
    val sb = StringBuilder()

    sb.append("Hello")
    sb.append(" world")

    val str2 = sb.run {
        //this.toString()
        this.append(" username")
        append(" password")
        toString()
    }

    val str3 = with(user){
        "name : teste "
    }

    println(str3)
}