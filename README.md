# MiniProyectoPFR

# Semana 4

```scala
//Mal
val cedula ="1105109282"
cedula = "1105109281"

//Bien(valor no puede cambiar)
val cedula ="1105109282"
val cedula ="1105109281"

//Mal corregido(no trabajar con var)
var cedula ="1105109282"
cedula = "1105109281"
//Funcion
(x : Double)=> - Math.pow(x,2)+8*x-12
val f1 = (x:Double)=> -Math.pow(x,2)+8*x-12
f1(12)
((x:Double)=> -Math.pow(x,2)+8*x-12)(12)
//V2
val f1Val=f1(12)

//
def integracion(a:Int,b:Int,f:Double=>Double)={

}

//
def integracion1(a:Int,b:Int,f:Double=>Double)={
  val intermedio=((a+b)/2.0)
  // (a+b)/2.toDouble
          //2.0
          //2*1.0
  val fa=f(a);
  val fi=f(intermedio)
  val fb=f(b)
  (b-a)*(fa+4*fi+fb)/6
}
//Funcioon que devuelve funcion
def select(option: Char):(Int,Int)=>Double={
  option match{
    case '+'=> (a:Int,b:Int)=>a+b
    case '-'=> (a:Int,b:Int)=>a-b
    case '*'=> (a:Int,b:Int)=>a*b
    case '/'=> (a:Int,b:Int)=>a/b.toDouble
    case _ => (a:Int,b:Int)=>0/(a/b)
  }
}

select('+')(2,1)
select('*')(4,4)
select('-')(4,5)
select('/')(8,2)
val operation = select('+')
operation(2,1)

//Datos de secuencias
//forma 1
val isEven = (k : Int)=>if(k%2==0)1 else 0
//forma 2
def isEven(k: Int): Int = (k % 2) match {
  case 0 => 1
  case _ => 0
}
//Lista
List(1,2,3)
List(1,2,3).sum

//map
List(1,2,3).map(x=>x*x+100*x)
//res1: List[Int]=List(101,204,309)

def func1(x: Int):Int=x*x+100*x

List(1,2,3).map(func1)
//res3: List[Int] = List(101,204,309)

List(1,2,3) map func1 //dotless infix

//
val nums = List(1,2,3)
nums.map(x => x+1)
//Manera 2
def add1(a:Int):Int=a+1
nums.map(add1)
//Manera 3
nums.map(x=>add1(x))
//Manera 3 V2
nums.map(add1(_))

//
val suma2 = (a:Int,b:Int)=>a+b
//mal
nums.map(suma2)
nums.map(x=>suma2(x))
nums.map(suma2(_))
//Solucion
nums.map(x=>suma2(x,x))
//map devulve una nueva lista

nums map add1

//eeven

def isEven(k:Int):Int=(k%2) match{
  case 0=>1
  case _=>0
}
def countEven(s:List[Int]: Int= s.map(isEven).sum

//Otra manrea
def countEven (s:List[Int]):Int=s.map(k=>if(k%2==0)1 else 0).sum
def cuntEven (s:List[Int]):Int=s.map(k=>if(k%2==0)1 else 0).sum

def countEven(s: List[Int]): Int = {
  def isEven(k: Int): Int = (k % 2) match {
    case 0=>1
    case _=>0
  }
  s.map(isEven).sum
}
countEven(List(12,14,9,7,5,4,40))

```

# Semana 5

