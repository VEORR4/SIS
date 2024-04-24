class Cliente: 
    def __init__(self, nome, email, plano):
        self.nome = nome
        self.email = email
        self.lista_planos = ["basic", "premium"]
        if plano in self.lista_planos:
            self.plano = plano
        else:
            print("Plano inválido")
            # raise Exception("Plano inválido")
        
        def mudar_plano(self, novo_plano):
            if novo_plano in self.lista_planos:
                self.plano = novo_plano
            else:
                print("Plano inválido")
            
        def ver_filme(self, filme, plano_filme):
            if self.plano == plano_filme:
                print("Ver filme", filme)
            elif self.plano == "premium":
                print(f"Ver filme {filme}")
            elif self.plano == "basic" and plano_filme == "premium":
                print("Faça um upgrade para premium para ver esse filme")
       

cliente = Cliente("João Vitor", "joaovitorgalvao26@gmail.com", "basic")
print(cliente.nome)
print(cliente.plano)
clinte.ver_filme("Harry Potter", "premium") 
