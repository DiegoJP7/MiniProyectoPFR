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
