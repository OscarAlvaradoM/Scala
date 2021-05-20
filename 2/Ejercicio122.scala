/* Exercise 122: Tokenizing a String
Tokenizing is the process of converting a string into a list of substrings, known as
tokens. In many circumstances, a list of tokens is far easier to work with than the
original string because the original string may have irregular spacing. In some cases
substantial work is also required to determine where one token ends and the next one
begins.
In a mathematical expression, tokens are items such as operators, numbers and
parentheses. Some tokens, such as *, /, ˆ, ( and ) are easy to identify because the
token is a single character, and the character is never part of another token. The + and
- symbols are a little bit more challenging to handle because they might represent
the addition or subtraction operator, or they might be part of a number token.

Hint: A + or - is an operator if the non-whitespace character immediately
before it is part of a number, or if the non-whitespace character immediately
before it is a close parenthesis. Otherwise it is part of a number.

Write a function that takes a string containing a mathematical expression as its
only parameter and breaks it into a list of tokens. Each token should be a parenthesis,
an operator, or a number with an optional leading + or - (for simplicity we will
only work with integers in this problem). Return the list of tokens as the function’s
result.
You may assume that the string passed to your function always contains a valid
mathematical expression consisting of parentheses, operators and integers. How-
ever, your function must handle variable amounts of whitespace between these
elements. Include a main program that demonstrates your tokenizing function by
reading an expression from the user and printing the list of tokens. Ensure that the
main program will not run when the file containing your solution is imported into
another program.*/

object Ejercicio122 {
  // Drfinimos la función que recibirá una cadena y devolverá una lista con tokens
  def tokenizer(math_expresion: String) : Array[String] = {
    // Separamos nuestra cadena por espacios, aún cuando tenga más de uno juntos
    val arr : Array[String] = math_expresion.split("\\s+")
    // Pamos nuestro arreglo al buffer para poder editarlo fácilmente
    val arr_buffer = arr.toBuffer
    // Definimos un conjunto con los caracteres especiales
    val cases : Set[Char] = Set('0','1','2','3','4','5','6','7','8','9', ')')
    // Inicializamos una lista vacía que guardará los elementos que se borrarán
    var removes : List[Int] = List()
    // Definimos el caso en que en la primera posición se tenga un menos, lo agrupa con el número consecuente.
    if (arr_buffer.head == "-"){
      arr_buffer(1) = s"-${arr_buffer(1)}"
      arr_buffer.remove(0)
    }
    // Hacemos un ciclo for que vaya desde el segundo elemento de la cadena checando por "+" y "-"
    for (char <- 1 until arr_buffer.length){
      // Si encuentra un "+", checa las condiciones del caracter anterior y corrige en caso de ser necesario
      if (arr_buffer(char) == "+") {
        if (!cases(arr_buffer(char-1).last)){
          arr_buffer(char+1) = s"+${arr_buffer(char+1)}"
          removes = char :: removes
        }
      }
      // Si encuentra un "-", checa las condiciones del caracter anterior y corrige en caso de ser necesario
      else if (arr_buffer(char) == "-") {
        if (!cases(arr_buffer(char-1).last)){
          arr_buffer(char+1) = s"-${arr_buffer(char+1)}"
          removes = char :: removes
        }
      }
    }
    // Remueve caracteres en caso de ser necesario, ya que se están pegándo con los números.
    for (i <- removes) arr_buffer.remove(i)

    // Se convierte a arreglo de nuevo
    arr_buffer.toArray
  }
  def main(args: Array[String]): Unit = {
    // Se le pregunta al usuario por una expresión matemática
    val math_expresion : String = scala.io.StdIn.readLine("Ingrese expresión matemática: ")
    // Se invoca la función
    val result : Array[String] = tokenizer(math_expresion)
    // Se muestran los resultados.
    print("La lista de tokens es: ", result.toList)
  }
}
// Buen ejemplo: - 9 + 8 * ( 3 * - 1 + 5 ^ - 2 ) ^ - 2
