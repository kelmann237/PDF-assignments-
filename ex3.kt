data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Alice", 25),
        Person("Bob", 30),
        Person("Charlie", 35),
        Person("Anna", 28),
        Person("Ben", 22),
        Person("David", 40)
    )

    // 1. Filter: Names starting with 'A' or 'B'
    // 2. Extract: Use .map to get only the ages
    val filteredAges = people
        .filter { it.name.startsWith("A") || it.name.startsWith("B") }
        .map { it.age }

    // 3. Calculate Average
    if (filteredAges.isNotEmpty()) {
        val averageAge = filteredAges.average()
        
        // 4. Format and Print (using String format for 1 decimal place)
        val formattedResult = "%.1f".format(averageAge)
        println("Average age: $formattedResult")
    } else {
        println("No matching people found.")
    }
}