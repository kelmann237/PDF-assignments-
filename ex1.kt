
fun processList(
    numbers: List<Int>,
    predicate: (Int) -> Boolean
): List<Int> {
    val result = mutableListOf<Int>()
    
    for (item in numbers) {
        // Invoke the lambda on the current item
        if (predicate(item)) {
            result.add(item)
        }
    }
    
    return result
}

fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6)
    
    // Testing the function with a lambda that checks for even numbers
    val even = processList(nums) { it % 2 == 0 }
    
    println(even) // Expected Output: [2, 4, 6]
}