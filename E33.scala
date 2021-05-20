/* EJERCICIO 33.
PIDELE AL USUARIO LA CANTIDAD DE PAN VIEJO QUE COMPRARA, SIENDO EL PRECIO DEL
PAN NUEVO DE 3.49 Y EL PAN VIEJO TIENE UN DESCUENTO DE 60%. AL FINAL, MUESTRA
AL USUARIO EL AHORRO QUE TUVO Y EL PRECIO QUE PAGARÁ*/
import scala.io.StdIn._

class Panes(var n:Int) {
  val pan_nuevo: Double = 3.49
  val total_nuevo = pan_nuevo*n
  println("El pan tiene un costo unitario de \t"+"$"+pan_nuevo)

  def calculo_PanViejo: Unit = {
    var descuento:Double = total_nuevo*0.6
    println(s"Llevas $n panes a un precio de \t" + "$"+"%.2f".format(total_nuevo-descuento) )
    println("Estas ahorrando \t$"+descuento)
  }
}
object Principal {
  def main(args: Array[String]): Unit = {
    println("Introduce el numero de panes de ayer que deseas comprar:")
    var n:Int = readInt()
    var pan1 = new Panes(n)
    pan1.calculo_PanViejo

  }
}
