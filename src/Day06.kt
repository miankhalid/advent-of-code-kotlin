fun main() {
    val input = readInput("files/day6-input")
    part1(input)
    part2(input)
}

fun part2(input: List<String>) {
    val time = input[0].split("\\s+".toRegex()).drop(1).joinToString("").toLong()
    val maxDistance = input[1].split("\\s+".toRegex()).drop(1).joinToString("").toLong()
    var ways = 0

    for (i in 1..time) {
        val distance = i * (time - i)
        if (distance > maxDistance) {
            ways++
        }
    }
    println("Part2: Final Answer is $ways")
}

fun part1(input: List<String>) {
    val times = input[0].split("\\s+".toRegex()).drop(1).map(String::toInt)
    val distances = input[1].split("\\s+".toRegex()).drop(1).map(String::toInt)
    val records = times.zip(distances)
    var finalAnswer = 1

    for (record in records) {
        val maxDistance = record.second
        var ways = 0
        for (i in 1..record.first) {
            val distance = i * (record.first - i)
            if (distance > maxDistance) {
                ways++
            }
        }
        finalAnswer *= ways
        println("Ways in $record are $ways")
    }
    println("Part1: Final Answer is $finalAnswer")
}
