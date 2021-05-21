/*Exercise 142: Display the Tail of a File
Unix-based operating systems also typically include a tool named tail. It displays
the last 10 lines of a file whose name is provided as a command line parameter.
Write a Python program that provides the same behavior. Display an appropriate
error message if the file requested by the user does not exist or if the command line
parameter is omitted.
There are several different approaches that can be taken to solve this problem.
One option is to load the entire contents of the file into a list and then display the
last 10 elements. Another option is to read the contents of the file twice, once to
count the lines, and a second time to display the last 10 lines. However, both of these
solutions are undesirable when working with large files. Another solution exists that
only requires you to read the file once, and only requires you to store 10 lines from
the file at one time. For an added challenge, develop such a solution.*/
// Importamos esta paquetería para poder leer documentos
import scala.io.Source
object Ejercicio142{
  // Definimos una función que lee un camino donde estará el archivo que queremos leer
  def tail(path: String): String = {
    // Leemos el archivo y lo convertimos en un arreglo
    val lines = Source.fromFile(path).getLines.toArray
    // Ya hecho un arreglo se obtienen los 10 últimos elementos y se convierte de nuevo a
    // texto para su impresión
    lines.slice(lines.length-10, lines.length).mkString("\n")
  }
  // Definimos nuestra función main que sólo se encargará de leer el camino, pasárselo a la
  // función e imprimir resultados
  def main(args: Array[String]): Unit = {
    val path : String = scala.io.StdIn.readLine("Ingrese el camino del archivo a leer: ")
    val last_line : String = tail(path)
    println("Las últimas 10 líneas son: \n")
    println(last_line)
  }
}
// /home/oscar/Dropbox/Infomedia/Trabajos/ejemplo.txt
