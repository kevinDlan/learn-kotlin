package org.example
import Dog
import Pet
import User

fun main() {

    val user = User(name= "Kevin KONE", age = 20)
    val userOne = User(name= "Kevin KONE", age = 20)

    val milou: Pet = Dog("Milou")

    user.setAge(20)

    println(user.getName)
    println(user.getAge())

    print(user.userInfo())

    println(user.toString())

    println(milou.getName())

    println(user == userOne)

}

//https://kotlinlang.org/docs/getting-started.html#choose-your-kotlin-use-case
//https://www.youtube.com/watch?v=8uEYI6lTGps : Learn Kotlin for beginner
//https://www.youtube.com/watch?v=Og287zzOTEM :  Learn Kotlin RoadMap