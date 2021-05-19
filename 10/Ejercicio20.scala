object IdealGasLaw_20 extends App{
    val presion = scala.io.StdIn.readLine("Presion en Pascales: ").toDouble
    val volume = scala.io.StdIn.readLine("Volumen en litros: ").toDouble
    val tempe = scala.io.StdIn.readLine("Temperatura en Celsius: ").toDouble

    val gas = (presion*volume*0.001)/(8.314*(tempe + 273.15))

    println(
        s"""          $gas mol
           |moles =  --------------------
           |             m3
           |""".stripMargin)
}
