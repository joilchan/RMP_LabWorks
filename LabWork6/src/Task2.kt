fun main() {

    println("Площадь круга (радиус=3): ${areaCircle(3.0)}")

    println("Площадь эллипса (большая полуось=4, малая полуось=2): ${areaEllipse(4.0, 2.0)}")
}

// круг
fun areaCircle(radius: Double): Double {
    return Math.PI * radius * radius
}

// эллипс
fun areaEllipse(a: Double, b: Double): Double {
    return Math.PI * a * b
}