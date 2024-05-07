from Tarefa import Task
import heapq

lista_tarefas = []

def menu():
    print('-'*30)
    print('1- Adicionar Tarefa')
    print('2- Realizar Tarefa (remover)')
    print('3- Consultar Tarefas')
    print('4- Sair')

def adicionar():
    titulo = input("digite o título: ")
    descricao = input("digite a descrição: ")
    obj = Task(titulo)
    obj.set_descricao(descricao)
    prioridade = obj.get_prioridade()
    heapq.heappush(lista_tarefas, (prioridade, obj))

def consultar():
    for item in lista_tarefas:
        print('-'*30)
        print(item[1].info())
        print('-'*30)

def realizar():
    if len(lista_tarefas) > 0:
        tarefa = heapq.heappop(lista_tarefas)
        print(tarefa[1].info())
    else: print('não tem tarefa')

if __name__ == '__main__':
    opcao = 1
    while opcao != 4:
        menu()
        opcao = int(input('Digite a opção: '))
        if opcao == 1:
            adicionar()
        elif opcao == 2:
            realizar()
        elif opcao == 3:
            consultar()
        elif opcao == 4:
            print('saindo')
        else:
            print("opção incorreta")