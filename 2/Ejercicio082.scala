/*Exercise 82: Taxi Fare
In a particular jurisdiction, taxi fares consist of a base fare of $4.00, plus $0.25
for every 140 meters traveled. Write a function that takes the distance traveled (in
kilometers) as its only parameter and returns the total fare as its only result. Write a
main program that demonstrates the function.*/
object Ejercicio082 {
  // Definición de la función que recibe únicamente los kilómetros recorridos y devuelve la tarifa
  def fare(km: Double) : Double = {
    // Se reciben kilómetros, se convierte a metros
    val distance_in_meters: Double = km*1000
    // Se obtiene la parte entera de los kilómetros recorridos entre 140 metros para ver cuántas veces se les cobra esos 0.25 dolares
    val ratio : Double = (distance_in_meters / 140).toInt
    // Se hace la multiplicación de la parte entera por 0.25, ya que únicamente se corba cuando se terminan los 140 metros.
    val fare_ratio : Double = ratio*0.25
    // La tarifa base, el banderazo pues.
    val base_fare : Double = 4
    // Se hace la suma del banderazo y por cada 140 m recorridos.
    val fare = base_fare + fare_ratio
    // Se devuelve el resultado de la función
    return fare
  }

  def main(args: Array[String]): Unit = {
    // Se pregunta por los kilómetros recorridos
    println("Introduzca los kilómetros recorridos: ")
    val km : Double = scala.io.StdIn.readDouble()
    // Se invoca la función y se guarda en resultado en un valor
    val tarifa : Double  = fare(km)
    print("La tarifa sería de $"+f"$tarifa%.2f")
  }
}
