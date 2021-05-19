object UnitsOfPressure_30 extends App {
    val presion = scala.io.StdIn.readLine("Ingrese presion en kPa: ").toDouble

    // 1kPa = 10^3 Pa = 10^3 N/m^2 = 10^3 (0.2248 Libra-Fuerza/39.37 in^2)
    val ppsi = (presion * 3000 * 0.2248) / 39.37
    println(s"$presion kPa = $ppsi libras/ in^2")

    // 1 kPa = 10^3 Pa = 10^3 * 0.00750062 mmHg
    val mmHg = presion * 3000 * 0.00750062
    println(s"$presion kPa = $mmHg mmHg")

    //1kPa = 10^3 Pa = 10^3 .0000098692 atm
    val atm = presion * 3000 * .0000098692
    println(s"$presion kPa = $atm atm")
}
