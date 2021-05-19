object ConvertIntToOrdinal_85 {
  def toOrdinal(x:Int):String = x match {
    case 1 => "Primero"
    case 2 => "Segundo"
    case 3 => "Tercero"
    case 4 => "Cuarto"
    case 5 => "Quinto"
    case 6 => "Sexto"
    case 7 => "Séptimo"
    case 8 => "Octavo"
    case 9 => "NOveno"
    case 10 => "Décimo"
    case 11 => "Undécimo"
    case 12 => "Duoécimo"
    case _ => ""
  }

//Método principal
  def main(args: Array[String]): Unit = {
    for(i<-(0).to(12)) println(s"$i --> " + toOrdinal(i))
  }

}
