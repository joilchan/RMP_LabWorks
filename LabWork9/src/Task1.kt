fun main() {
    val names = mutableListOf("Иван", "Мария", "Алексей")

    println("Сколько имен вы хотите добавить?")
    val n = readLine()!!.toInt()

    repeat(n) {
        print("Введите имя ${it + 1}: ")
        val name = readLine()!!
        names.add(name)
    }

    println("\nСписок имен:")
    names.forEachIndexed { index, name ->
        println("${index + 1} – $name")
    }

    println("Количество элементов: ${names.size}")
}