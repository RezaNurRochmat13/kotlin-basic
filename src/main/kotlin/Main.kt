import entity.Person

fun main() {
    println("Hello World!")

    val person1 = Person("Andra", 29, "California")

    println(person1.name)
    println(person1.age)
    println(person1.address)
    person1.speak()


}