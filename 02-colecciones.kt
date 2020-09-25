// Colecciones
// Tipo --> List   Inmutable --> listOf    Mutable --> mutableListOf, arrayListOf
// Tipo --> Set	   Inmutable --> setOf	   Mutable --> mutableSetOf, hashSetOf, linkedSetOf, sortedSetOf
// Tipo --> Map	   Inmutable --> mapOf	   Mutable --> mutableMapOf, hashMapOf, linkedMapOf, sortedMapOf

// Importante
// Al pasar una colección de Kotlin a Java, ésta puede ser editada e incluso se pueden introducir nulos en la misma.

// Arrays
// IntArray, ByteArray, CharArray, BooleanArray, etc.
// Pasándole sólo el tamaño del mismo.
// val ints = IntArray(10)
// Pasando directamente el valor de cada elemento.
// val ints: IntArray = intArrayOf(1, 2, 3)
// Pasando el tamaño y una lambda para inicializar cada elemento
// val ints = IntArray(10) {i -> i*2}

// Operaciones comunes con colecciones
// Filter. Filtra los elementos de una lista incluso eliminando los elementos pero no puede editarlos.
// Map. Igual que filter pero ésta si puede editar los elementos.
// All. Comprueba si todos los elementos cumplen o no un predicado.
// Fold. Acumula empezando con el valor inicial y aplicando la operación pasada mediante una lambda para cada elemento.
// Any. Comprueba si algún elemento cumple el predicado pasado por parámetro.
// Count. Retorna el número de elementos que cumple el predicado.
// Find. Retorna el primer elemento que cumple elp redicado o null si no hay ninguno.
// Max o min. Retorna el valor máximo o mínimo de un listado (null si la lista está vacía).
// Partition. Retorna dos listas, una con los elementos que cumplen el predicado y otra con los que no.
// ElementAtOrNull. Retorna el elemento o null si el índice está fuera de rango.
// Sort, sortBy, reverse, etc. Métodos de ordenación de los elementos.
// forEach: recorre y obteien cada elemento, pudiendo porrar con ellos

fun main(args: Array<String>) {

  // Inicializamos manual
	val ints = IntArray(10)
  for (number in ints) {
      print("$number")
  }
  
  print("")
  println("-----")

  // Recorremos con foreach
  ints.forEach {
    println(it)
  }

  print("")
  println("-----")
  // Inicializamos con valores
  val ints2 = intArrayOf(1, 2, 3, 4)
  for (number in ints2) {
      print("$number")
  }
  
  print(""git ad)
  println("-----")
  // Iniciamos con lambda expresion
  for (number in ints3) {
      print("$number")
  }
  println()
  var result=0
  ints3.forEach {
    result =+ it 
  }
  println(result)
  
  println("")
  println("--- filter ---")
  // Filtramos los que tengan test
  val list = listOf("Test 1", "Test 2", "Test 3", "Test 4")
  val filterList = list.filter {
      it.contains("Test")
  }
  // Lo imprimimso
  for (text in filterList) {
      print(text)
  }
  
  println("")
  println("--- map ---")
  // Obtenemos un lista nueva modificada
  val listToApplyMap = listOf("Test 1", "Test 2", "Test 3", "Test 4")
  val mapList = listToApplyMap.map {
      text -> text + ", "
  }
  for (text in mapList) {
      print(text)
  }
  
  println("")
  println("--- fold ---")
  // sumamos a cada posicion las cosas, pero teniendo en cuenta que el acumulador inicial es 0
  val listToApplyFold = listOf(1, -2, 3, 4, 5)
  println("Fold: " + listToApplyFold.fold(2) {
      count, it -> count + it
  })
  
  println("")
  println("--- Any ---")
  // Indica si hay alguno que es menor que cero
  val listToApplyAny = listOf(1, -2, 3, -4, 5)
  println("Any: " + listToApplyAny.any {
      it < 0
  })
  
  println("")
  println("--- count ---")
  // Cuenta los elementos menores a cero
  println("Count: " + listToApplyAny.count {
      it < 0
  })
  
  println("")
  println("--- find ---")
  // Encuetra los ementos que son menores que cero
  println("Find: " + listToApplyAny.find {
      it < 0
  })
  
  println("")
  println("--- Max ---")
  // Obtiene el máximo
  println("Max: " + listToApplyAny.max())
  
  println("")
  println("--- Min ---")
  // Obtiene el mínimo
  println("Min: " + listToApplyAny.min())
  
  println("")
  println("--- ElementAtOrNull ---")
  // Devuelve el elemento que esta en la posición
  println("ElementAtOrNull: " + listToApplyAny.elementAtOrNull(3))
  
  println("")
  println("--- Partition ---")
  // Devuelve listas que cumplan la condición
  println("Partition: " + (listToApplyAny.partition {
      it > 0
  }).first) // Obtenemos la primera
  
  println("")
  println("--- Sort ---")
  // Ordena
  val intArrayToSort = intArrayOf(10, 2, 8, 4, 3)
  intArrayToSort.sort()
  for (number in intArrayToSort) {
      print("$number")
  }
}