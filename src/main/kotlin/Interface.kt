interface People {

    //abstract method
    fun talk ();

    //concrete method
    fun move () {
        println("People can walk for moving")
    }

    val name:String;

    val  gender:String
         get() = "man"
}


//use of interfaces

class Man() : People {
    override fun talk() {}

    override fun move() {}

    override val name = "User"
}