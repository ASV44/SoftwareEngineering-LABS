import kotlin.properties.Delegates

class TextView {

    class PrintingTextChangedListener : TextChangedListener {
        override fun onTextChanged(newText: String) = println("Text is changed to: $newText")
    }

    var listener: TextChangedListener? = null

    var text: String by Delegates.observable("") { prop, old, new ->
        listener?.onTextChanged(new)
    }
}