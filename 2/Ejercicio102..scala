/*
Many recipe books still use cups, tablespoons and teaspoons to describe the volumes
of ingredients used when cooking or baking. While such recipes are easy enough to
follow if you have the appropriate measuring cups and spoons, they can be difficult
to double, triple or quadruple when cooking Christmas dinner for the entire extended
family. For example, a recipe that calls for 4 tablespoons of an ingredient requires 16
tablespoons when quadrupled. However, 16 tablespoons would be better expressed
(and easier to measure) as 1 cup.
Write a function that expresses an imperial volume using the largest units possible.
The function will take the number of units as its first parameter, and the unit
of measure (cup, tablespoon or teaspoon) as its second parameter. Return a string
representing the measure using the largest possible units as the function’s only result.
For example, if the function is provided with parameters representing 59 teaspoons
then it should return the string “1 cup, 3 tablespoons, 2 teaspoons”.
Hint: One cup is equivalent to 16 tablespoons. One tablespoon is equivalent to
3 teaspoons.*/

object Ejercicio102 {
  // Definimos la función para convertir entre porciones
  def convert(number_units: Double, unit_measure: String) : String = {
    // Inicializamos un resultado vacío
    var result : String = ""
    // Si nos están diciendo que tienen la medida en tazas, devolvemos tazas.
    if (unit_measure == "cup") result = f"$number_units cups"
    // Si se tiene la medida en tablespoons podemos escalarlo a tazas o tablespoons 
    else if (unit_measure == "tablespoons") {
      // Si sí se llena al menos una taza
      if ((number_units / 16) > 1) {
        // Obtenemos el número de tazas
        val cups: Int = (number_units / 16).toInt
        // Calculamos el residuo respecto a las tazas
        val tablespoons: Double = number_units % 16
        // Arrojamos como resultado una medida en tazas y tablespoons
        result =  f"$cups cups and $tablespoons tablespoons"
      }
      // Si no se alcanza a llenar una taza, devolvemos tablespoons 
      else result = f"$number_units tablespoons"
    }
    // Si se tiene la medida en teaspoons podemos escalarlo a tazas, tablespoons y teaspoons
    else if (unit_measure == "teaspoons") {
        // Si sí alcanza al menos las tablespoos 
        if ((number_units / 3) > 1){
          // Si se alcanza además la taza
          if ((number_units / 16) > 1){
            // Sacamos el número de tazas que se llenan
            val cups: Int = (number_units / (16*3)).toInt
            // Sacamos el residio de las tazas que se llenan
            val tablespoons: Int = ((number_units % (16*3)) / 3).toInt
            // Sacamos el residuo de las tablespoons que se llenan
            val teaspoons: Double = (number_units % (16*3)) % 3
            result = f"$cups cups, $tablespoons tablespoons and $teaspoons teaspoons"
          }
          // Si no se alcanza a llenar una taza 
          else {
            // Sacamos sólo el número de tablespoons que podemos llenar
            val tablespoons : Int  = (number_units / 3).toInt
            // El residuo de las tablespoons que llenamos
            val teaspoons : Double = number_units % 3
            result = f"$tablespoons tablespoons and $teaspoons teaspoons"
          }
        }
        // Si no se alcanza a llenar ni una tablespoon 
        else result = f"$number_units teaspoons"
      }
    // Devolvemos el resultado de la conversión de unidades
    return result
  }
  // Invocamos la función principal
  def main(args: Array[String]) : Unit = {
    // Preguntamos por los valores que buscamos, con split hacemos una separación mediante espacios
    val list : Array[String]= scala.io.StdIn.readLine("Ingrese la cantidad que desea convertir: ").split(" ")
    // Convertimos al primer elemento del arreglo en un
    val cantidad : Double = list(0).toDouble
    // Mapeameos el segundo elemento de nuestro arreglo en una variable tipo String
    val unidades : String = list(1)
    // Invocamos nuestra función de conversión e imprimimos el resultado de esta. 
    val new_units : String = convert(cantidad, unidades)
    print(new_units)
  }
}
