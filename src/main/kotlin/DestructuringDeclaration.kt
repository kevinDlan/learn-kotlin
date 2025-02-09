fun main() {

    val teacherOne: Teacher = Teacher(
        name = "Taro", age = 25, gender = Gender.MALE,
        teachSubject = Subject.MATH
    )

    val (name, age, gender, _) = teacherOne

    println(name)
    println(age)
    println(gender)

}