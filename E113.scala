/*EJERCICIO 113.
PIDELE AL USUARIO UNA LISTA DE ELEMENTOS Y ASI COMO EN EL ESPAÑOL O EL INGLES
COLOCA UNA ',' ENTRE LOS ELEMENTOS Y AL FINAL UNA 'Y' PARA SEPARARLOS.*/

import scala.io.StdIn._
import scala.collection.mutable.ListBuffer


object Principal {
  def main(args: Array[String]): Unit = {
    println("Introduce el numero de elementos que deseas agregar a la lista")
    var numero_lista: Int = readInt()
    var lista= ListBuffer[String]()
    for (i <-Range(0, numero_lista)){
      var elemento:String = readLine()
      lista.append(elemento)
    }
    for (i <-Range(0, numero_lista)){
      if (i != (numero_lista-1)){
        println(lista(i)+", ")
      } else {
        println("y "+lista(i))
      }
    }
  }
}
