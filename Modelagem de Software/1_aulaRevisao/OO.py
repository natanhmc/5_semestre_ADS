class Aluno:
    def __init__(self, nome, matricula, idade, curso):
        self.nome = nome
        self.matricula = matricula
        self.idade = idade
        self.curso = curso
        
    def mostrarInformacoes (self):
        return f"Informcoes do aluno:\nNome = {self.nome}\nMatricula = {self.matricula}\nIdade = {self.idade}\nCurso = {self.curso}\n\n"
    
    
aluno1 = Aluno("Natan", 1234, 27, "ADS")

print(aluno1.mostrarInformacoes())


class Praia:
    def __init__(self, nome, localizacao, temperaturaAgua, tipoAreia):
        self.nome = nome
        self.localizacao = localizacao
        self.temperaturaAgua = temperaturaAgua
        self.tipoAreia = tipoAreia
    
    def informacoesPraia(self):
        return f"Informacoes da praia:\nNome = {self.nome}\nLocalizacao = {self.localizacao}\nTemperatura = {self.temperaturaAgua}\nTipo de areia = {self.tipoAreia}\n\n"

praia1 = Praia("Praia Grande", "Torres", "29º celcius", "Fina")

print(praia1.informacoesPraia())

class Voo:
    def __init__(self, companhiaAerea, origem, destino, dataPartida, precoViagem):
        self.companiaAerea = companhiaAerea
        self.origem = origem
        self.destino = destino
        self.dataPartida = dataPartida
        self.precoViagem = precoViagem
        
    def informacoesVoo(self):
        return f"Informacoes do voo:\nCompania Aerea = {self.companiaAerea}\nOrigem = {self.origem}\nDestino = {self.destino}\nData de Partida = {self.dataPartida}\nPreco do voo = {self.precoViagem}"
    
voo1 = Voo("Latan", "Porto alegre" , "New York", "20/03/24", 1000.00)

print(voo1.informacoesVoo())
