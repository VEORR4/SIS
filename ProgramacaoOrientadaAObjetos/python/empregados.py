class Empregados:
    def __init__(self, primeironome, sobrenome, salario):
        self._primeironome = primeironome
        self._sobrenome = sobrenome
        self._salario = 
        
    def incrementasalario(self):
        self.salario += self.salario * (10/100)

    @property
    def primeironome(self):
        return self._primeironome
    
    @primeironome.setter
    def primeironome(Self, primeironome):
        self._primeiro = primeironome

    @property
    def sobrenome(self):
        return self._sobrenome
    
    @sobrenome.setter
    def sobrenome(self, sobrenome):
        self._sobrenome = sobrenome

    @property
    def salario(Self):
        return self._salario
    
    @salario.setter