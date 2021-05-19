object Arithmetic_10 extends App{
    val p = scala.io.StdIn.readLine("Ingresese un entero p distinto de 0:").toInt
    val q = scala.io.StdIn.readLine("Ingrese un entero q: ").toInt

    println(s"p + q = ${p + q}")
    println(s"q - p = ${q - p}")
    println(s"p*q = ${p*q}")
    println(s"p/q = ${p/q.toDouble}") //Si no se lo pasa a Double o Float deja un cociente entero siempre
    println(s"El residuo p entre q es ${p%q}")
    println(s"log_10 (p) = ${Math.log10(p)}")
    println(s"a^b = ${Math.pow(p, q)}")
}
