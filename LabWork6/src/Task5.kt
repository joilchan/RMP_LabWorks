fun main() {
    // Тестирование функции
    val number1 = -5
    val number2 = 3
    val number3 = 0

    println("Модуль числа $number1: ${absoluteValue(number1)}")
    println("Модуль числа $number2: ${absoluteValue(number2)}")
    println("Модуль числа $number3: ${absoluteValue(number3)}")
}

// Однострочная функция для вычисления модуля числа
fun absoluteValue(num: Int): Int = if (num < 0) -num else num