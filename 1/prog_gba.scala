
                                  //galones/millas a litros/kilometros
    def eje11(): Unit ={
      // 1 galon = 3.785 litros
      // 1 milla = 1.61 kilometros
      // 1 mpg = 235.215 l/100km

      println("Cual es la eficiencia del vehiculo en MilesPerGallon (MPG) a L/100km: ")
      var mpginto = scanner.nextDouble()

      val mpg : Double = 235.214583

      var litros_km =  division(a = mpg, b = mpginto)

      println("La conversion de GPM a Litros/km es: "+"%.2f".format( litros_km)+" litros/100 km")
      }
