/* EJERCICIO 23.
CALCULA EL AREA DE UN POLIGONO, PIDIENDOLE AL USUARIO EL NUMERO DE LADOS
QUE TIENE EL POLIGONO Y LA LONGITUD DE UNO DE SUS LADOS IGUALES.*/
import scala.io.StdIn._
import math.tan
import math.Pi

class Area(var n:Int, var s:Float) {
  var area:Double = (n*s*s)/(4*tan(Pi/n))
  println(s"El area del poligono de $n lados es: %.2f".format(area))
}
object Principal {
  def main(args: Array[String]): Unit = {
    println("Introduce el numero de lados que tiene el poligono:")
    var lados:Int = readInt()
    println("Introduce la longitud de uno de sus lados:")
    var longitud: Float = readFloat()
    var area1 = new Area(lados,longitud)
  }
}
