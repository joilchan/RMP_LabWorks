fun main() {
    val numbers = mutableListOf<Int>()

    print("Сколько чисел вы хотите ввести? ")
    val n = readLine()!!.toInt()

    repeat(n) {
        print("Введите число ${it + 1}: ")
        numbers.add(readLine()!!.toInt())
    }

    val index100 = numbers.indexOf(100)
    println("\nИндекс элемента со значением 100: ${if (index100 >= 0) index100 else "не найден"}")
    println("Сумма: ${numbers.sum()}")
    println("Среднее: ${numbers.average()}")
    println("Все ли числа > 0? ${numbers.all { it > 0 }}")
    println("Нечетные значения: ${numbers.filter { it % 2 != 0 }}")
}