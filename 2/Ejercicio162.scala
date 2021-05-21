/*Exercise 162: Consistent Line Lengths
While 80 characters is a common width for a terminal window, some terminals are
narrow or wider. This can present challenges when displaying documents containing
paragraphs of text. The lines might be too long and wrap, making them difficult to
read, or they might be too short and fail to make use of the available space.
Write a program that opens a file and displays it so that each line is filled as full as
possible. If you read a line that is too long then your program should break it up into
words and add words to the current line until it is full. Then your program should
start a new line and display the remaining words. Similarly, if you read a line that is
too short then you will need to use words from the next line of the file to finish filling
the current line of output. For example, consider a file containing the following lines
from “Alice’s Adventures in Wonderland”:

Alice was
beginning to get very tired of sitting by her
sister
on the bank, and of having nothing to do: once
or twice she had peeped into the book her sister
was reading, but it had
no
pictures or conversations in it,"and what is
the use of a book," thought Alice, "without
pictures or conversations?"

When formatted for a line length of 50 characters, it should be displayed as:

Alice was beginning to get very tired of sitting
by her sister on the bank, and of having nothing
to do: once or twice she had peeped into the book
her sister was reading, but it had no pictures or
conversations in it, "and what is the use of a
book," thought Alice, "without pictures or
conversations?"

Ensure that your program works correctly for files containing multiple paragraphs
of text. You can detect the end of one paragraph and the beginning of the next by
looking for lines that are empty once the end of line marker has been removed. You
may perform error checking if you want to, but it is not required for this exercise.

Hint: Use a constant to represent the maximum line length. This will make it
easier to update the program when the window size changes.*/

import scala.io.Source
object Ejercicio162 {
  // Definimos una función con la cuál haremos  el procesamiento del texto, recibe el path y el número de caracteres
   def process(path: String, number_chars: Int): String = {
     // Leemos el documento
     val file = Source.fromFile(path)
     // Guardamos el documento como un arreglo separado por las líneas
     val text : Array[String] =  file.getLines.toArray
     // Cerramos el documento
     file.close()
     // Inicializamos una lista que usaremos para depositar los párrafos como cadenas
     var paragraph_list : List[String]= List()
     // Inicializamos dos variables, una de inicio y otra de final para separar por párrafos
     var start : Int = 0
     var end : Int = 0
     // Hacemos un for sobre todas las líneas hasta ver un doble salto de línea que se refleja como un string vacío
     for (index <- text.indices){
       if (text(index) == "") {
         // Si vemos el string vacío, agregamos lo que viene detrás de este a la lista de párrafos
         paragraph_list = text.slice(start, end).mkString(" ") :: paragraph_list
         // Configuramos un nuevo comienzo, para ir barriendo los párrafos
         start = index + 1
       }
       // Se cambia el paso de término conforme avanzamos de línea
       end += 1
     }
     // Hacemos este paso para agregar el último párrafo ya que después de éste no ve un salto de línea
     // o también en el caso en que sólo hay un párrafo.
     paragraph_list = text.slice(start, end).mkString(" "):: paragraph_list
     // Inicializamos una cadena vacía donde se irá almacenando el texto con nuevo formato
     var master_string : String = ""
     // Inicializamos un ciclo que recorrerá cada párrafo
     for (paragraph <- paragraph_list){
       // Obtenemos la parte entera de la división del largo del texto entre el número de caracteres que queremos por línea
       val integer_part : Int = paragraph.length/number_chars
       // Haremos un for, ya que sabemos que tendrá las líneas obtenidas arriba
       var start : Int = 0
       var end : Int = 0
       for (index <- 0  until integer_part){
         // Igual configuramos el inicio cada "number_chars" caracteres
         start = index*number_chars
         // Recorremos el final "number_chars" de lo que era el inicio
         end = start + number_chars
         // Vamos agregando cada línea a la cadena que devolveremos
         master_string = master_string.+(paragraph.slice(start,end))
         // Agregamos un salto de línea
         master_string = master_string.+("\n")
       }
       // Agregamos el texto sobrante de las líneas exactas
       if (paragraph.length%number_chars != 0) {
         master_string = master_string.+(paragraph.slice(end,paragraph.length))
         master_string = master_string.+("\n")
       }
       // Agregamos el salto de línea de cambio de párrafo
       master_string = master_string.+("\n")
     }
     // Devolvemos la cadena maestra con todo el texto procesado
     master_string
   }
  def main(args: Array[String]): Unit = {
    // Preguntamos por el número de caracteres que quiera que tenga cada línea de texto
    println("Ingrese el número de caracteres horizontales permitidos: ")
    val number_lines: Int = scala.io.StdIn.readInt()
    // Predefinimos un camino
    val path : String = "/home/oscar/Dropbox/Infomedia/Trabajos/python-scala/Alice.txt"
    // Invocamos la función con el camino y el número de caracteres
    val new_text : String = process(path, number_lines)
    println(new_text)
  }
}
