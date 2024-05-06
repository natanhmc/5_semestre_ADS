class Estoque{
    constructor(quantidade, descricao){
        this.quantidade = quantidade
        this.descricao = descricao
    }

    salvar(){
        let estoque = {
            quantidade: this.quantidade,
            descricao: this.descricao
        }
        return estoque
    }
}
module.exports = Estoque;