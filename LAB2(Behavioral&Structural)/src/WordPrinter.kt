class WordPrinter(private val printer: Printer) : Printer {
    override fun printString(string: String) {
        string.split(" ").forEach { printer.printString(it) }
    }
}