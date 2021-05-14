object BottleDeposits_5 extends App {
    val Envases_1 = scala.io.StdIn.readLine("Introduzca el número de envases con capacidad menor o igual a un litro: ").toInt
    val Envases_2 = scala.io.StdIn.readLine("Introduzca el número de envases con capacidad mayor a un litro: ").toInt
    var Reembolso = Envases_1 * .1 + Envases_2 * .25

    println(s"Si recicla su reembolso será de $$$Reembolso")
}
