fun main() {
    val books = mutableMapOf(
        "Война и мир" to "Лев Толстой",
        "Преступление и наказание" to "Фёдор Достоевский",
        "Мастер и Маргарита" to "Михаил Булгаков"
    )

    print("Сколько книг добавить? ")
    val n = readLine()!!.toInt()

    repeat(n) {
        print("Введите название книги: ")
        val title = readLine()!!
        print("Введите автора: ")
        val author = readLine()!!
        books[title] = author
    }

    println("\nСловарь книг:")
    books.forEach { (book, author) ->
        println("$book – $author")
    }
    println("Количество книг: ${books.size}")

    print("Введите название книги для поиска: ")
    val key = readLine()!!

    if (books.containsKey(key)) {
        println("Книга найдена: ${books[key]}")
    } else {
        println("Книга не найдена.")
    }

    print("Введите имя автора для подсчета совпадений: ")
    val author = readLine()!!
    val count = books.count { it.value == author }
    println("Совпадений: $count")

    print("Введите название книги для удаления: ")
    val keyToDelete = readLine()!!
    if (books.remove(keyToDelete) != null) {
        println("Книга удалена.")
    } else {
        println("Книга не найдена.")
    }

    println("Оставшиеся книги:")
    books.forEach { (book, auth) -> println("$book – $auth") }
}