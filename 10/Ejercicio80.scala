object CoinFlipSimulation_80 extends App {
  var suma = 0

  for(i <- 0 until 10){
    var A = 0
    var S = 0
    var lanzamientos = 0

    while(A != 3 && S != 3){
      if(Math.round(Math.random()) == 1){
        print("A ")
        S = 0
        A = A + 1
        lanzamientos = lanzamientos + 1
      }else{
        print("S ")
        A = 0
        S = S + 1
        lanzamientos = lanzamientos + 1
      }

    }

    suma = suma + lanzamientos
    println(s"($lanzamientos lanzamientos.)")
  }

  println(s"En promedio se necesitaron ${suma/10} lanzamientos")
}
