package Service;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.Scanner;
import Model.Funcionario;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    static LinkedList<Funcionario> listaFuncionarios = new LinkedList<Funcionario>();

    Gerenciamento gerenciamento = new Gerenciamento();

    public static void main(String[] args) throws ParseException {
        int opcao;

        do{
            System.out.println("\n==========Gestão de projetos==========\n");

            System.out.println("        |   1: Funcionários   |");
            System.out.println("        |   2: projetos       |");
            System.out.println("        |   3: Participações  |");
            System.out.println("        |   0: sair           |");
            System.out.print("\n            Opção:");
            

            opcao = scanner.nextInt();
            
            switch (opcao){
                case 1: 
                    gerenciarFuncionarios();
                    break;
                case 2: 
                    gerenciarProjetos();
                    break;
                case 3: 
                    gerenciarParticipacoes();
                    break;
                case 0: 
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");    
                }
        } 
        while (opcao != 0);
        scanner.close();
    }
    
    private static void gerenciarFuncionarios(){
        int opcao;

        do {
            System.out.println("\n1: Adicionar funcionário");
            System.out.println("2: Listar funcionários");
            System.out.println("3: Atualizar funcionário");
            System.out.println("4: Remover funcionário");
            System.out.println("0: Voltar\n");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 4){
                System.out.println("Opção inválida.");
                opcao = scanner.nextInt();
            }
            switch (opcao) {
                case 1:
                    listaFuncionarios.add(Gerenciamento.adicionarFuncionarios());
                    break;
                case 2:
                    // Gerenciamento.listarFuncionarios();
                    System.out.println("Lista de funcionários: ");
                    for (Funcionario funcionario : listaFuncionarios) {
                        System.out.println("ID:" + funcionario.getIdFuncionario() + "Nome:" + funcionario.getNomeFuncionario() + "\n");
                        
                    }
                    break;
                case 3:
                    // Gerenciamento.atualizarFuncionarios();
                    break;
                case 4:
                    // Gerenciamento.removerFuncionarios();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default: 
                    System.out.println("Opção inválida.");
            }
        }while (opcao != 0);
    }

     private static void gerenciarProjetos() throws ParseException{
        int opcao;

        do {
            System.out.println("\n1: Criar novo projeto");
            System.out.println("\n2: Listar projetos");
            System.out.println("\n3: Atualizar projeto");
            System.out.println("\n4: Excluir projeto");
            System.out.println("\n0: Voltar\n");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 4){
                System.out.println("Opção inválida.");
                opcao = scanner.nextInt();
            }
            switch (opcao) {
                case 1:
                    Gerenciamento.criarProjeto();
                    break;
                case 2:
                    // Gerenciamento.listarProjetos();
                    break;
                case 3:
                    // Gerenciamento.atualizarProjeto();
                    break;
                case 4:
                    // Gerenciamento.excluirProjeto();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default: 
                    System.out.println("Opção inválida.");
            }
        }while (opcao != 0);
    }

    private static void gerenciarParticipacoes(){
        int opcao;

        do {
            System.out.println("\n1: Criar nova participação");
            System.out.println("\n2: Listar participações");
            System.out.println("\n3: Atualizar participação");
            System.out.println("\n4: Excluir participação");
            System.out.println("\n0: Voltar");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 4){
                System.out.println("Opção inválida.");
                opcao = scanner.nextInt();
            }
            switch (opcao) {
                case 1:
                    Gerenciamento.criarParticipacao();
                    break;
                case 2:
                    // Gerenciamento.listarParticipacoes();
                    break;
                case 3:
                    // Gerenciamento.atualizarPartipacao();
                    break;
                case 4:
                    // Gerenciamento.excluirParticipacao();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default: 
                    System.out.println("Opção inválida.");
            }
        }while (opcao != 0);
    }


}
