// Es una forma simple de definir una función anónima. Es posible usar una función como parámetro de otra.

// Sintáxis
// Siempre va encapsulado entre llaves
// La lista de parámetros no necesita ir entre paréntesis
// La flecha separa la lista de parámetros del cuerpo de la lambda

// listToApplyFold.fold(0) {
//   count, it -> count + it
// })

// Función Inline. No consumen tantos recursos ya que en tiempo de compilación 
// el compilador la sustituirá por el código y no creará clases anónimas.
// Función Crossline. Se usa cuando una función será llamada desde otra lambda.
// Funciones de orden superior y lambdas (Higher-Order functions)
// Se tratan de funciones que toman funciones como parámetros o retornan una función.

// https://www.baeldung.com/kotlin-lambda-expressions

// array.forEach { item -> println(item * 4) }
// array.forEach { println(it * 4) }


class A (var number: Int, var text: String)


// Esto requere abstracción, pero hay que hacer un esfuerzo quizás nunca lo usauíais así
// Creamos una funcion que recibe una lista y recibe una funciń de enteros que devuelve nada
// Sellama fuction lo que usom pero podra ser mi_funcion
fun iterateListWithLambda(list: List<Int>, function: (number: Int) -> Unit) {
  list.map { 
    println("Test: " + it)
    function(it) // Aplicamos la funcion al emento actual
  }
}

// funciones que recibe, pero no recibe funciones que llamaremos pair y odd
fun executeMethodsIfNumberIsPair(number: Int, pair: () -> Unit, odd: () -> Unit) {
    if (number % 2 == 0) pair() else odd()
}

fun main(args: Array<String>) {
  // Lista de objetos
  val objectList = listOf(
    A(1, "Test"),
    A(2, "Test 2"),
    A(3,"Test 3"))
  
  // Lista de enteros
  val intList = listOf(1, 2, 3, 4)
  
  println("--- Antes de la lambda ---")
  objectList.map { println(it.number) }
  println()
  objectList.forEach { println(it.number) }
  
  println("")
  println("--- Después de la lambda ---")
  // Modificamos antes los elementos
  objectList.map { it.number++ }
  objectList.map { println(it.number) }
  
  println("")
  println("--- Ejecutar método con lambda ---")
  var number = 0
  iterateListWithLambda(intList, {
      number += it // La función que me llega de parametro es simplemete es el += y su parametro i, pero podría ser sin(it)
  })
  println("Number: " + number)
  
  println("")
  println("--- Ejecutar método executeMethodsIfNumberIsPair ---")
  executeMethodsIfNumberIsPair(11, {
      println("Es par") // Nuestar funcion par es println
  }, {
      println("No es par") //nuestra funcion odd corresponde a este println
  })
}