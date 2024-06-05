try:
    with open('arquivo.txt', 'r') as file_object:
        texto = file_object.read()
        print(texto)
except FileNotFoundError as error:
    print('Error')

