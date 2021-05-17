// Ejercicio 32
object Ejercicio32 {
    def main(args: Array[String]): Unit = {
      print("Ingrese tres números enteros separados por espacios: ")
      // Leemos de esta manera ya que con el formato de readf no jalaba con los enteros.
      // Básicamente lo que se hace es leer una cadena, se hace de esta cadena una lista
      // dada por separación entre espacios y luego con map se convierte str -> int
      val lista: Array[Int] = scala.io.StdIn.readLine().split(" ").map(_.toInt)
      // Usamos los métodos de la lista para saber mínimo, máximo y la suma
      val menor : Int = lista.min
      val mayor : Int = lista.max
      val suma : Int = lista.sum
      // Para obtener el número de en medio
      val medio : Int = suma - menor - mayor
      println(s"Los números ordenados son: ($menor, $medio, $mayor)")
    }
}
