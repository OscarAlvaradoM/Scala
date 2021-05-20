"""
Escribir un programa que comience leyendo la denominacion de un billete
del usuario. El programa debe mostrar el nombre de la persona que aparece
en el billete de la cantidad ingresada. Se debe mostrar un mensaje de error
si no existe esa denominación.

"""
import scala.io.StdIn._

object Principal {
  def main(args: Array[String]): Unit = {
    println("Introduce la denominacion del billete:")
    var n: Int = readInt()

    val dollars_US = Map((1, "George Washington"), (2, "Thomas Jefferson"),
      (5, "Abraham Lincoln"), (10, "Alexander Hamilton"), (20, "Andrew Jackson"),
      (50, "Ulysses S. Grant"), (100, "Benjamin Franklin"))

    if (dollars_US.contains(n)) {
      println((dollars_US(n)));
    } else {
      println("No existe esa denominacion");
    }
  }
}
