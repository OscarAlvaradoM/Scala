/*EJERCICIO 83.
GENERA UN PROGRAMA QUE CALCULE EL COSTO DE ENVIO SI PARA UN PAQUETE COBRA 10.95
Y A PARTIR DEL SEGUNDO +2.95*/
import scala.io.StdIn._

object Principal {
  def main(args: Array[String]): Unit = {
    println("Introduce la cantidad de envios que deseas hacer:")
    var envios: Int= readInt()
    if (envios >= 1)
    {
      println("El costo del envío de tus productos es de $"+ (10.95+2.95*(envios-1)).toFloat)
    } else {
        println("Ingresa un valor valido para calcular el costo de tus envios.")
      }
  }
}
