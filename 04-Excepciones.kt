// Funciones que no retorna nada...
// Nos sirve para declarar nuestras propias excepciones
fun error(): Nothing {
  throw RuntimeException()
}

fun main(args: Array<String>) {
  // Puede ser nulo
	val number: String? = "hola"
  
  // A diferencia de java podemos asignar el resultado que nos de un try/catch
  // Vamos a verlo
  val count: Int = try {
      number!!.count() // Le decimos que number forzosamente no es nulo, pruebalo con nulo
  } catch (e: Exception) {
      0
  }
  
  println("Count: " + count)
  
  //error()
  
  number?.let { println(number) } ?: error()
}