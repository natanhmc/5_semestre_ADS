class FormaPagamento{
    constructor(id, nome, idPagamento){
        this.id = id
        this.nome = nome
        this.idPagamento = idPagamento
    }

    salvar(){
        let formaPagamento = {
            id: this.id,
            nome: this.nome,
            idPagamento: this.idPagamento
        }
    }
}

module.exports = FormaPagamento;