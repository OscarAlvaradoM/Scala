/* Escribe un programa que genere una tabla que transforme °C a F,
de 0 a 100 en pasos de 10.*/

object Principal {
  def main(args: Array[String]): Unit = {
    println("Centigrados \tFarenheit")

    for (i <- Range(0, 110, 10))
    {
      println(i+"°C\t\t\t" + ((i*9/5)+32)+"F")
    }
  }
}
