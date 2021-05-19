object PerimeterOfAPolygon_65 extends App {
  //Tomaremos la siguiente definición de polígono.
  //Polígono: Linea poligonal cerrada.
  //Linea poligonal: Conjunto de segmentos s_1, ... , s_n unidos sucesivamente
  //por sus extremos donde el extremo de cada uno es el origen del siguiente
  //tal que dos segmentos sucesivos no están alineados.
  //Sean P_i y P_{i+1} los extremos de s_i, entonces: Si los dos extremos li-
  //bres P_1 y P_{n+1} no coinciden se dice que la linea poligonal es abierta
  //De lo contrario cerrada.
  var x_inicial = scala.io.StdIn.readLine("Ingrese coordenada x: ").toDouble
  var y_inicial = scala.io.StdIn.readLine("Ingrese coordenada y: ").toDouble
  var x_1 = x_inicial
  var y_1 = y_inicial
  var x = ""
  var y = 0.0
  var perimetro = 0.0
  var longitud = 0.0

  do{
    x = scala.io.StdIn.readLine("Ingrese la coordenada x (espacio para salir):")
    if (x != " "){
      var a = x.toDouble
      y = scala.io.StdIn.readLine("Ingrese coordenada y: ").toDouble
      longitud = Math.sqrt((a - x_1)*(a - x_1) + (y - y_1)*(y - y_1))
      perimetro = perimetro + longitud
      x_1 = a
      y_1 = y
    }else {
      longitud = Math.sqrt((x_1 - x_inicial) * (x_1 - x_inicial) + (y_1 - y_inicial) * (y_1 - y_inicial))
      perimetro = perimetro + longitud
    }
    }while(x != " ");

  println(perimetro)
}
