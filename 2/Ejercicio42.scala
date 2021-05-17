// Ejercicio 42
/*In the previous question you converted from note name to frequency. In this question
you will write a program that reverses that process. Begin by reading a frequency
from the user. If the frequency is within one Hertz of a value listed in the table in
the previous question then report the name of the note. Otherwise report that the
frequency does not correspond to a known note. In this exercise you only need to
consider the notes listed in the table. There is no need to consider notes from other
octaves.*/
object Ejercicio42 {
  def main(args: Array[String]): Unit = {
    print("Introduzca la frecuencia: ")
    // Recibimos la nota como Double ya que incluye a los enteros en caso de A4 y G4
    val frecuencia: Double = scala.io.StdIn.readDouble()
    // Construimos una variable tipo Map que reciba ciertas frecuencias y arroje las notas correspondientes
    val mapeo = Map(261.63 -> "C4", 293.66 -> "D4", 329.63 -> "E4", 349.23 -> "F4", 392.0 -> "G4",
      440.0 -> "A4", 493.88 -> "B4")
    // Recolectamos únicamente las llaves del Map y lo volvemos un conjunto para usar después un método especial
    val frecuencias_notas = mapeo.keys.toSet
    // Utilizamos la suggar syntax equivalente a frecuencias_notas.contains(frecuencia) para ver si la 
    // frecuencia que se ingresó está dentro de las frecuencias para las que se tienen sus notas.
    if (frecuencias_notas(frecuencia)){
      // En caso de que sí se encuentre dentro de este conjunto, se hace el mapeo y se imprime la nota
      val nota : String = mapeo(frecuencia)
      print(s"La frecuencia que ingresaste corresponde a la nota: $nota")
    }
    // En caso de que no esté en la lista de frecuencias asociadas a notas, se devuelve un mensaje 
    // comentando esto. 
    else {
      print(s"La frecuencia de $frecuencia Hz no corresponde a ninguna nota.")
    }
  }
}

