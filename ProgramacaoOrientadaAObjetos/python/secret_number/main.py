secret_number = 20

while True:
    number = input('Adivinhe o número: ')

    try:
        number = int(number)
    except:
        print('Desculpe, isso não é um número, bobão')
        continue

    if number != secret_number:
        if number > secret_number:
            print(number, 'é maior que o número secreto, bobão')
        elif number < secret_number:
            print(number, 'é ,menor que o número secreto, bobão')
    else:
        print('Você adivinhou o número:', secret_number,'bobão')
        break
