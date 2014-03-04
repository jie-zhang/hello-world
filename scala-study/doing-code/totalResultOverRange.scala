def totalResultOverRange(number: Int, codeBlock: Int => Int): Int = {
    var result = 0
    for(i <- 1 to number) {
        result += codeBlock(i)
    }
    
    result
}

// sum
println(totalResultOverRange(100, i => i))

// odd num sum
println(totalResultOverRange(100, i => if(i % 2 == 1) i else 0))

// even num count
println(totalResultOverRange(100, i => if(i % 2 == 0) 1 else 0))


