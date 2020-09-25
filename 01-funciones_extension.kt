// Funciones que agrega nuevos comportamientos a una clase
// No tenemos que extender una clase para añadirle funcionalidad
// Se puede hacer sin necesidad de tener el código fuente
// Ofrece comportamientos nuevos a una clase existente
// Actúa como si perteneciese a la clase, por lo que podemos usar sus métodos públicos

// Estructura
// Dos elementos:
// Receiver Type. Clase a la que se añade la función
// Receiver Object. Valor al que llama la función

// Defino la clase
class A (var var1: Int, var var2: Int, private var var3: Int) {
  // Método público
  fun sum() : Int {
      return var1 + var2
  }
}

// Esta es una unción de extensión para crear un nuevo comportamiento
fun A.multiply(): Int {
  return this.var1 * this.var2 * sum() /
  // return this.var1 * this.var2 * this.var3 // Da error porque es privada var3
}

// Esta es una función de extensión sobre el tipo, que es clase
fun Int.isPar(): Boolean {
    return this % 2 == 0
}

// Otra función de extensión
fun Int.isPositive(): Boolean {
    return this >= 0
}

// Otra mas
fun Int.multiply(number: Int): Int {
    return this * number
}
 
 // Para poner en mayíscula
fun String.upperCaseFirstLetter(): String {
    return if(this.count() > 0) this.substring(0, 1).toUpperCase().plus(this.substring(1)) else ""
}


fun main(args: Array<String>) {
  
  println("--- Función de extensión de A ---")
  var objectA = A(1, 6, 10)
  println("Sum: " + objectA.sum())
  println("Multiply: " + objectA.multiply())

  println("")
  println("--- Extensión de Int ---")
	var number1: Int = 10
  var number2: Int = -10
  var number3 = 3
  println("Es positivo: " + number1.isPositive())
  println("Es positivo: " + number2.isPositive())

  println("$number1 ¿es par?: " + number1.isPar())
  println("$number3 ¿es par?: " + number3.isPar())

  println("Multiply: " + number1.multiply(10))
  
  println("")
  println("--- Extensión de String ---")
  var text = "hola"
  println(text.upperCaseFirstLetter())
  println("curso".upperCaseFirstLetter())

}