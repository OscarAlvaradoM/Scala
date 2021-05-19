object DistanceUnits_15 extends App{
    val m = scala.io.StdIn.readLine("Ingrese una medida m en pies: ").toDouble

    println(
        s"""$m pies => ${m*.33} yardas
           |$m pies => ${m*12} pulgadas
           |$m pies => ${m*0.0001893} millas """".stripMargin )
}
