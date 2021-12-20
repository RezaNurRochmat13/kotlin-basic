package entity

class Person(var name: String, var age: Int, val address: String) {
    fun speak() {
        println("Speak up")
    }
}