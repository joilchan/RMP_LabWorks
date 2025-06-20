fun main(){
    // Тест 5.1 - 5.2
    val person = Person("Иисус отче наш", 2025)
    val student = Student("Гриша", 20, "ИСПП35")

    println(person.toString())
    println(student.toString())
    println()

    person.printInfo()
    println()
    student.printInfo()

    println()

    // Тест 5.3 - 5.5
    val rectangle = Rectangle(5.0, 3.0)
    rectangle.printInfo()
    rectangle.Print()
}