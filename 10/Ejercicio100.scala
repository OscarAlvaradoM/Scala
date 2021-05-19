object DaysInAMonth_100 {
  //Método para ver si el año es bisiesto
  def isLeapYear(año:Int): Boolean = {
    if(año % 4 != 0){
      false
    } else {
      if(año % 100 != 0){
        true
      } else{
        if(año % 400 != 0){
          false
        } else{
          true
        }
      }
    }
  }

  //Método que cuenta cuantos días hay en el mes del año indicado
  def dias(mes:Int, año:Int):Int = {
    if(isLeapYear(año)){
      var dias = mes match {
        case 1 => 30
        case 2 => 29
        case 3 => 31
        case 4 => 30
        case 5 => 31
        case 6 => 30
        case 7 => 31
        case 8 => 31
        case 9 => 30
        case 10 => 31
        case 11 => 30
        case 12 => 31
        case _ => 0
      }
      return dias
    }else{
      var dias = mes match {
        case 1 => 30
        case 2 => 29
        case 3 => 31
        case 4 => 30
        case 5 => 31
        case 6 => 30
        case 7 => 31
        case 8 => 31
        case 9 => 30
        case 10 => 31
        case 11 => 30
        case 12 => 31
        case _ => 0
      }
      return dias
    }

  }

//Método principal
  def main(args: Array[String]): Unit = {
    var m = scala.io.StdIn.readLine("Ingrese número del mes (Ej: 2 si Febrero, 11 si Noviembre): ").toInt
    var a = scala.io.StdIn.readLine("Ingrese año: ").toInt
    print(dias(m,a))
  }
}
