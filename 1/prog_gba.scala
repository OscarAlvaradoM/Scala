
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



    println("Ingresa 1 nota 'C-D-E-F-G-A-B': ")
    val a = scala.io.StdIn.readChar()

    println("Ingrese el numero de octava: ")
    val octava = scanner.nextInt()


    val C4 =261.63
    val D4 =293.66
    val E4 =329.63
    val F4 =349.23
    val G4 =392.00
    val A4 =440.00
    val B4 =493.88

    var frec :Double = 0.0
    val nota = a.toUpper   // convertir a mayusculas

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

    //indica si la octava  es mayor o menor a 4 que es la media
    var resta = 0
    if(octava >=4 ){
      resta = octava-4
    }else{
      resta = (octava -4) * (-1)  //lo multiplico por -1 para hacer positivo el numero de la resta
    }

    //proceso aritmetico

    if (octava >= 4 ){
      for (i <- 1 to resta){
        frec =frec * 2     //multiplicamos por que esta arriba del la octava 4.
      }
      println("la frecuencia de la nota "+nota+octava+" es: "+frec+" Hz")
    }
    else if(octava <=3){
      for (i <- 1 to resta){
        frec =(frec * 2 ) /4   // se divide por que esta abajo del la octava 4 
      }
      println("la frecuencia de la nota "+nota+octava+" es: "+frec+" Hz")
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
                                    //saca promedio de N numeros ingresador por el user, se usa como fin cuando el user pone un 0 
                                    // y comienza el proceso aritmetico.


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
                                                    //raiz cuadrada por metodo de newton (aproximacion con 10 a la-12)

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


        
                                             // ############################## eje 81 ############################
                                                                      //Teoream de pitagoras

println("Calculando Hiponusa de triangulo rectangulo con 'teorema de pitagoras'")
    println("Medida del primer lado 'a': ")
    val a = scanner.nextDouble()
    println("Medida del segundo lado 'b': ")
    val b = scanner.nextDouble()

    val h :Double = math.pow(a,2) + math.pow(b,2)

    println("Hipotenusa es c^2 = : "+h+" y obteniendo la raiz es  c = : "+ "%.4f".format(math.sqrt(h)))



                                               // ############################## eje 91 ############################
                                                //el user ingresa formula con operadores, identifica y muesta que relevancia tiene cada operador
println("Formula: ")
    val formu = scanner.nextLine()

    var i: Int = 0
    var a, b, c: Int = 0
    val sum = '+'
    val res = '-'
    val mul = '*'
    val div = '/'
    val exp = '^'

    while (i < formu.length) {

      println(formu(i))
      if (formu(i) == sum || (formu(i) == res)) {
        a += +1 
      } else if (formu(i) == mul || (formu(i) == div)) {
        b += +1      
      } else if (formu(i) == exp) {
        c += +1
      }
      i += +1
    }

    if (a == 0 && b == 0 && c == 0) {
      println("No hay operadores")
    }

    println("Hay: " + a + " ('+' '-') con valor: 1")
    println("Hay: " + b + " ('*' '/') con valor: 2")
    println("Hay: " + c + " ('^')     con valor: 3")


                                         // ############################## eje 101 ############################
                                        //++++ Reduciendo un fraccion a la minima expresion con numeros primos

 //println("Ingresa Numero:")
   
    var arreglo = Array.ofDim[Int](50) //declaramos el areglo con 50 espacios en memoria

    val num: Int = 100 //100 limite de busqueda de numeros primos pero no son los primeros 100 numeros primos
    var count: Int = 0 // modulo del 1 y 2  = 0  es primo y se guarda en el areglo
    var indice: Int = 1 // el indice de los elementos del areglo

    //Calcula los numeros primos
    
    //Calcula los numeros primos
    //println("1")
    for (i <- 1 to num) { //1,2,3,
      //println("Val i: "+i) //este prin es para ver el recorrido del for, se puede quitar
      count = 0 //0,0,1,2,0,
     // println("count: "+count)  //print para ver recorrido de for,se puede quitar
      for (j <- 1 to i) { //1,2,
        //println("val j: "+j)     //print para ver recorrido de for,se puede quitar
        if (i % j == 0) { //numeros primos : divisibles entre si mismos y 1
          count += 1
         // println("count: " +count)   //print para ver recorrido de for,se puede quitar
          arreglo(0) = 1
        }
      }
      //si es un primo llena el arreglo
      if (count == 2) { // si cumple la condicion de nprimo el cont sera =  2 y por eso se guarda en el areglo
        //println(i)
        arreglo(indice) = i //el valor del arreglo en el lugar de indice sera = i  , se llena el arreglo con los nprimos
        indice += 1
      }
    }
/*
    //Imprime el areglo
    println("---------------")
    for (a <- 0 to indice) {
      if (arreglo(a) != 0) { //para que no imprima el ultimo valor del areglo que es 0
        println("-------------")
        println(a + " - " + arreglo(a))
      }
    }
 */

    println("Valor de numerador: ")
    val numer = scanner.nextInt()
    println("Valor Denominador: ")
    val denomi = scanner.nextInt()


    var x : Int = 1
    var y : Int = 0
    var g : Int =1
    var operacion1,operacion2 : Int = 0
//asigne nuevas variables para poder cambiar unas y mantener el valor original de user.
    var numerador = numer
    var denominador = denomi
    while(x < indice) {
      //println("valor de x: "+x)
      while (y < x) {
        if(numerador % arreglo(x) ==0 && denominador % arreglo(x) == 0){  // 10 % 2 ==0
          println("Numero primo: "+arreglo(x))
          println("Numerador: " +numerador)
          println("Denominador: "+ denominador)
          operacion1 = numerador / arreglo(x)
          operacion2 = denominador / arreglo(x)
          println("operacion1: "+operacion1)
          println("Operacion2: "+operacion2)
          println("----------")
          numerador = operacion1
          denominador = operacion2
        }
        y += 1
      }
      x += 1
    }
    println("La reduccion de: "+numer+"/"+denomi+" es "+numerador+"/"+denominador)
   
  }
                                        // ############################## eje 111 ############################

