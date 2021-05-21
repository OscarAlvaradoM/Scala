/*Ejercicio62
A particular retailer is having a 60 percent off sale on a variety of discontinued
products. The retailer would like to help its customers determine the reduced price
of the merchandise by having a printed discount table on the shelf that shows the
original prices and the prices after the discount has been applied. Write a program that
uses a loop to generate this table, showing the original price, the discount amount,
and the new price for purchases of $4.95, $9.95, $14.95, $19.95 and $24.95. Ensure
that the discount amounts and the new prices are rounded to 2 decimal places when
they are displayed.*/
object Ejercicio062 {
  def main(args: Array[String]): Unit = {
    // Definimos la lista de los precios a mostrar
    val precios : List[Double] = List(4.95, 9.95, 14.95, 19.95, 24.95)
    // Mostramos el encabezado de la tabla, los "\t" representan un tabulador
    println("Producto\t| Precio\t| Descuento\t| Nuevo_precio")
    // Comenzamos nuestro for loop con un rango para mostrar el número de producto
    for (i <- 1 to 5) {
      // Definimos el precio indexando a partir de los precios, le restamos uno porque en scala se indexa desde 0
      val precio : Double = precios(i-1)
      // Calculamos el descuento del producto y su nuevo precio
      val descuento : Double = precio*0.6
      val nuevo : Double = precio - descuento
      // Mostramos el nombre del producto, su precio, el descuento y su nuevo precio en formato del encabezado.
      println(s"producto $i \t| "+"$"+f"$precio \t| "+"$"+f"$descuento%.2f \t| "+"$"+f"$nuevo%.2f")
    }
  }
}
