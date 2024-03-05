from flask import Flask, request
from ibge import busca

app = Flask(__name__)


@app.route("/busca_nome")
def busca_nome():
    try:
        var_nome = request.args.get("nome")
        response = busca(var_nome)
        print(type(response))
        # percorrer o retorno do busca e somar todas as ocorrências do nome
        return response
    except Exception as e:
        return "Falha na rota /busca_nome: {e}"


app.run(debug=True)