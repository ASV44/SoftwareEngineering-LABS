class Printer(val stringFormatterStrategy: (String) -> String) {
    fun printString(string: String) = println(stringFormatterStrategy.invoke(string))
}

