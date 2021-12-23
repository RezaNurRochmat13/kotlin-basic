package entity

open class Person(var name: String, var age: Int, val address: String) {
    fun speak() {
        println("Speak up")
    }

    fun eat(food: String) {
        println("Eat food $food")
    }

    fun eat(food: Int) {
        println("Eat food $food")
    }
}