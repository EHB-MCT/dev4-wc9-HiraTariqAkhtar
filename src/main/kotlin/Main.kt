fun main(args: Array<String>) {
    val reader = FileReader();

    val puzzle1 = reader.getPuzzle1()
    //oef1a(puzzle1)
    //oef1b(puzzle1)

    val puzzle2 = reader.getPuzzle2()
    //oef2a(puzzle2)
    oef2b(puzzle2)

    //val puzzle3 = reader.getPuzzle3()

    //val puzzle4a = reader.getPuzzle4Numbers()

    //puzzle4b = reader.getPuzzle4Cards()
}

fun oef1a(p : List<Int>){
    var numberOfIncreasement = 0
    var previous = p[0]

    p.forEach{
        if (it > previous){
            numberOfIncreasement ++
        }
        previous = it
    }

    println(numberOfIncreasement)
}

fun oef1b(p: List<Int>){
    var increases = 0
    var prevNumber = p[0] + p[1] + p[2]
    p.forEachIndexed { index, i ->
        if (index + 2 in p.indices){
            var sum = p[index] + p[index +1] + p[index +2]
            if (sum > prevNumber){
                increases ++
            }
            prevNumber = sum
        }
    }
    println(increases)
}

fun oef2a(p: List<List<Any>>){
    var horizontalPosition = 0
    var depth = 0

    p.forEach {
        val dir = it[0] as String
        val amount = it[1] as Int

        when(dir){
            "forward" -> horizontalPosition += amount
            "up" -> depth -= amount
            "down" -> depth += amount
        }
    }

    println("H: $horizontalPosition , D: $depth")
    println("TOTAL: ${horizontalPosition * depth}")
}

fun oef2b(p: List<List<Any>>){
    var horizontalPosition = 0
    var depth = 0
    var aim = 0

    p.forEach {
        val dir = it[0] as String
        val amount = it[1] as Int
        var a = aim * amount

        if (dir == "forward"){
            horizontalPosition += amount
            depth += a
        } else if (dir == "up") {
            aim -= amount
        } else {
            aim += amount
        }
    }

    println("H: $horizontalPosition , D: $depth")
    println("TOTAL: ${horizontalPosition * depth}")
}

