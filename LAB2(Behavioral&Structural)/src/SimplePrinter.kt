class SimplePrinter(private val stringFormatterStrategy: (String) -> String) : Printer {
    override fun printString(string: String) = println(stringFormatterStrategy.invoke(string))
}

