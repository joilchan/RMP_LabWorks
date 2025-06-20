open class Person(val name: String, val age: Int) {
    open val info: String
        get() = "Имя: $name\nВозраст: $age" // Свойство на чтение

    open fun printInfo() {
        println("Информация о человеке:")
        println(info)
    }

    override fun toString(): String {
        return "Person(name=$name, age=$age) // Родительская реализация"
    }
}