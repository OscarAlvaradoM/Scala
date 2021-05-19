object DoesRepresentInteger_90 {
  def isInteger(caracteres:String):Boolean = {
    var FoV = true
    var iter = 0

    caracteres.replaceAll("\\s", "")

    for(i <- caracteres){
      if(caracteres.length == 1){
        FoV = FoV && i.isDigit
      }else{
        if(iter == 0 && (i == '+' || i == '-') ){
          iter = iter + 1
        }else{
          FoV = FoV && i.isDigit
        }
      }
    }
    return  FoV
  }

//Método principal
  def main(args: Array[String]): Unit = {
    var cadena = scala.io.StdIn.readLine("Ingrese una de cadena: ")

    if(isInteger(cadena))
      println("Su cadena es un número entero.")
    else
      println("Su cadena no es un número entero.")
  }
}
