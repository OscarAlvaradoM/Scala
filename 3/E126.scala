/* EJERCICIO 126.
PIDELE UNA LISTA DE NUMEROS AL USUARIO Y MUESTRA TODAS LAS SUBLISTAS POSIBLES
A PARTIR DE LA LISTA QUE EL USUARIO HA OTORGADO*/

import scala.io.StdIn._
import scala.collection.mutable.ListBuffer
import scala.collection.immutable.Range.Exclusive

object Principal {
  def main(args: Array[String]): Unit = {
    println("Introduce el numero de elementos que deseas agregar a la lista")
    var tamaño_lista: Int = readInt()
    var lista_dada = ListBuffer[Int]()
    var sublista = ListBuffer[Int]()



    for (i <- Range(0, tamaño_lista)) {
      var elemento: Int = readInt()
      lista_dada.append(elemento)
    }
    for (i <- Range(0, tamaño_lista)) {
      for (j <- Range(0, tamaño_lista - i + 1)) {
        println(sublista)
        sublista = ListBuffer[Int]()
        for (x <- Range(j, i + j)) {
          sublista.append(lista_dada(x))
        }
      }
    }

  }
}
