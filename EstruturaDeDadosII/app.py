from flask import Flask, request
import requests

#instanciar a aplicacao (um objeto)


app = Flask(__name__)

@app.route("/")  ### / ---> root

def index():
          return "aplicacao online"

@app.route("/calcula", methods=["GET"])

def calcula():
        # http://127.0.0.1:5000/calcula?qtd=50&preco=2
        print(str(request))
        print(request.args)
        print(request.args.get("qtd"))
        print(request.args.get("preco"))
        
        quantidade = request.args.get("qtd")
        preco = request.args.get("preco")
        if quantidade is not None and preco is not None:
                return f"R$ {int(quantidade)*int(preco)}"
        return "Um dos parametros nao foi passado"

@app.route("/paridade", methods=["GET"])
def paridade():
        numero = request.args.get("valor")
        if int(numero)% 2 == 0:
                return f"{numero} é par"
        else:
                return f"{numero} é ímpar"
        
#crie uma rota somar_ate que terá um parametro valor recebido na requisição.
#a rota deverá somar todos os números até o valor.
#exemplo: se o valor == 10, o retorno deve ser a soma de 1+2+3. . . +10
        

@app.route("/somar_ate", methods = ["GET"])
def somar_ate():
        valor = int(request.args.get("valor"))
        soma = 0
        for x in range(1, valor + 1):
                soma += x
        return f"A soma de todos os números até {valor} é {soma}"
                
app.run(debug=True)
                
        

                











# rodar a app
# debug == True para nao ser necessario recarregar a app no navegador, por ex.
# So utilizar em ambiente de desenvolvimento.
app.run(debug = True)