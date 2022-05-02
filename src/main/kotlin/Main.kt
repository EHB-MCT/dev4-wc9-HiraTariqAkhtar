fun main(args: Array<String>) {
    val reader = FileReader();

    //println(reader.getPuzzle1())
    val puzzle1 = reader.getPuzzle1()
    oef1a(puzzle1)
    oef1b(puzzle1)

    //println(reader.getPuzzle2())
    //println(reader.getPuzzle3())
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())
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