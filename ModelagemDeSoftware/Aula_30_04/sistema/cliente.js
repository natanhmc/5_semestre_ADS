class Cliente{
    constructor(id, nome, telefone, cpf){
        this.id = id
        this.nome = nome
        this.telefone = telefone
        this.cpf = cpf
    }

    salvar(){
        let cliente = {
            id: this.id,
            nome: this.nome,
            telefone: this.telefone,
            cpf: this.cpf
        }
        return cliente
    }
}
module.exports = Cliente;