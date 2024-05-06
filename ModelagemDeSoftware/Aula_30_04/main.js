const Produto = require("./pedido/produto");
const Pagamento = require("./pagamento/pagamento");
const Pedido = require("./pedido/pedido");
const Cliente = require("./sistema/cliente");
const Atendente = require("./sistema/atendente");

let produto = new Produto(1, "Sorvete", "Chocolate", "5,00")
produto.salvar()

let cliente = new Cliente(1, "João", "5199998888", "123456789")
cliente.salvar()

let atendente = new Atendente(1, "José", "123465677", "Atendente", "1.000")
atendente.salvar()

let pagamento = new Pagamento(1, 10, 1, "30/04/2024")
pagamento.salvar()

let pedido = new Pedido(1, pagamento, atendente, cliente, "08:00", "No capricho", produto)
let pedidoSalvo = pedido.salvar()

console.log("pedidoSalvo ->", pedidoSalvo)