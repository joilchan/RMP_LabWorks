import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    //task 1
//    println("Введите номер месяца (1-12):")
//    val month = readLine()?.toIntOrNull()
//
//    when (month) {
//        12, 1, 2 -> println("Зима")
//        3, 4, 5 -> println("Весна")
//        6, 7, 8 -> println("Лето")
//        9, 10, 11 -> println("Осень")
//        else -> println("Такого месяца нет")
//    }

    //task2
    println("Введите год:")
    val year = readLine()?.toIntOrNull()
    println("Введите номер месяца (1-12):")
    val month = readLine()?.toIntOrNull()

    if (year != null && month != null) {
        val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
        val daysInMonth = when (month) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            2 -> if (isLeapYear) 29 else 28
            else -> 0
        }

        println("Год ${year} ${if (isLeapYear) "високосный" else "не високосный"}")
        println("Количество дней в месяце: $daysInMonth")
    } else {
        println("Некорректный ввод")
    }

    //task 3
    val dollarRate = 75.0
    val euroRate = 85.0

    println("Введите сумму в рублях:")
    val rubles = readLine()?.toDoubleOrNull()
    println("Введите валюту для конвертации (доллары/евро):")
    val currency = readLine()

    if (rubles != null) {
        val convertedAmount = when (currency?.lowercase(getDefault())) {
            "доллары" -> rubles / dollarRate
            "евро" -> rubles / euroRate
            else -> {
                println("Некорректная валюта")
                rubles
            }
        }
        println("Сумма в валюте: ${"%.2f".format(convertedAmount)}")
    } else {
        println("Некорректный ввод суммы")
    }

    //task 4
    println("Введите значение a:")
    val a = readLine()?.toDoubleOrNull()
    println("Введите значение x:")
    val x = readLine()?.toDoubleOrNull()

    if (a != null && x != null) {
        val result = when {
            x < -10 -> a * x * x
            x in -10.0..10.0 -> a * Math.abs(x)
            else -> if (a - x != 0.0) 1 / (a - x) else "Деление на ноль невозможно"
        }

        if (result is Double) {
            println("Результат: ${"%.3f".format(result)}")
        } else {
            println(result)
        }
    } else {
        println("Некорректный ввод")
    }

    //task 5
    println("Введите сумму покупки:")
    val purchaseAmount = readLine()?.toIntOrNull()
    println("Введите внесенную сумму:")
    val paidAmount = readLine()?.toIntOrNull()

    if (purchaseAmount != null && paidAmount != null) {
        val discount = when {
            purchaseAmount > 5000 -> 0.10
            purchaseAmount > 1000 -> 0.05
            else -> 0.0
        }
        val finalAmount = purchaseAmount * (1 - discount)
        val change = paidAmount - finalAmount

        println("Сумма к оплате: ${finalAmount}")
        when {
            change < 0 -> println("Требуется доплатить: ${-change}")
            change > 0 -> println("Возьмите сдачу: ${change}")
            else -> println("Спасибо!")
        }
    } else {
        println("Некорректный ввод")
    }
}