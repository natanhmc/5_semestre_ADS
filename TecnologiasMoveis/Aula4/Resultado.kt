import java.util.StringJoiner

sealed class Resultado {
    class Sucesso(val data : String) : Resultado()
    class Erro(val mensagem : String) : Resultado()
    class Loading(val lodin : String) : Resultado()

}
fun main(){
    val result : Resultado = Resultado.Sucesso("Sucesso!!!")

    when (result){
        is Resultado.Sucesso -> print(result.data)
        is Resultado.Erro -> print(result.mensagem)
        is Resultado.Loading -> print(result.lodin)
    }
}