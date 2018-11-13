import kotlin.properties.Delegates

class TextView(val listener: PrintingTextChangedListener) {

    class PrintingTextChangedListener(val printer: Printer) : TextChangedListener {

        override fun onTextChanged(newText: String) = printer.printString("Text is changed to: $newText")
    }

    var text: String by Delegates.observable("") { prop, old, new ->
        listener.onTextChanged(new)
    }
}