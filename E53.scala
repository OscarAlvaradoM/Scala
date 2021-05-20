"""
Crea un programa para una empresa en la que sus empleados se califican al final
de cada año. Las calificaciones empiezan con 0.0, los valores altos significan
un mejor desempeño, siendo el más alto 1.0.
La nota 0.0 es insatisfactoria, 0.4 es aceptable y mayor a 0.6 es meritoria.
No existen valores entre 0.0 y 0.4, asi como de 0.4 a 0.6
"""
import scala.io.StdIn._

object Principal {
  def main(args: Array[String]): Unit = {
    val valores_desempeño = List(0.0, 0.4).concat(BigDecimal(0.6) to BigDecimal(1.0) by (0.1))

    println("Introduce tu desempeño de este año en formato decimal seleccionando un numero" +
      " \nentre el 0 y 1, siendo 0 el y el 1 el mas alto:")
    var desempeño: Double = readDouble()

    if (valores_desempeño.contains(desempeño)) {
      println("Su aumento por su desempeño anual es de $"+2400*desempeño);

      if (valores_desempeño(0) == desempeño){
        println("Su desempeño es inaceptable")
      } else if (valores_desempeño(1) == desempeño){
        println("Su desempeño es aceptable")
      } else {
        println("Su desempeño es meritorio")
      }
    } else {
      println("No existe esa calificacion");
    }
  }
}
