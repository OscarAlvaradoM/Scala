object FrecuencyToName_55 extends App {
    val radiacion = scala.io.StdIn.readLine("Ingrese frecuencia de onda (Hz): ").toDouble

    val nombre =
      if (radiacion < 3*Math.pow(10, 9) )
          "Ondas de radio"
      else if (3*Math.pow(10,9) <= radiacion && radiacion < 3*Math.pow(10,12))
          "Microondas"
      else if (3*Math.pow(10,12) <= radiacion && radiacion < 4.3*Math.pow(10,14))
          "Luz infrarroja"
      else if (43*Math.pow(10,14) <= radiacion && radiacion < 7.5*Math.pow(10,14))
          "Luz visible"
      else if (7.5*Math.pow(10,14) <= radiacion && radiacion < 3*Math.pow(10,17))
          "Luz ultravioleta"
      else if (3*Math.pow(10,17) <= radiacion && radiacion < 3*Math.pow(10,19))
          "Rayos X"
      else
          "Rayos Gamma"

    println(nombre)
}
