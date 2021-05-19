/*Exercise 72: Is a String a Palindrome?
A string is a palindrome if it is identical forward and backward. For example “anna”,
“civic”, “level” and “hannah” are all examples of palindromic words. Write a program
that reads a string from the user and uses a loop to determines whether or not it is a
palindrome. Display the result, including a meaningful output message.*/
import scala.util.control.Breaks._
object Ejercicio72 {
  def main(args: Array[String]): Unit = {
    // Iniciamos la lectura de la palabra
    val word : String = scala.io.StdIn.readLine("Escriba una palabra y le diré si es un palíndromo o no: ").toLowerCase()
    // Inicializamos una cadena vacía para ir colocando aquí la palabra escrita al revés.
    var drow: String = ""
    // Colocamos cada letra de la palabra escrita al revés con un for
    for (i <- 0 until word.length){
      drow =  drow.+(word(word.length-1-i))
    }
    // Checamos si la palabra es la misma escrita al revés, en ese caso se dice que sí es un palíndromo, NO en otro caso. 
    if (word == drow) print(s"La palabra $word escrita al revés es $drow,por lo que SÍ es un palíndromo.")
    else print(s"La palabra $word escrita al revés es $drow, por lo que NO es un palíndromo.")
  }
}
