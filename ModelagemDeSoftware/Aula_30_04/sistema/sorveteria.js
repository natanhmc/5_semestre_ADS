class Sorveteria{
    constructor(id, cnpj, nome, endereco, telefone){
        this.id = id
        this.cnpj = cnpj
        this.nome = nome
        this.endereco = endereco
        this.telefone = telefone
    }

    salvar(){
        let sorveteria = {
            id: this.id,
            cpnj: this.cnpj,
            nome: this.nome,
            endereco: this.endereco,
            telefone: this.telefone
        }
        return sorveteria
    }
}
module.exports = Sorveteria;