//eliminar caracteres
 println("Escribe las palabras con caracteres y los eliminara el programa: ")
    val textoentra = scanner.nextLine()

    println(textoentra)

    val txtlimpio = textoentra.replaceAll("[,!&/(#)='%¡¿$|{};¨´:._+*-]", "")

    println(txtlimpio)
                                        // ############################## eje 121 ############################

                                                                    //quicksort
import java.lang.Math
import scala.math._
import java.util.{Objects, Random, Scanner, StringTokenizer}
import scala.Array.ofDim
import java.util.StringTokenizer
import scala.collection.mutable.ArrayBuffer
import java.util.Arrays
import java.lang.Integer.{MAX_VALUE, MIN_VALUE, compare, parseInt, reverseBytes, sum}
import java.{lang, util}
import java.util.Arrays.sort
import scala.util.matching.Regex.Match //para comparar objetos eje91

object ordena {

  def main(args: Array[String]): Unit = {
    import programas.scanner


    println("limite de elementos: ")
    val limitElementos = scanner.nextInt()

    val arreglo = Array.ofDim[Int](limitElementos) //declara el areglo
    //val arreglo: Array[Int] = Array(1,2,3,5,3,4,63,624,4,4,643,7)


    var valor: Int = 0
    var cont: Int = 0

   // println("areglo.leng "+ arreglo.length)
    //lenado de areglo con valores
    var i = 0

    while (i < arreglo.length){
      println("ingresa valor "+(i+1)+":")
      valor = scanner.nextInt()
      arreglo(i) = valor
      cont += 1
      i += 1
    }

    println("Arreglo inicial: ")
   // imprime(arreglo)

   println("Areglo ordenado")
   quick(arregloq = arreglo,0,arreglo.length-1) // del indice 0 al indice final -1

  }


