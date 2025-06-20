fun main() {
    // Геометрическая прогрессия
    println("n-ый член геометрической прогрессии (n=5): ${geometricProgression(5)}")
    println("n-ый член геометрической прогрессии (n=5, a1=3, q=4): ${geometricProgression(5, 3, 4)}")
}

fun geometricProgression(n: Int, a1: Int = 1, q: Int = 2): Int {
    return a1 * Math.pow(q.toDouble(), (n - 1).toDouble()).toInt()
}