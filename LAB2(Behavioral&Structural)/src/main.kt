fun main(args: Array<String>) {
    val lowerCaseListener = TextView.PrintingTextChangedListener(Printer { it.toLowerCase() })
    val lowerCaseTextView = TextView(lowerCaseListener)

    val upperCaseListener = TextView.PrintingTextChangedListener(Printer { it.toUpperCase() })
    val upperCaseTextView = TextView(lowerCaseListener)

    lowerCaseTextView.text = "Lorem ipsum"
    upperCaseTextView.text = "dolor sit amet"
}