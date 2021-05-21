// Ejercicio 22
object Ejercicio022 {
  def main (args: Array[String]): Unit = {
    // Mostramos el mensaje para que el usuario sepa qué hacer.
    print("Ingrese los tres lados (separados por espacios) de un tríangulo del que quiera saber su área: ")
    // Pedimos los tres números de golp con formato de separación de espacios
    val (s1: Double, s2: Double, s3: Double) = scala.io.StdIn.readf3("{0, number} {1,number} {2,number}")
    // Hacemos una cuenta previa
    val s: Double = (s1+s2+s3)/2
    // Calculamos el área con la fórmula que se nos da.
    val area = scala.math.sqrt(s*(s-s1)*(s-s2)*(s-s3))
    println(f"El área del tríangulo con lados $s1 , $s2 , $s3 , es $area%.2f")
  }
}
