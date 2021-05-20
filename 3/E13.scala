/* EJERCICIO 13
GENERA UN PROGRAMA QUE INSERTE LA CANTIDAD DE CENTAVOS QUE NECESITA
Y CONVIERTE ESA CANTIDAD EN MONEDAS, DISMINUYE LA CANTIDAD DE MONEDAS 
ENTREGADAS AL USUARIO */

//Mostrando la denominación de las monedas en centavos
import scala.io.StdIn._

class Monedas(var dinero:Int) {
  val coins = List(200,100, 25, 10, 5, 1)
  for (i <- coins) { if (dinero > i ){
      var moneda:Int = dinero/i
      println(s"Se le darán $moneda monedas de $i centavos")
      dinero = (dinero%i)}
  }
}
object Principal {
  def main(args: Array[String]): Unit = {
    println("Introduce la cantidad de centavos que necesitas:")
    var centavos: Int = readInt()
    var dinero1 = new Monedas(centavos)
    }
  }

// Mostrando el nombre de la moneda
  import scala.io.StdIn._

  class Monedas(var dinero:Int) {
    val coins = List(200,100, 25, 10, 5, 1)
    val map1 = Map((200, "toonies"),(100, "loonies"), (25, "quarters"), (10, "dimes"), (5, "nickels"), (1, "pennies"))

    for (i <- coins) {
      if (dinero > i ){
        var moneda:Int = dinero/i
        var map2 = map1(i)
        println(s"Se le darán $moneda monedas $map2")
        dinero = (dinero%i)}
    }
  }

  object Principal {
    def main(args: Array[String]): Unit = {
      println("Introduce la cantidad de centavos que necesitas:")
      var centavos: Int = readInt()
      var dinero1 = new Monedas(centavos)
      }
    }
