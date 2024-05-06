class Pedido{
    constructor(numero, Pagamento, Atendente, Cliente, horaEntrega, caracteristicaPedido, Produto){
        this.numero = numero
        this.Pagamento = Pagamento
        this.Atendente = Atendente
        this.Cliente = Cliente
        this.horaEntrega = horaEntrega
        this.caracteristicaPedido = caracteristicaPedido
        this.Produto = Produto
    }

    salvar(){
        let pedido = {
            numero: this.numero,
            Pagamento: this.Pagamento,
            Atendente: this.Atendente,
            idCliente: this.Cliente,
            horaEntrega: this.horaEntrega,
            caracteristicaPedido: this.caracteristicaPedido,
            Produto: this.Produto
        }
        return pedido
    }

    atualizar(){
        let pedido = {
            numero: this.numero,
            Pagamento: this.Pagamento,
            Atendente: this.Atendente,
            idCliente: this.Cliente,
            horaEntrega: this.horaEntrega,
            caracteristicaPedido: this.caracteristicaPedido,
            Produto: this.Produto
        }
        return pedido
    }
    
    remover(){
        let pedido = {
            numero: this.numero,
            Pagamento: this.Pagamento,
            Atendente: this.Atendente,
            idCliente: this.Cliente,
            horaEntrega: this.horaEntrega,
            caracteristicaPedido: this.caracteristicaPedido,
            Produto: this.Produto
        }
        return pedido
    }
}
module.exports = Pedido;