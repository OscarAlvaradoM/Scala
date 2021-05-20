/*Exercise 112: Below and Above Average
Write a program that reads numbers from the user until a blank line is entered. Your
program should display the average of all of the values entered by the user. Then
the program should display all of the below average values, followed by all of the
average values (if any), followed by all of the above average values. An appropriate
label should be displayed before each list of values.*/
object Ejercicio112 {
  def main(args: Array[String]): Unit = {
    // Creamos una lista vacía en donde iremos almacenando los números que ingrese el usuario
    var lista : List[Double] = List()
    // Definimos una variable de control a la cuál se le asignará el número que el usuario ingrese
    var actual : String = "-"
    // Se especifica un espacio en memoria para los números que se ingresen
    var number : Double = 0.0
    // Definimos un ciclo while para que se repita hasta que se ingrese una línea vacía.
    while (actual != ""){
      // Pedimos al usuario que ingrese un número
      actual = scala.io.StdIn.readLine("Ingresa un número: ")
      // Si no es una cadena vacía, convertimos lo que ingrese en en un número y lo agregamos a la lista.
      if (actual != "") {
        number = actual.toDouble
        lista = number :: lista
      }
    }
    // Calculamos el promedio y lo mostramos en pantalla
    val mean: Double = lista.sum/lista.length
    println(f"El promedio de los números que ingresaste es: $mean")

    // Definimos unas listas para ir almacenando los números que sean mayores, menores o iguales al promedio
    var menores : List[Double] = List()
    var mayores : List[Double] = List()
    var promedios : List[Double] = List()
    // En un for loop checamos si son menores, mayores o iguales al promedio los elementos de la lista
    for (i <- lista) {
      if (i < mean) menores = i :: menores
      else  if (i > mean) mayores = i :: mayores
      else promedios = i :: promedios
    }
    // Mostramos todos los números por categoría.
    println(s"Los valores menores al promedio son: $menores.")
    println(s"Los valores mayores al promedio son: $mayores.")
    print(s"Se ingresó ${promedios.length} veces el número que resultó ser el promedio.")
  }
}
