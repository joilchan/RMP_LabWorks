class Student(name: String, age: Int, val group: String) : Person(name, age) {
    override val info: String
        get() = super.info + "\nГруппа: $group"

    override fun printInfo() {
        println("Информация о студенте:")
        println(info)
    }

    override fun toString(): String {
        return super.toString() + " // Дочерняя реализация"
    }
}