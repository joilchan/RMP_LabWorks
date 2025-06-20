fun main() {
    val retake1 = setOf("Иванов И.И.", "Сидоров С.С.", "Петров П.П.")
    val retake2 = setOf("Сидоров С.С.", "Кузнецова А.А.", "Петров П.П.")

    val all = retake1 union retake2
    val both = retake1 intersect retake2
    val onlyOne = all subtract both

    println("Всего на пересдачу отправлено: ${all.size}")
    println("Оба зачета не сдали: ${both.size} -> $both")
    println("Только один зачет не сдали: ${onlyOne.size} -> $onlyOne")
}