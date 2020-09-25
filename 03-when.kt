// Similar al swicth pero mas potente
open class A(var var1: String)
class B(var1: String, var var2: String) : A(var1)
class C(var1: String, var var3: String) : A(var1)
class D(var1: String, var var4: String) : A(var1)

// Clase enumerada
enum class Country(var code: String, var fullName: String) {
    SPAIN("ES", "España"),
    GERMANY("DE", "Alemania"),
    JAPAN("JP", "Japón")
}

fun main(args: Array<String>) {
  println(getText(B("Test 2", "Test var2")))
  println(getText(C("Test 3", "Test var3")))
  println(getText(D("Test 4", "Test var4")))
  
  val spain = Country.SPAIN
  val japan = Country.JAPAN
  println(spain.fullName + " está en Europa? " + isEuropean(spain))
  println(japan.fullName + " está en Europa? " + isEuropean(japan))
}

// Haría la función de switch
fun getText(value: A) = when(value) {
    is B -> value.var2
    is C -> value.var3
    else -> "Error"
}

// Aplicamos el wehen en esta funcion, haría la funcion de if/else  
fun isEuropean(country: Country) = when(country) {
    Country.SPAIN, Country.GERMANY -> "Sí"
    else -> "No"
}