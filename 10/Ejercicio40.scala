object NameThatTriangle_40 extends App {
    val lado_1 = scala.io.StdIn.readLine("Introduzca el primer lado: ").toDouble
    val lado_2 = scala.io.StdIn.readLine("Introduzca el segundo lado: ").toDouble
    val lado_3 = scala.io.StdIn.readLine("Introduzca el tercer lado: ").toDouble

    val triangulo =
        if(lado_1 == lado_2)
            if (lado_1 == lado_3)
                "Triángulo equilátero."
            else
                "Triángulo isósceles."
        else if(lado_1 == lado_3)
            "Triángulo isósceles."
        else
            "Triángulo escaleno."

    println(triangulo)
}
