fun main(args: Array<String>) {
    val lowerCaseListener = TextView.PrintingTextChangedListener(SimplePrinter { it.toLowerCase() })
    val lowerCaseTextView = TextView(lowerCaseListener)

    val upperCaseListener = TextView.PrintingTextChangedListener(WordPrinter(SimplePrinter { it.toUpperCase() }))
    val upperCaseTextView = TextView(upperCaseListener)

    lowerCaseTextView.text = "Lorem ipsum"
    upperCaseTextView.text = "dolor sit amet"
}