class Produto{
    constructor(id, nome, sabor, preco){
        this.id = id
        this.nome = nome
        this.sabor = sabor
        this.preco = preco
    }

    salvar(){
        let produto = {
            id: this.id,
            nome: this.nome,
            sabor: this.sabor,
            preco: this.preco
        }
        return produto
    }
}
module.exports = Produto;