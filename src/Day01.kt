fun main() {
    val digits = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    val numeralsMap = mapOf(
        "zero" to "z0o", "one" to "o1e","two" to "t2o","three" to "t3e","four" to "f4r",
        "five" to "f5e","six" to "s6x","seven" to "s7n","eight" to "e8t","nine" to "n9e")

    val input = readInput("files/input-day-1")
    var sum = 0
    for (s in input) {
        var replaceableString = s
        for (pair in numeralsMap) {
            replaceableString = replaceableString.replace(pair.key, pair.value)
        }
        val char1 = replaceableString.split("").find {it in digits}
        val char2 = replaceableString.split("").findLast {it in digits}

        val reading = char1 + char2
        sum += reading.toInt()
        println("$replaceableString --> $reading --> $sum")

    }
}
