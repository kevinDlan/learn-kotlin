package org.example
import Dog
import Pet
import User

fun main() {

    val user = User(name= "Kevin KONE", age = 10)

    val milou: Pet = Dog("Milou")

    user.setAge(20)

    println(user.getName)
    println(user.getAge())

    print(user.userInfo())

    println(user.toString())

    print(milou.getName())

}

//https://kotlinlang.org/docs/getting-started.html#choose-your-kotlin-use-case