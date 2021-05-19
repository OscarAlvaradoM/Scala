object CaesatCipher_70 extends App {
  //Este programa no considera la letra ñ como en el libro.
  var mensaje = scala.io.StdIn.readLine("Ingrese mensaje: ")
  var parametro = scala.io.StdIn.readLine("Ingrese parametro de desplazamiento: ").toInt

  val mensajeCifrado = for(i <- mensaje) yield {
    if(i.isLetter){
      if(i.isUpper){
        if(((i.toInt - 65) + parametro) >= 0){
          (((i.toInt - 65) + parametro) % 26 + 65).toChar
        }else{
          ((((i.toInt - 65) + parametro) % 26 + 26) + 65).toChar
        }
      }else{
        if(((i.toInt - 97) + parametro) >= 0){
          (((i.toInt - 97) + parametro) % 26 + 97).toChar
        }else{
          ((((i.toInt - 97) + parametro) % 26 + 26) + 97).toChar
        }
      }
    }else{
      i
    }
  }
  
  println(mensajeCifrado)
}
