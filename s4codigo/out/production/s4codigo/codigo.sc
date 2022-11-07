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




