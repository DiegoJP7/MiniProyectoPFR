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



