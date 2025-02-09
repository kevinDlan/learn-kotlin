import java.util.*

class Person {
     var name: String = "kevin KONE"
         get() = field.uppercase(Locale.getDefault())
         set(value) { field = "person $value" }
     var age: Int = 0
         set(value) {
             if(value<0){
                 throw  IllegalArgumentException("Age can't be negative")
             }
             field = value
         }


    fun printInfo() {
        println("Name: $name , Age: $age")
    }
}

//Class with primary constructor
class AnotherPerson (
    private val name: String,
    private val age: Int
) {

    fun init (){
        println("Init: $name , Age: $age")
    }

    fun printInfo() {
        println("Name: $name , Age: $age")
    }
}

class User(private var name: String, private var age: Int) {

    init {
        if(age == 0){
            throw Exception("Invalid age")
        }
    }

    val getName: String get() = name
    fun getAge(): Int = age

    fun setName(name: String) {
        this.name = name;
    }

    fun setAge(age: Int) { this.age = age }

    fun userInfo(): String {
        return "Name: $name, Age: $age"
    }

}

open class Pet( private var name: String) {

    fun setName(newName: String) {
        name = newName;
    }

    open fun getName() = name;

}

class Dog(name: String) : Pet(name) {
}

fun main() {
    var personOne:Person = Person()

    personOne.age = -1

    println("Person One : ${personOne.name}")

    personOne.name = "James"

    println("Person One : ${personOne.name}")
}