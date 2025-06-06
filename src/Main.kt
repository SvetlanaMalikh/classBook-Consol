fun main() {
    val consoleBook1 = Consol("", "", "")
    val consoleBook2 = Consol("", "", "")

    consoleBook1.consol()
    consoleBook2.consol()

    println(consoleBook1.opisanie())
    println("Количество страниц - ${consoleBook1.size}\n")

    println(consoleBook2.opisanie())
    println("Количество страниц - ${consoleBook2.size}")
}

open class Book(
    var name: String?,
    var autor: String?
) {
    constructor() : this("", "")
    fun opisanie() = """
        Название книги: $name 
        Автор: $autor
    """.trimIndent()
}

class Consol(name: String?, autor: String?, var size: String?) : Book(name ?: "", autor ?: "") {
    fun consol() {
        println("Введи название книги:")
        name = readLine()?.takeIf { it.isNotBlank() } ?: "Без названия"

        println("Введи автора этой книги:")
        autor = readLine()?.takeIf { it.isNotBlank() } ?: "Без автора"

        println("Напиши количество страниц в книге:")
        size = readLine()?.toIntOrNull()?.toString() ?: "Не известно"
    }
}