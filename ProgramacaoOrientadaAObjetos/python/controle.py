class ControleRemoto:
    def __init__(self, cor, altura, profundidade, largura):
        self.cor = cor
        self.altura = altura
        self.profundidade = profundidade
        self.largura = largura
    
    def trocar_canal(self, botao):
        if botao == ">":
            print("avança canal")
        elif botao == "<":
            print("volta canal")

controle_remoto = ControleRemoto("branca", "10cm", "2cm", "4cm")
print(controle_remoto.cor)
controle_remoto.trocar_canal(">")

controle_remoto2 = ControleRemoto("preta", "12cm", "2cm", "3cm")
print(controle_remoto2.cor)
controle_remoto2.trocar_canal("<")