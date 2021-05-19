object DogYears_35 extends App{
    //Pues suponiendo que todos contamos la edad de nuestros lomitos
    //en números enteros:
    val edadHumano = scala.io.StdIn.readLine("Ingrese años normales: ").toInt

    if (0 <= edadHumano && edadHumano < 2)
        println(edadHumano*10.5)
    else if (edadHumano >= 2)
        println( (2 * 10.5) + (edadHumano - 2)*4 )
    else
      println("No hay edades negativas.")
}
