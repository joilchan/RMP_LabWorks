class Rectangle(val width: Double, val height: Double) : Figure(), IFigure, IPrinter {
    override val name: String
        get() = "Прямоугольник"

    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)

    override fun printInfo() {
        println("Название: $name")
        println("Ширина: $width")
        println("Высота: $height")
        println("Площадь: ${area()}")
        println("Периметр: ${perimeter()}")
    }

    override fun Print() {
        println("Вывод всех свойств прямоугольника:")
        println("Ширина: $width")
        println("Высота: $height")
        println("Площадь: ${area()}")
        println("Периметр: ${perimeter()}")
    }
}