```scala
//Mapeo
def isEven(k: Int): Int = (k % 2) match {
  case 0 => 1
  case _ => 0
}
def counEven(s: List[Int]): Int = s.map(isEven).sum

// Variante 2
def countEven(s: List[Int]): Int = {
  def isEeven(k: Int): Int = (k % 2) match {

    case 0 => 1
    case _ => 0
  }

  s.map(isEven).sum
}

//Variante 3
def countEvenn(s: List[Int]): Int = {
  val isEven = (k: Int) => k % 2 match {
    case 0 => 1
    case _ => 0
  }
  s.map(isEven).sum
}

//Ejer 1
val names: List[String] = List("Leo", "Cristiano", "Enner", "Felipe")
names.map(_.length)

//Ejer2
val numbers = List(3, 4, 7, 11, 12)
val isPrime = (nro: Int) => (2 to nro - 1).forall(nro % _ != 0)
numbers.map(isPrime(_) match {
  case true => 1
  case false => 0
}).sum

//Ejer3
val numers = List(6, 28, 15, 12, 11, 24)
numers.max
numers.min
numers.size

//ForAll
def isPrimee(nro: Int): Boolean = (2 until nro).forall(nro % _ != 0)
//Exist
def isPrime2(nro2: Int): Boolean = !(2 until nro2).exists(nro2 % _ == 0)
//Filtrar
List(1, 2, 3, 4, 5).filter(k => k % 3 != 0)
//Truncamiento
List(1, 2, 3, 4, 5).takeWhile(k => k % 3 != 0)

//Ejer3 Resolucion
val divP = (n: Int) => (1 until n).filter(div => n % div == 0).sum
divP(6)
val numers2 = List(6, 28, 15, 12, 11, 24)
val sumDivv = (nro2: Int) => (1 until nro2).filter(div => nro2 % div == 0) sum
  numers2.filter(nro2 => nro2 == sumDivv(nro2)).size

//Ejer1
//Factorial escalonado
def !!(n: Int): Int = {
  n % 2 match {
    case 0 => (2 to n by 2).product
    case _ => (1 to n by 2).product
  }
}
!!(8)
!!(9)
//Ejer 2
//Pares
val numerss = (1 to 20).toList
numerss.filter(nro => nro % 2 == 0).size
numerss.count(nro => nro % 2 == 0)

//impares
numerss.filter(nro => nro % 2 != 0).size
numerss.count(nro => nro % 2 != 0)

//Primos
def contarPrimos(nros: List[Int]): Int = {
  val isPrime = (n: Int) => (2 until n).forall(n % _ != 0)
  //nros.filter(isPrime).size
  nros.count(isPrime)
}
contarPrimos(numerss)

//Ejer 3
//3 Factores
def tresFactores(nros: List[Int]): List[Int] = {
  val esFactor = (n: Int) => (2 until n).filter(n % _ == 0)
  nros.filter(nro => esFactor(nro).size == 3)
}
tresFactores((1 to 1000).toList)

```

# Semana 6 
```scala
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

```
# Semana 7
```scala
//Tuplas y listas
val goleadores = List(
("Francisco Fydriszewski", 10),
("Joaquin Vergés", 9),
("Santiago Giordana", 9),
("Ismael Díaz", 8),
("Tomás Molina", 7),
("Danny Luna", 7),
("Cristian Martinez", 7),
("Gabriel Cortez", 7),
("Leonardo Villagra", 6),
("Michael Hoyos", 6))

goleadores.groupBy{case(_, goals)=>goals}
goleadores.groupBy(row=>row match{
  case(_,goals)=>goals
}) .map(row=>row match{
  case (goles,lista)=>(goles,lista.size)
}).toList.sortBy(_._2)

//Ejercicio

println("--------------------------------------------")
println("Promedio")
val goles=goleadores.map(_._2).map(_.toDouble)
val average=
  (values: List[Double])=>values.sum/values.length
val avgGol=average(goles)
println("Promedio de Goles"+avgGol)

println("-------------------------------------------------")
println("Goleador Maximo = "+goleadores.maxBy(_._2)._1)
println("Goleador Minimo = "+goleadores.minBy(_._2)._1)

println("-------------------------------------------------")
val mayoresAvg=goleadores.filter(_._2>avgGol).map(_._1)
val menoresAvg=goleadores.filter(_._2<avgGol).map(_._1)


println("Goleadores mayores al promedio = "+mayoresAvg)
println("Goleadores menores al promedio = "+menoresAvg.reverse)


//Conjuntos
val conj2:Set[Int]=Set()
val conjunto: Set[Int] = Set(1, 1, 2, 2, 2, 3)

//Algunas Funciones
val confunto: Set[Int] = Set (1, 2, 3)
val conNuevo = confunto + 6

val conjunto2: Set[Int] = Set (1, 2, 3)
val conjNuevo = conjunto.concat(List(2, 3, 4, 5))

val conjjunto: Set[Int] = Set(1, 2,3)
val conlivevo = confunto.concat(List(2, 3, 4, 5))
conlivevo.intersect(conjjunto)

//Mapas
//Dicionario o mapa

//Mapas en Scala
//Map[K,V]
//K= Claves
//V= valores
println(Map(("apple",3),("orange",2),("pears",0)))
//Mal, las llaves tienen que ser del mismo tipo
Map((1,2),("ABC",100))
Map((1,2),("ABC",100.2),(10.10,true))

//Otra forma de representar
Map(("apple"->3),("orange"->2),("pears"->0))
//Converir lista a Map
List(("apple",3),("orange",2),("pears",0)).toMap
List(("apple"->3),("orange"->2),("pears"->0)).toMap
//Mala coversion, solo se necesita tuplas 2
List((1,2,3),(4,5,6)).toMap

//Mapa a secuaencia de pares (Lista)
Map(("apple"->3),("orange"->2),("pears"->0)).toSeq
Map(("apple"->3),("orange"->2),("pears"->0)).toList

//Funciones
val fruitbasket=Map(("apple"->3),("orange"->2),("pears"->0))
fruitbasket.map(data=>data match{
  case(fruit,count)=>count*2
})
//Simplificad
fruitbasket.map{case (fruit,count)=>count*2}

fruitbasket.map{ case (fruit, count) => (fruit, count, count*2)}
  .map{case (fruit,_, count2) => (fruit, count2 / 2)}.toMap

//Filter
fruitbasket.filter{case (frui,count)=> count==3}

//GroupBy
println(Seq("Wombat","Xanthan","yogurt","Zebra").
  groupBy(s=>if (s startsWith "y")1 else 2))
List(1,2,3,4,5).groupBy(k=>k%3)
```
# Semana 8

