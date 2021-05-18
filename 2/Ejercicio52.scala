/*Ejercicio 52
In the previous exercise you created a program that converts a letter grade into the
equivalent number of grade points. In this exercise you will create a program that
reverses the process and converts from a grade point value entered by the user to a
letter grade. Ensure that your program handles grade point values that fall between
letter grades. These should be rounded to the closest letter grade. Your program
should report A+ for a 4.0 (or greater) grade point average*/
object Ejercicio52 {
  def main(args: Array[String]): Unit = {
    // Preguntamos por lso grade points
    println("Ingrese el número de grade points: ")
    var grade : Double = scala.io.StdIn.readDouble()
    // Obtenemos la parte entera de los grade points
    var entero: Int = grade.toInt
    // Obtenemos los decimales
    var dec: Double = grade % 1
    // Hacemos el redondeo de decimales
    if (dec >= 0.85){
      entero = entero + 1
      dec = 0.0
    }
    else if (dec < 0.85 && dec >= 0.5) dec = 0.7
    else if (dec < 0.5 && dec >= 0.15) dec = 0.3
    else dec = 0.0

    // Hacemos el nuevo cálculo del grade
    grade = entero + dec
    // Definimos un mapeo de los grade points a las notas.
    val mapeo = Map(4.0 -> "A", 3.7 -> "A-", 3.3 -> "B+", 3.0 -> "B", 2.7 -> "B-", 2.3 -> "C+", 2.0 ->"C",
      1.7 -> "C-", 1.3 -> "D+", 1.0 -> "D", 0.0 -> "F")
    // Ponemos A+ para valores mayores a 4.0, una F para valores menores a cero o mapeamos conforme al Map
    var result: String = ""
    if (grade > 4.0) result = "A+"
    else if (grade < 0.0)  result = "F"
    else result = mapeo(grade)
    // Mostramos los resultados
    print(s"El resultado es $result")
  }
}
