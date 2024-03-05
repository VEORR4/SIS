import requests

def busca(nome): 
    url = f"https://servicodados.ibge.gov.br/api/v2/censos/nomes/"
    url_busca = url+nome
    resposta = requests.get(url_busca)
    return resposta.json()


retorno = busca("Jose")
print(retorno)