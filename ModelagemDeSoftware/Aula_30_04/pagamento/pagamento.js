class Pagamento{
    constructor(id, valor, idFormaPagamento, dataPagamento){
        this.id = id
        this.valor =  valor
        this.idFormaPagamento = idFormaPagamento
        this.dataPagamento = dataPagamento

    }

    salvar(){
        let pagamento = {
            id: this.id,
            valor: this.valor,
            idFormaPagamento: this.idFormaPagamento,
            dataPagamento: this.dataPagamento
        }
        return pagamento
    }
}
module.exports = Pagamento;