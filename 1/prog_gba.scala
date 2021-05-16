
                                                      // ############################## eje 1 ################

        // codigo postal
         println("Gerardo Brito \n" +
           "Codigo postal: 57000") 


                                                // ############################## eje 11 ################   
                                                             //galones/millas a litros/kilometros



    
      // 1 galon = 3.785 litros
      // 1 milla = 1.61 kilometros
      // 1 mpg = 235.215 l/100km

      println("Cual es la eficiencia del vehiculo en MilesPerGallon (MPG) a L/100km: ")
      var mpginto = scanner.nextDouble()

      val mpg : Double = 235.214583

      var litros_km =  division(a = mpg, b = mpginto)

      println("La conversion de GPM a Litros/km es: "+"%.2f".format( litros_km)+" litros/100 km")
      



                                                 // ############################## eje 21 ################
      //area de un triangulo
    println("Calulando el area de un triangulo:")
    println("Valor de la altura 'h':")
    var h = scanner.nextDouble()
    println("valor de la base 'b':")
    var b = scanner.nextDouble()

    var area : Double = (b*h)/2

    println("El are del triangulo es: "+ area)



                                                // ############################## eje 31 ################

//convertir klpascales-varios
    println("Valor en klPascales: ")
    var klp = scanner.nextDouble()

    val psi = 0.145038
    val mmHg = 7.50062
    val atm = 0.00986923

    println("Conversion de "+klp+" klPascales")
    println("mmHg: "+ klp * mmHg)
    println("psi: "+ klp * psi)
    println("atm: "+ klp * atm)




                                                // ############################## eje 41 ################


//notas a frecuencia
    println("Ingresa 1 nota 'C-D-E-F-G-A-B': ")
    var a = scala.io.StdIn.readChar() //lee en formato scala

    println("Ingrese el numero de octava: ")
    var octava = scanner.nextInt()


    val C4 =261.63
    val D4 =293.66
    val E4 =329.63
    val F4 =349.23
    val G4 =392.00
    val A4 =440.00
    val B4 =493.88

    var frec :Double = 0.0
   var nota = a.toUpper //convertir a mayusculas

    if (nota == 'C'){
      frec = C4
    } else if (nota == 'D'){
      frec = D4
    }else if (nota == 'E'){
      frec = E4
    }else if (nota == 'F'){
      frec = F4
    }else if (nota == 'G'){
      frec = G4
    }else if (nota == 'A'){
      frec = A4
    }else if (nota == 'B'){
      frec = B4
    }

    //proceso aritmetico

    var resta = octava-4 //
    //multiplicamos por que esta arriba del 4 
    if (octava > 4 ){
      for (i <- 1 to resta){
        frec =frec * 2
      }
      println("la frecuencia es : "+ frec+" Hz")
    } else{    //Dividimos por que esta abajo del 4
      resta = (octava -4)* (-1) //lo multiplico por -1 para hacer positivo el numero de la resta
      for (i <- 1 to resta ){
        frec = frec / 2
      }
      println("la frecuencia es: "+ frec+" Hz")
     }
    }






                                          // ############################## eje 51 ################}


  //Calificacion abcde
println("Ingresa la letra de calificacion: ")
    val letra = scala.io.StdIn.readLine() // con el readLine se puede selecionar  "n" cracter

    val A = 4.0
    val B = 3.0
    val C = 2.0
    val D = 1.0
    val F = 0
    val sig = .3 //si es "+" se suma .3, si es "-" se resta .3  
    var cal = 0.0

    val amas = "a+"
    val a = letra + char2Character('*')
    val lt0 = a(0).toUpper
    val lt1 = a(1).toUpper

    if (lt0 == 'A') {
      cal = A
    } else if (lt0 == 'B') {
      cal = B
    } else if (lt0 == 'C') {
      cal = C
    } else if (lt0 == 'D') {
      cal = D
    } else if (lt0 == 'F') {
      cal = F
      println("Tu calificacion es: " + cal)
      System.exit(0) //termina el programa
    }

    if (lt1 == '+') {
      // si la variable letra es = A+ no aumenta se mantien como cal y termina el codigo
      if (letra.toUpperCase() == amas.toUpperCase()) {
        println("Tu calificacion es: " + (cal))
        System.exit(0)
      }
      println("Tu calificacion es: " + (cal + sig))
    } else if (lt1 == '-') {
      println("Tu calificacion es: " + (cal - sig))
    } else {
      println("Tu calificacion es: " + cal)
    }
  }






                                          // ############################## eje 61 ############################



val arreglo = Array.ofDim[Int](80) //declara el areglo

    val lmt : Int = 0 //deitien ingreso de datos
    var valor : Int = 1 //para entrar al while
    var indice : Int = 0  //ligar de los elementos en el areglo, y tambien nos da el numero de elemnteos del areglo


    while (valor != lmt) {
      println("Dame el valor: ")
      valor = scanner.nextInt()
      arreglo(indice) = valor
      indice += 1
    }

          //imprime el arreglo con el for
    val lmt2 = indice -2  // restamos dos por lo que se agrego en el while un 0 y otro por que comenzo en 0
    for (j<- 0 to (lmt2)){
        print(" "+ arreglo(j))
      }

         // sumamos los elemnetos del areglo
    var suma : Double = 0  //
    for (k <- 0 to (arreglo(lmt2))) {
        suma += arreglo(k)
    }

        //sacamos promedio

      indice -= 1 //le quitamos 1 por el conteo de 0
      val prom = suma/indice
    println("\n La suma es: "+suma+
            "\n Elementos en el areglo: "+indice+
            "\n El promedio de calificaciones es: "+ prom)


                                                 // ############################## eje 71 ############################

println("Raiz cuadrada por metodo de 'Newton', valor : ")
    var radicando = scanner.nextDouble()

    var  cont : Int = 1
    var cRaiz : Double = 1

    while (cRaiz < radicando){
      cRaiz = Math.pow(cont,2)
      cRaiz = cRaiz
      cont += +1
      
    }
//si la raiz no es un entero entra al if y hace el calculo de los decimales
    var cont2: Double = 0
    if (cRaiz> radicando){
      cont2 = cont -2

      
      var i : Int = 0
      var cal: Double = 0
      var cal2 : Double = 0
     
      while (i < 5){
        cal = (radicando/cont2)
        cal2 = ((cont2+cal)/2)
        cont2 = cal2
        i += +1

      }
      println("La raiz cuadrada de "+ radicando +" es: "+"%.12f".format(cal2))
      System.exit(0)

    }

    println("La raiz cuadrada de "+ radicando +" es: "+(cont-1))
        
