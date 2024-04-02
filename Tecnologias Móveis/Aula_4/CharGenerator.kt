import kotlin.random.Random

class CharGenerator(val menor : Char, val maior : Char) {
    fun gerarChar() = Random.nextInt(menor.toInt(), maior.toInt() + 1 ).toChar()
}

fun main() {
    val novoCaracter = CharGenerator('A', 'Z')
    val caractereAleatorio = novoCaracter.gerarChar()
    println("Caractere aleatório gerado: $caractereAleatorio")
}