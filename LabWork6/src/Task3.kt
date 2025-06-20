fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    
    println("Размах: ${range(*numbers)}")
}

fun range(vararg nums: Int): Int {
    return nums.maxOrNull()!! - nums.minOrNull()!!
}