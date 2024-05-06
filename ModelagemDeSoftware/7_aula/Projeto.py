import sqlite3

class Projeto:
    def __init__(self, nome, descricao, prazo_de_entrega):
        self.nome = nome
        self.descricao = descricao
        self.prazo_de_entrega = prazo_de_entrega

    def salvar(self):
        # Conecta ao banco de dados SQLite (ou cria se não existir)
        conexao = sqlite3.connect('projetos.db')
        cursor = conexao.cursor()
        
        # Cria a tabela de projetos se ela não existir
        cursor.execute('''
            CREATE TABLE IF NOT EXISTS projetos (
                nome TEXT,
                descricao TEXT,
                prazo_de_entrega TEXT
            )
        ''')
        
        # Insere os dados do projeto na tabela
        cursor.execute('''
            INSERT INTO projetos (nome, descricao, prazo_de_entrega)
            VALUES (?, ?, ?)
        ''', (self.nome, self.descricao, self.prazo_de_entrega))
        
        # Salva (commit) as alterações
        conexao.commit()
        
        # Fecha a conexão com o banco de dados
        conexao.close()
        print(f"Projeto '{self.nome}' salvo no banco de dados com sucesso.")
        
        


    def consultar_banco(self):
        # Simula a consulta ao banco de dados (SQLite)
        conexao = sqlite3.connect('projetos.db')
        cursor = conexao.cursor()
        cursor.execute('SELECT descricao, prazo_de_entrega FROM projetos WHERE nome = ?', (self.nome,))
        resultado = cursor.fetchone()
        conexao.close()

        if resultado:
            descricao, prazo_de_entrega = resultado
            print(f"Descrição do Projeto: {descricao}")
            print(f"Prazo de Entrega: {prazo_de_entrega}")
        else:
            print(f"Projeto '{self.nome}' não encontrado no banco de dados.")
            
projeto1 = Projeto(nome="Projeto A", descricao="Desenvolvimento de um aplicativo móvel", prazo_de_entrega="2023-12-31")
projeto1.consultar_banco()