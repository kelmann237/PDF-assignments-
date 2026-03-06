fun main() {
    val words = listOf("Apple", "Banana", "Kiwi", "Strawberry", "Pear", "Grapefruit")

    // 1. Create a map: Key = Word, Value = Length
    // We use .associateWith { it.length } to build this easily
    val wordLengthMap: Map<String, Int> = words.associateWith { it.length }

    println("Full Map: $wordLengthMap")

    // 2. Print only entries where the length is greater than 4
    println("\nEntries with length > 4:")
    for ((word, length) in wordLengthMap) {
        if (length > 4) {
            println("$word: $length")
        }
    }
}