
object  MySingleton {

    var name = "my_singleton"

    fun printName(){
        println("Name: $name")
    }
} 




fun main(){

    MySingleton.printName()

    people.talk()
}


val people = object: People {
    override fun talk() {
        TODO("Not yet implemented")
    }

    override val name: String
        get() = TODO("Not yet implemented")

}