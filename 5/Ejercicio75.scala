object GreatestCommonDivisor_75 extends App {
  var m = scala.io.StdIn.readLine("Ingrese un entero positivo m: ").toInt
  var n = scala.io.StdIn.readLine("Ingrese un entero positivo n: ").toInt

  var mcd = if (m < n){
    m
  }else{
    n
  }

  while(m % mcd != 0 || n % mcd != 0){
    mcd = mcd - 1
  }

  println(s"Máximo común divisor: $mcd")
}
