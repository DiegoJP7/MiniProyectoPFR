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


