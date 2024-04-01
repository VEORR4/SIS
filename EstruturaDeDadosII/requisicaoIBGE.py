import requests

link = "https://servicodados.ibge.gov.br/api/v1/localidades/distritos"

requisicao = requests.get(link)

print(requisicao.json())