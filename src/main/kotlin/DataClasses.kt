data class Teacher(
    val name: String, 
    val age: Int, 
    val gender: Gender,
    val teachSubject: Subject
){
}

enum class Gender{
    MALE,
    FEMALE
}
enum  class Subject {
    MATH,
    CHEMISTRY,
    BIOLOGY,
    COMPUTER_SCIENCE,
}



fun main()
{
    val teacherOne: Teacher = Teacher(
        name = "Taro", age = 25, gender = Gender.MALE,
        teachSubject = Subject.MATH
    )

    val teacherTwo: Teacher = Teacher(
        name = "Taro",
        age = 25,
        gender = Gender.MALE,
        teachSubject = Subject.MATH
    )

    println(teacherOne === teacherTwo)

    println("Teacher One is: ${teacherTwo.component3()}")

}