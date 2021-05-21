/* Exercise 152: What’s that Element Again?
Write a program that reads a file containing information about chemical elements
and stores it in one or more appropriate data structures. Then your program should
read and process input from the user. If the user enters an integer then your program
should display the symbol and name of the element with the number of protons
entered. If the user enters a string then your program should display the number
of protons for the element with that name or symbol. Your program should display
an appropriate error message if no element exists for the name, symbol or num-
ber of protons entered. Continue to read input from the user until a blank line is
entered.
*/
import scala.io.Source
import scala.util.control.Breaks._
object Ejercicio152 {
  // Definimos la función para procesar el texto por líneas
  def process(input: String): Array[String] = {
    // Leemos el archivo y lo convertimos en un arreglo
    val path : String = "/home/oscar/Dropbox/Infomedia/Trabajos/python-scala/quimica.csv"
    val lines = Source.fromFile(path).getLines.toArray
    // Definimos una posición inicial, con esta buscaremos ya sea en nombre, símbolo o número de protones
    var position : Int = -1
    // Checamos si es un número, en ese caso buscaremos en la posición 2, separado por comas, de cada línea
    if (input forall Character.isDigit) position = 2
    // Si no es un número, vemos el largo de la cadena para ver si es símbolo o nombre
    else {
      if (input.length > 2)  position = 0
      else position = 1
    }
    // Inicializamos un arreglo vacío, el cuál será o no sustituido por el resultado
    var result: Array[String] = Array()
    // Definimos un loop que pueda romperse para no seguir buscando cuando ya encontremos el elemento que buscamos
    breakable {
      // Iteramos sobre todas las líneas de texto
      for (line <- lines.slice(1, lines.length)) {
        // Separamos cada línea de texto por comas, obtenemos un arreglo de cadenas
        val characeristics: Array[String] = line.split(",")
        // Si en la posición de la que es la entrada coincide con algúno de la lista, rompemos ciclo y
        // devolvemos ese valor
        if (characeristics(position) == input) {
          result = characeristics
          break
        }
      }
    }
    // Devolvemos el valor obtenido, ya sea un arreglo vací o el arreglo con la info de un elemento si se encontró.
    result
  }
  def main(args: Array[String]) : Unit = {
    // Leémos la entrada del usuario
    val input: String = scala.io.StdIn.readLine("Ingrese el número de protones, el nombre o el símbolo de un elemento químico: ")
    // Invocamos nuestra función
    val list: Array[String] = process(input)
    // Vemos si es un arreglo vacío para el caso de que no coincida con ningún elemento
    if (list.length == 0) println("Las características que ingresaste no coinciden con ningún elemento cnocido.")
    // Si no es vacío, arrojamos características bien formateadas.
    else println(s"Nombre: ${list(0)}\nSímbolo: ${list(1)}\nNúmero de protones: ${list(2)}")
  }
}
