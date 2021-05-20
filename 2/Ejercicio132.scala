/* Exercise 132: Postal Codes
In a Canadian postal code, the first, third and fifth characters are letters while the
second, fourth and sixth characters are numbers. The province can be determined
from the first character of a postal code, as shown in the following table. No valid
postal codes currently begin with D, F, I, O, Q, U, W, or Z.

Province                First character(s)
-------------------------------------------
Newfoundland            A
Nova Scotia             B
Prince Edward Island    C
New Brunswick           E
Quebec                  G, H and J
Ontario                 K, L, M, N and P
Manitoba                R
Saskatchewan            S
Alberta                 T
British Columbia        V
Nunavut                 X
Northwest Territories   X
Yukon                   Y

The second character in a postal code identifies whether the address is rural or
urban. If that character is a 0 then the address is rural. Otherwise it is urban.
Create a program that reads a postal code from the user and displays the province
associated with it, along with whether the address is urban or rural. For example,
if the user enters T2N 1N4 then your program should indicate that the postal code
is for an urban address in Alberta. If the user enters X0A 1B2 then your program
should indicate that the postal code is for a rural address in Nunavut or Northwest
Territories. Use a dictionary to map from the first character of the postal code to the
province name. Display a meaningful error message if the postal code begins with
an invalid character.*/
object Ejercicio132 {
  def main(args: Array[String]): Unit = {
    // Pedimos el código postal al usuario
    val postal_code : String = scala.io.StdIn.readLine("Ingrese el código postal: ")
    // Definimos un "diccionario" que en realidad es un mapeo
    val province_map: Map[Char, String] = Map('A' -> "Newfoundland", 'B' -> "Nova Scotia", 'C' -> "Prince Edward Island",
                                              'E' -> "New Brunswick", 'G' -> "Quebec", 'H' -> "Quebec", 'J' -> "Quebec",
                                              'K' -> "Ontario", 'L' -> "Ontario", 'M' -> "Ontario", 'N' -> "Ontario",
                                              'P' -> "Ontario", 'R' -> "Mantioba", 'S' -> "Saskatchewan", 'T' -> "Alberta",
                                              'V' -> "British Columbia", 'Y' -> "Yukon")
    // Inicializamos unas cadenas vacías para después rellenar dependiendo del caso
    var province : String = ""
    var type_province: String =""
    // Tratamos este caso especial ya que no se pueden tener dos llaves iguales en un mapeo, pero sí 2 o
    // más valores iguales
    if (postal_code(0) == 'X') province = "Nunavut o de Northwest Territories"
    // Hacemos el mapeo de la primera letra del código postal
    else province = province_map(postal_code(0))
    // Checamos si el segundo elemento del código postal es 0 o algún otro número.
    if (postal_code(1) == '0')  type_province = "rural"
    else type_province = "urbana"
    // Devolvemos resultados
    print(s"El código postal pertenece a una dirección $type_province ubicada en la provincia de $province")
  }
}