  //metodo ordenamiento quicksort:
  def quick(arregloq: Array[Int],primero:Int,ultimo:Int): Unit ={

    var i = primero
    var j = ultimo
    var aux = 0
    val pivote = arregloq((primero+ultimo)/2)

    do{
      while (arregloq(i) < pivote){
        i +=1
      }
      while (arregloq(j)> pivote){
        j -= 1
      }
      //intercambio de valores en el arreglo
      if (i<= j){
        aux =arregloq(i)
        arregloq(i)= arregloq(j)
        arregloq(j)= aux
        i += 1
        j -= 1
      }

    }while(i<=j)

    //hace la creacion de las dos listas
    if(primero < j){
      quick(arregloq,primero,j)
    }
    if(i< ultimo){
      quick(arregloq,i,ultimo)
    }

    imprime(arregloq)

    }


  def imprime(arregloi: Array[Int]): Unit = {

    var i =1
    do {
          print(arregloi(i)+" ")
      i +=1
    }while (i< arregloi.length)
    println(" ")
  }
}
                                        // ############################## eje 141 ############################
                                        //++++ //Muestra el encabezado de un texto ()primeras 10 lineas

   //leemos el texto
    val path: String = "C:\\Users\\CONSULTOR\\Desktop\\gba.csv"

    //convertimos el texto en una reglo
    val read = Source.fromFile(path).getLines.toArray

    //leemos las primeras 10 lineas del texto para ver si hay titulo
    println("Primeras 10 lineas")

  for (i <- 0 to 10) {
    println(read(i))
    }
  }



                                        // ############################## eje 151 ############################
                                        //++++ //creacion de password con palabras random

import scala.io.Source
import scala.util.Random
import java.util.Random

//creacion de password con palabras random
object eje151 {

  def main(args: Array[String]): Unit = {

  println("Generador de contraseñas con palabras: ")
  println("Numero de palabras en el pass: ")
  var lword = scala.io.StdIn.readInt()

    val nwps : String = "C:\\Users\\CONSULTOR\\Desktop\\pass.csv"
    val read = Source.fromFile(nwps).getLines.toArray

  //llamamos la funcion proceso
    proceso(pass = read,lword1 = lword)
  }

  //funcion proceso
def proceso(pass :Array[String],lword1 : Int): Unit ={

  //variavel txt contiene el texto del archivo
  val txt = pass
  val txt_len = txt.length.toInt

  var limite : Int = lword1 //El limite de palabras


    println("Pass Aleatorio de palabras")

  val arreglo = Array.ofDim[String](200)

 if (limite > txt_len) {
    limite = txt_len
 }

 
  //SE llena el areglo con la nueva pass con el txt con palabras

   for (i <- 0 to limite){
    val rdm = (Math.round(Math.random()*txt_len)+1).toInt //random para
    arreglo(i)= txt(rdm)
  }


  //imprime areglo con nueva pass
    for(i <- 1 to limite){
      print(arreglo(i))
    }
  }



}

                            // ############################## eje 164 ############################
                              //++++ pide cualquier elemento a user y al poner el gatillo se detiene e imprime lo que puso

 def main(args: Array[String]): Unit = {
    val arreglo = Array.ofDim[String](80) //declara el areglo con los espacios


    var valor: String = "" //para entrar al while
    var indice: Int = 0 //ligar de los elementos en el areglo, y tambien nos da el numero de elemnteos del areglo

    println("Cual sera el elemento break: ")
    val lmt = scala.io.StdIn.readLine() //deitien ingreso de datos

    while (valor != lmt) {
      println("Dame el elemento" + indice + ": ")
      valor = scala.io.StdIn.readLine()
      arreglo(indice) = valor
      indice += 1
    }
    //llama a imprime
    println("\nEstos son los "+(indice-1)+" elementos que ingresaste: ")
    imprime(arreglo = arreglo,indice= indice)
    println("\nCon el break: "+ lmt)
  }


  def imprime(arreglo:Array[String],indice : Int): Unit ={

    //imprime el arreglo con el for
    var lmt2 = indice - 2 // restamos dos por lo que se agrego en el while un 0 y otro por que comenzo en 0
    for (j <- 0 to (lmt2)) {
      print(" " + arreglo(j) + ",")
    }

  }





