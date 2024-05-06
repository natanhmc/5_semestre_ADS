class Pessoa(val nome : String, val idade : Int) {
    fun caminhar() = "$nome está caminhando"

    fun falar() = "$nome está falando"
}

fun main(){
    val pessoa1 = Pessoa("Natan", 27)
    println(pessoa1.caminhar())
    println(pessoa1.falar())
}