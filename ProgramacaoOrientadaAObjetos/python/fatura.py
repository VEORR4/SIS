class Fatura:
    def __init__(self, codigo, preco, quantidade, descricao):
        self._codigo = codigo
        self._preco = preco
        self._quantidade = quantidade
        self._descricao = descricao
    
    def getInvoiceAmount(self):
        qtde = self.quantidade
        preco = self.preco
        resultado = qtde * preco
        return resultado
    
    @property
    def codigo(self):
        return self._codigo
    
    @codigo.setter
    def codigo(self, codigo):
        self._codigo = codigo
    
    @property
    def preco(self):
        return self._descricao
    
    @descricao.setter
    def descricao(self, descricao):
        self._descricao = descricao
    
    @property
    def quantidade(self):
        return self._quantidade

    @quantidade.setter
    def quantidade(self, quantidade):
        if quantidade < 0:
            self._quantidade = 0
        else:
            self._quantidade = quantidade
  
    @property
    def preco(Self):
        return self._preco
    
    @preco.setter
    def preco(self, preco):
        if preco < 0:
            self._preco = 0
        else:
            self._preco = preco

invoice = Fatura(1, 34, 10, 'Molho de tomate')
print(invoice.descricao, '-', invoice.getInvoiceAmount())

