object UnitsTimeAgain_25 extends App{
    val segundos = scala.io.StdIn.readLine("Ingrese segundos: ").toInt

    //Esto es esencialmente el cálculo, con base en las equivalencias bien sabidas de 1 día = 24 hrs,
    // 1hr = 60 mins y 1 min = 60 seg
    var ss = segundos % 60; val minutos = segundos/60 // Pues la idea informal es esa: ver cuantas veces
    var mm =  minutos % 60; val horas = minutos/60    // contamos 60 segundos para ver los minutos que
    var hh = horas % 24                               // pasaron y el residuo será los segundos que pasaron;
    var d = horas/24                                  // y así para horas y días :v

    //Pues esto es pa´ que quede en un formato bonito de D:HH:MM:SS
    var SS = "0" + ss.toString; SS = SS.substring(SS.length - 2, SS.length)// Y pues, hay que agregarle
    var MM = "0" + mm.toString; MM = MM.substring(MM.length - 2, MM.length)// el dígito 0 para luego tomar
    var HH = "0" + hh.toString; HH = HH.substring(HH.length - 2, HH.length)// con un substring los últimos
    val D = d.toString                                                     // dos

    println(s"D:HH:MM:SS   $D:$HH:$MM:$SS ")
}
