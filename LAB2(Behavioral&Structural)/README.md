## LAB Nr.2 Behavioral & Structural

In this laboratory work was used 2 Behavioral, "Observable/Listner" and "Strategy" patterns, and 1 Structural, 
"Decorator" pattern.

1. #### "Observable/Listner

Observable/Listener pattern is implemented by "TextView" and "TextChangedListener". Class "TextView" contains variable text
which on setting new value at it notify "TextView" listner which should be an instance of object which implemenets 
"TextChangedListener" interface, such object can be for example default "TextView" listener "PrintingTextChangedListener",
which is defined as inner class in "TextView". When value of variable "text" from "TextView" is changed function "onTextChanged"
from listner is called, having as parameter the new value of "text" variable.

2. #### Strategy

Strategy pattern is implemented by "SimplePrinter" Class, its constructor requires as parameter variable "stringFormatterStrategy"
which represents lambda function for processing printed string before printig, this function takes as parameter string and 
returns processed string.

3. #### Decorator

 Decorator pattern is implemented by "Printer" interface, "SimplePrinter" and "WordPrinter" classes. Interface "Printer"
 represents basic functionality which should printer implements, and this is basic "printString" function. Class "SimplePrinter"
 implements "Printer" interface by implemanting basic behaviour for "printString" and just prints given string in standart output.
 Class "WordPrinter" represents decorator for "Printer" objects, and it implements function "printString" by printing each
 word of string in new line, but it also uses printer object which is passed to constructor for printing each word.
