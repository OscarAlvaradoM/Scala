/* Ejercicio 03
Pidele al usuario que ingrese las medidas de una recamara al usuario y genera
un programa que muestre el area de la recamara*/

// Ingresandolo manualmente como Función
"""
val area = (x: Double, y: Double) => {x*y}
println("El área es: " + area(1.5, 2))
"""

// Ingresandolo manualmente como función
"""
def area(x: Double, y: Double): Double = x * y
println(area(1.5, 2))
"""

//Utilizando expresion lambda
"""
def area = {
  (x:Double, y:Double) => x * y
}
val rectangulo = area

rectangulo(5,10)
"""

// Pidiendoselo al usuario
import scala.io.StdIn._
object cuarto {
  def main(args: Array[String]): Unit = {
    println("Introduce la anchura del cuarto:")
    var x: Float = readFloat()
    println("Introduce el valor de lo largo del cuarto:")
    var y: Float = readFloat()
    var area: Float = (x*y)
    println(s"El área del cuarto es: %.2f".format(area)+" m")
  }
}
