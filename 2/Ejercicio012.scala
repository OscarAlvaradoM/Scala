// Ejercicio 12
// Importamos lo necesario de la paquetería math para no andar poniendo scala.math en cada invocación
import scala.math._
object Ejercicio012 {
  // Función main, otra vez con Unit como salida ya que a lo mucho imprimiremos cosas.
  def main(args: Array[String]): Unit = {
    // Insertamos el aviso para que el usuario inserte lo que necesitamos
    println("Inserte la latitud y longitud primer punto en grados: ")
    // De esta forma podemos ingresar dos número a la vez con el formato indicado entre paréntesis
    // notemos que ahí lo puse como dos números separados por una coma, pero bien pudo ser por un espacio
    // Tienen que ser Double porque es el formato que debe arrojar las funciones trigonométricas.
    val (t1: Double, g1: Double) = scala.io.StdIn.readf2("{0,number},{1,number}")
    println("Inserte la latitud y longitud segundo punto en grados: ")
    val (t2: Double, g2: Double) = scala.io.StdIn.readf2("{0,number},{1,number}")
    // Havemos la resta aquí para que no haya problemas.
    val minus : Double = g1 - g2
    // Hacemos los cálculos. * es multiplicación,+ es suma.
    val distancia = 6371.01*acos(sin(t1: Double)*sin(t2: Double)+cos(t1: Double)*cos(t2: Double)*cos(minus: Double))
    // Usamos a lo que le llaman "f interpolation" con formato de
    // flotante para que no salgan todos los decimales.
    println(f"La distancia entre los puntos ($t1 ,$g1) y ($t2 ,$g2) es: $distancia%.4f")
  }
}
