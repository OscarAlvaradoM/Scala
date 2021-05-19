object RootsOfCuadraticFunction_50 extends App {
    println("Ingrese los coeficientes a, b y c de un polinomio de la forma p(x) = ax^2 + bx +c.")

    val a = scala.io.StdIn.readLine("a = ").toDouble
    val b = scala.io.StdIn.readLine("b = ").toDouble
    val c = scala.io.StdIn.readLine("c = ").toDouble

    val discriminante = b*b -4*a*c

    if (discriminante > 0) {
        val raiz_1 = (-b + Math.sqrt(discriminante)) / (2 * a)
        val raiz_2 = (-b - Math.sqrt(discriminante)) / (2 * a)
        println(s"Raíces: $raiz_1 , $raiz_2")
    }
    else if (discriminante == 0 ) {
      val raiz = -b / (2 * a)
      println(s"Raiz = $raiz")
    }
    else
        println("Sin raices reales.")
}