```scala
//Efectos colaterales
//Ejemplo
//
int count=0;
void addOne(){
  count=count+1;
}

//Otro ejemplos
//La llamada al la funcion print("hola") imprimira algo y no delvolvera nada
newState=print("Hola")+oldState

//Efectos colaterales si se modifica el valor de una variable o de estructuras de datos mutables
//Utilizar mecanismos de entrada y salida(IO)
//Lanza una exception
//Se detiene por un error

//Soluciones
//La solucion es dejar de usar efectoes colaterales y codificarlos en el valor de retorno

def division(n1:Double, n2:Double)=
  if(n2==0)throw new RuntimeException("Division por 0")
  else n1/n2

division(4,0)

//Funcion Pura
import scala.util.Try
def pureDivision(n1:Double, n2:Double):Try[Double]=
  Try{division(n1, n2)}

pureDivision(4,1)

//Otra forma
val result=pureDivision(1,3)

import scala.util.{Success,Failure}

result match{
  case Success(v)=>println(v)
  case Failure(e)=>println(e.getMessage)
}

//Option/Some/None
//java Ejemplo
/*
String search(String id){
  ...>     var students=List.of("1-Valencia","2-Caicedo","3-Galindez");
  ...>     for(var student:students){
    ...>         if(student.startsWith(id)){
      ...>             return student;
      ...>         }
    ...>     }
  ...>     return null;
  ...> }

  String split(String student){
  ...>    return student.split("-")[1];
  ...>
  */

//Scala
def toInt(s: String) : Option[Int] = {
  try {
    Some(Integer.parseInt(s))
  } catch {
    case e: Exception => None
  }
}
  toInt("1")
  toInt ("Uno")
  val txtNumbers = List("1", "2", "foo", "3", "bar")
  txtNumbers.map(toInt)
  txtNumbers.map(toInt).flatten
//Manejo de nulos
//some se genera cuando el valor eciste
//None cuando el valor no existe
def toIntt (s: String) : Option [Int] = {
  try{
    Some(Integer.parseInt (s))
  }catch {
      case e: Exception=>None
  }
}
import scala.util. control.Exception._
def toIInt(s: String) : Option[Int] = allCatch.opt (s. toInt)

val x = toInt("1").getOrElse(0)
toInt("1").foreach { i => printf("Obtener un Int:%d", i)}
  toInt("1") match {
  case Some(i) => println(i)
  case None => println("That didn't work.")
}

def divideXbyY(x: Int, y: Int):Either[String, Int] =
  if(y == 0)Left("No se puede dividir por 0")
  else Right(x / y)

val x1 = divideXbyY(1, 1).right.getOrElse(0)
val x2 = divideXbyY(1, 0).right.getOrElse(0)

divideXbyY(1,0) match{
  case Left(s) => println("Answer: " + s)
  case Right(i) => println("Answer: " + i)
}

val xv=divideXbyY(1,0)
xv.isLeft
xv.left

```
