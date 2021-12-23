import entity.Teacher

fun main() {
    println("Hello World!")

    val teacher = Teacher("Wulan", 22, "Sleman")

    println(teacher.name)
    println(teacher.age)
    println(teacher.address)
    teacher.speak()
    teacher.eat("Pizza")
    teacher.eat(21)


}