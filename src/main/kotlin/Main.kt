fun main(args: Array<String>) {
    println("Hello World!")

    // Kotlin Variables
    val name: String = "Manggala"
    val age: Int = 29
    val price: Long = 399
    val flag: Boolean = false

    println(name)
    println(age)
    println(price)
    println(flag)

    // Kotlin Array
    val collection = arrayOf("Andra", "Andi", "Manggala")

    for (i in collection.indices) {
        println(collection[i])
    }

    val fruits: MutableList<String> = ArrayList()
    fruits.add("Durian")
    fruits.add("Jackfruit")
    fruits.add("Apple")

    println(fruits)

    // Kotlin conditions and loops
    val branch: String = "Jakarta"

    // If else conditions
    if (branch == "Jakarta") {
        println("Jakarta branch")
    } else {
        println("Not jakarta branch")
    }

    // Switch case
    when(branch) {
        "Jakarta" -> println("Jakarta branch")
        else -> {
            println("Not jakarta branch")
        }
    }




}