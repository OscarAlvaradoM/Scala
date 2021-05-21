/*Exercise 172: Element Sequences
Another game that some people play with the names of chemical elements involves
constructing a sequence of elements where each element in the sequence begins with
the last letter of its predecessor. For example, if a sequence begins with Hydrogen,
then the next element must be an element that begins with N, such as Nickel. The
element following Nickel must begin with L, such as Lithium. The element sequence
that is constructed can not contain any duplicates.
Write a program that reads the name of an element from the user. Your program
should use a recursive function to find the longest sequence of elements that begins
with the entered element. Then it should display the sequence. Ensure that your
program responds in a reasonable way if the user does not enter a valid element name.

Hint: It may take your program up to two minutes to find the longest sequence
for some elements. As a result, you might want to use elements like Molybdenum
and Magnesium as your first test cases. Each has a longest sequence
that is only 8 elements long which your program should find in a fraction of a
second.*/
//Importamos la paquetería para poder leer archivos
import scala.io.Source
object Ejercicio172 {
  // Definimos la función recursiva, recibirá el elemento de inicio y los elementos restantes
  def get_chain(start: String, others: Array[String]): Array[String] = {
    // Inicializamos un arreglo vacío en donde iremos depositando las mejores opciones
    var best : Array[String] = Array()
    // Obtenemos la última letra de nuestra palabra inicial
    val last : Char = start.last
    // Iteramos sobre cada elemento de los otros elementos
    for (element <- others){
      // Obtenemos la primer letra del elemento actuak
      val first : Char = element.head
      // Checamos si en efecto esta letra es igual a la última de nuestro elemento inicial
      if (first == last) {
        // Si lo es, comenzamos nuestro proceso iterativo, el elemento en el que estamos será nuestro nuevo elemento
        // inicial y checaremos respecto a todos los demás elementos, ojo que no está el inicial inicial y así se
        // van quitando
        val others_new = others.toBuffer - element
        val posible: Array[String] = get_chain(element, others_new.toArray)
        // Si la longitud de esta opción que se regresa es mejor que la que habíamos guardado, se queda.
        if (posible.length > best.length) best = posible
      }
    }
    // Regresamos la palabra inicial y además nuestro mejor candidato.
    Array(start) ++ best
  }
  // Definimos una función para leer los datos
  def get_elements(path : String): Array[String] = {
    // Leemos el documento
    val file = Source.fromFile(path)
    // Guardamos el documento como un arreglo separado por las líneas
    val text : Array[String] =  file.getLines.toArray
    // Cerramos el documento
    file.close()
    // Inicializamos una lista donde se irán colocando los elementos
    var elements : List[String] = List()
    // Recorremos en un ciclo todas las líneas del documento
    for (index <- 1 until  text.length){
      // Obtenemos todos los elementos de la primer columna
      val element : String = text(index).split(",")(0).toLowerCase
      // Agregamos a la lista que ya teníamos
      elements = element :: elements
    }
    // Convertimos en un arreglo
    elements.toArray
  }

  def main(args: Array[String]): Unit = {
    var element: String = "-"
    // Definimos un ciclo while para que se repita hasta que se ingrese una línea vacía.
    while (element != "") {
      // Leemos el nombre del elemento del usuario
      element = scala.io.StdIn.readLine("Inserte el nombre de algún elemento en inglés: ")
      // Condicional para mostrar mensaje en caso de que el usuario quiera salir
      if (element.length > 0) {
        // Leémos los datos
        val others: Array[String] = get_elements(path = "/home/oscar/Dropbox/Infomedia/Trabajos/python-scala/quimica.csv")
        // Invocamos la función con el elemento inicial del usuario
        val chain: Array[String] = get_chain(element, others)
        println(s"La cadena que se forma a partir del elemento $element es :")
        println(chain.toList)
      }
      // Mensaje de despedida
      else println("Gracias por jugar!")
    }
  }
}
