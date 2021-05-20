/* Ejercicio 73. palindromo
GENERA UN PROGRAMA QUE LEA UNA FRASE DEL USUARIO E IDENTIFIQUE
SI ESTA ES UN PALINDROMO O NO. NO CARACTERES ESPECIALES. NO CASE SENSITIVE*/


object Principal {
  def main(args: Array[String]): Unit = {
    println("Introduce la frase o palabra:")
    var frase: String = readLine()
    frase = frase.replace(" ", "")
    if (frase== frase.reverse)
      {
        println("Es un palindromo")
      } else {
      println("No es un palíndromo")
    }
  }
}
