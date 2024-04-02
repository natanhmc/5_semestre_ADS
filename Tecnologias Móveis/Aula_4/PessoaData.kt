data class PessoaData(val nome : String, val idade : Int, val cpf : String, val profissao : String){

}
fun main(){
    val pessoa1 = PessoaData("Natan", 27, "012-345-678-90", "Programador")
    val novaPessoa = pessoa1.copy("Natan Hugentobler Mota Cardoso")
    println(novaPessoa.nome)
}
