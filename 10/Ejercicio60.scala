object RoulettePayouts_60 extends App {
    val r = scala.io.StdIn.readLine("Presione enter para girar la ruleta. ")
    val rojo = List(1,3,4,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36)

    val numeroAleatorio = Math.round(37*Math.random())
    println(s"La ruleta cayó en $numeroAleatorio ...")

    if (rojo.contains(numeroAleatorio)) {
      println(s"Paga $numeroAleatorio")
      println("Paga rojo")

      if (numeroAleatorio % 2 == 0)
        println("Paga par")
      else
        println("Paga impar")
      if (numeroAleatorio <= 18)
        println("Paga 1 a 18")
      else
        println("Paga 19 a 36")
    }

    else if (numeroAleatorio != 37 && numeroAleatorio != 0) {
      println(s"Paga $numeroAleatorio")
      println("Paga negro")

      if (numeroAleatorio % 2 == 0)
        println("Paga par")
      else
        println("Paga impar")
      if (numeroAleatorio <= 18)
        println("Paga 1 a 18")
      else
        println("Paga 19 a 36")
    }

    else{
      if (numeroAleatorio == 0)
        println("Pay 0")
      else
        println("Pay 00")
    }
}
