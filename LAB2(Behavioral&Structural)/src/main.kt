fun main(args: Array<String>) {
    val textView = TextView()
    textView.listener = TextView.PrintingTextChangedListener()
    textView.text = "Lorem ipsum"
    textView.text = "dolor sit amet"
}