/*EJERCICIO 103. Fecha mágica.
UNA FECHA MAGICA ES CUANDO EL MES MULTIPLICADO POR EL DIA TE ARROJA LAS ULTIMAS
DOS CIFRAS DEL AÑO. GENERA UN PROGRAMA QUE AL INGRESAR UNA FECHA, TE DIGA SI ES
UNA FECHA MAGICA O NO. EL PROGRAMA SOLO SERA PARA EL SIGLO XX.*/

//Sin considerar los meses variables siendo el maximo día de todos los meses 31

import scala.io.StdIn._

object Principal {
  def main(args: Array[String]): Unit = {
    println("Introduce el día")
    var day: Int = readInt()
    println("Introduce el mes")
    var month: Int = readInt()
    println("Introduce el año")
    var year: Int = readInt()

    if (day <= 31 && day > 0){
      if (month <=12 && month >0){
        if (year >=1900 && year < 2000){
          if (day*month == (year-1900)){
            println("Fecha mágica")
          } else {println("La fecha no es magica")}
        }else {println("El año introducido no es correcto")}
      }else {println("El mes introducido no es correcto")}
    }else {println("El dia introducido no es correcto")}
    }
  }
