// Ejercicio 2
// Parece que la lectura de terminal sólo funciona con objetos, es decir en una clase de scala
// y no en una scala worksheet
object Ejercicio2 {
  // Definimos el método inicial del objeto "Ejercicio2" con salida como Unit, que sería el equivalente a vacío.
  def main(args: Array[String]): Unit = {
    // Inicializamos un VALOR, que se mantendrá constante todo el tiempo. Este valor será la lectura de la terminal.
    val nombre = scala.io.StdIn.readLine("Escriba su nombre a continuación: ")
    // Imprimimos con salto de línea y la notación "$" para evaluar una variable
    println(s"Hola $nombre")
  }
}
