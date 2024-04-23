from flask import Flask, request, jsonify
from ibge import busca, get_nome, bubble_sort, merge_sort, quick_sort
from time import time

app = Flask(__name__)

@app.route("/busca_cidades")
def busca_cidades():
    try:  
        sort = request.args.get("sort")    
        response = busca()
        lista = get_nome(response)

        if sort == 'bubble':
            inicio = time()
            bubble = bubble_sort(lista)
            fim = time()
            tempo = fim - inicio
            return jsonify({"lista_ordenada": bubble['lista'], "numero_comparacoes": bubble['contador'], "tempo_de_execucao": tempo})
        
        elif sort == 'merge':
            inicio = time()
            merge = merge_sort(0, len(lista), lista)
            fim = time()
            tempo = fim - inicio
            return jsonify({"lista_ordenada": merge['lista'], "numero_comparacoes": merge['contador'], "tempo_de_execucao": tempo})
        
        elif sort == 'quick':
            inicio = time()
            quick = quick_sort(lista)
            fim = time()
            tempo = fim - inicio
            return jsonify({"lista_ordenada": quick['lista'], "numero_comparacoes": quick['contador'], "tempo_de_execucao": tempo})
        
        else:
            return jsonify({'message': 'Metodo de ordenacao nao encontrado!'})
    except Exception as e:
        return f"Falha na rota /busca_cidades: {e}"


app.run(debug=True)