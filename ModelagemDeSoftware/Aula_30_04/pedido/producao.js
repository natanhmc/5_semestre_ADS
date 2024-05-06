class Producao{
    constructor(status){
        this.status = status
    }

    salvar(){
        let status = {
            status: this.status
        }
    }
}
module.exports = Producao;