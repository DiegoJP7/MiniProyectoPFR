//Resolucion Del Parcial 1
val nros = List(727.7, 1086.5, 1091.0, 1361.3, 1490.5, 1956.1)
//Promedio
def promedio(valores: List[Double]): Double = valores.sum / valores.size
//Desviacion Estandar
def desEst(valores: List[Double]): Double = {
  val avg = promedio(valores)

  //Varianza
  def varianza(valores: List[Double]): Double =
    valores.map(x => Math.pow(x - avg, 2)).sum * (1.0 / (valores.size - 1))

  Math.sqrt(varianza(valores))
}
promedio(nros)
desEst(nros)
//Contar los elementos con condicion
//Solucion de Jorge Lopez
def clasifica(valores: List[Double]): Unit = {
  val s = desEst(valores)
  val avg = promedio(valores)

  (1 to 3).foreach(i =>
    println(valores.count(x =>
      x >= (avg - i * s) && x <= (avg + i * s))))
}
clasifica(nros)

//Tuplas
//No contructores, no atributos, no getters
//Tuplas de 1 a 22 elementos
//UN contenedor de datos donde cala elemento puede ser de diferente tipo
//La idea es que contenga un solo elemento
//Ejemplllos tuplas de 2
val par = (1, "Abad Ana")
println(par)
//Se debe encerrar entre parentesis y separar por una coma

//Como acceder
//Se usa el guion bajo y el punto junto al indice del elemento a acceder
println(par._1)
println(par._2)

//Como declarar su tipo
val student = (1, "Abad Ana")
val datos = ("diegojp", 'M', 45, 95.2, true)
//DEPENDE DEL NUEMRO DE ELEMENTOS Y EL TIPO DE DATOS DE CADA UNO
val studen: Tuple2[Int, String]
val datos: Tuple5[ String,  Char,  Int,  Double,  Boolean]
//Tuplas Puras
val student = (1, "Abad Ana")
val (edad,nombre)=student
println(edad)
println(nombre)
//Darle la vuelta
student.swap
//Puede ser igual
student.canEqual((1, "Abad Ana"))

//Estructura de datos funcionales(Estructuras de datos inmutables)
//                                          Listas
//-Elemento similar al arreglo
//Arreglo
//  -Son inmutables
//  -Se representan como listas enlazadas
//Declaracion
val values = List(43,31,36,40,43)
val names =List("jorge","rene")

val fruit:List[String]=List("apple","Orange")
val nums:List[Int]=List(1,2,3,4)

//Operaciones
val myList=List(10,20,30,40,50,60)
myList.isEmpty
myList.drop(2)
myList.dropWhile(_<25)
myList.slice(2,4)
myList.tail
myList.take(3)
myList.takeWhile(_<30)
myList.sorted
myList.sorted(Ordering.Int.reverse)

//FoldLeft
myList.foldLeft(0)((x,y)=>x+y)
myList.foldLeft(0)(_+_)
//FoldRight
myList.foldRight(0)((x,y)=>x+y)
myList.foldRight(0)(_+_)

//FoldLeft ejemplos
def average(valores: Seq[Double]) : Double = {
  val t = valores.foldLeft((0.0, 0))((acc, currVal) => (acc._1 + currVal, acc._2 + 1))
  t._1 / t._2
}
average(nros)
def average(valores: Seq[Double]):Double={
  val t= valores.foldLeft((0,0,0)) { (acc, currVal) =>
    val sum = acc._1 + currVal
    val cont = acc._2 + 1
    printf("suma %f - contador %d%n", sum, cont)
    (sum, cont)
  }
  t._1/t._2
}

//Zip
val myList=List(10,20,30,40,50,60)
val names=List("El pepe","Patricio")
names.zip(myList)
//Unzip
val zippedList:List[(String,Int)]=
  List(("Guido",10), ("Armando",20), ("Patricio",30), ("Manuel",40), ("Germania",50), ("Fanny",60))
val unzippedLists: (List[String], List[Int]) = zippedList.unzip

unzippedLists._1
unzippedLists._2
val goleadores = List(
  ("Oscar Becerra", 17),
  ("Luis Amarilla", 16),
  ("Michael Estrada", 16),
  ("Fidel Martinez", 16),
  ("Gonzalo Mastriani", 13),
  ("Leonel Vides", 13),
  ("Rodrigo Aguirre", 12),
  ("Carlos Garces", 12),
  ("Jonathan Borja", 11))

