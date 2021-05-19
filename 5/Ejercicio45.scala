object WhatColorIsThatSquare_45 extends App {
    val posicion = scala.io.StdIn.readLine("Ingrese posición (Ej: f5): ")

    //Para ver qué color es, imaginemos al tablero como un producto cartesiano donde el origen, es decir,
    //(0,0), es a1. Así pues, notemos que si la suma de las coordenadas es par, la casilla es negra;
    //si es impar, blanca.
    val columna = posicion.charAt(0).toInt
    val fila = posicion.charAt(1).getNumericValue

    val color =
        if (((columna - 97) + (fila - 1)) % 2 == 0)
            "Negro"
        else
            "Blanco"
    println(s"Color: $color")
}
