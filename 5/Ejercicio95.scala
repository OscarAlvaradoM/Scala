object RandomLicensePlate_95 {
  def placaAleatoria():String = {
    var temp = Math.round(Math.random()) // para ver si generamos una placa nueva o vieja
    var placa = ""

    //Suponiendo que las placas son generadas con letras mayúsculas
    if(temp == 0){
      for(i <- (0).to(5)) yield {
        if(i < 3){
          placa = placa + (Math.round(Math.random()*26) + 65).toChar
        }else{
          placa =placa + (Math.round(Math.random()*10) + 48).toChar
        }
      }
    }else{
      for(i <- (0).to(6)) yield {
        if(i<5){
          placa = placa + (Math.round(Math.random()*10) + 48).toChar
        }else{
          placa = placa + (Math.round(Math.random()*26) + 65).toChar
        }
      }
    }
    return placa
  }

 //Método principal
  def main(args: Array[String]): Unit = {
    println(placaAleatoria())
  }

}
