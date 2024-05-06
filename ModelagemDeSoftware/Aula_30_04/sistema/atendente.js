class Atendente{
    constructor(id, nome, cpf, funcao, salario){
        this.id = id
        this.nome = nome
        this. cpf = cpf
        this.funcao = funcao
        this.salario = salario
    }

    salvar(){
        let atendente = {
            id: this.id,
            nome: this.nome,
            cpf: this.cpf,
            funcao: this.funcao,
            salario: this.salario
        }
        return atendente
    }
}
module.exports = Atendente;