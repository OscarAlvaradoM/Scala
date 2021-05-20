/* Exercise 92: Is a Number Prime?
A prime number is an integer greater than 1 that is only divisible by one and itself.
Write a function that determines whether or not its parameter is prime, returning
True if it is, and False otherwise. Write a main program that reads an integer
from the user and displays a message indicating whether or not it is prime. Ensure
that the main program will not run if the file containing your solution is imported
into another program.*/
object Ejercicio92 {
  // Definimos la función que nos arrojará un booleano
  def is_prime(number: Int) : Boolean = {
    // Obtenemos la raiz cuadrada del número ingresado, ya que probaremos con todos los enteros hasta este número.
    val sqrt: Int = scala.math.sqrt(number).toInt
    // Definimos una bandera que levantaremos cuando un número ya sepamos que NO es primo, por defecto sí lo será.
    var flag : Boolean = true
    // Para que funcione lo del módulo, definimos los primeros 3 primos
    if (number == 1 || number == 2 || number == 3) flag = true
    // Hacemos un ciclo for que checará la división del número ingresado entre todos los enteros hasta la raíz del
    // mismo número.
    for (i <- 2 to sqrt) {//
      // Si se da el caso de que es divisible entre algún entero, entonces diremos que NO es primo.
      if (number % i == 0) flag = false
    }
    // Regresamos el valor de la bandera
    return flag
  }
  // Función main que manda a llamar a nuestra otra función.
  def main(args: Array[String]) : Unit = {
    // Pedimos el número que queremos saber si es o no primo.
    println("Inserte un número entero que quiera saber si es primo o no: ")
    val entero: Int = scala.io.StdIn.readInt()
    val booleano: Boolean = is_prime(entero)
    // Regresamos un mensaje dependiendo de si es o no primo.
    if (booleano) print(s"El número $entero SÍ es primo")
    else print(s"El número $entero NO es primo")
  }
}
