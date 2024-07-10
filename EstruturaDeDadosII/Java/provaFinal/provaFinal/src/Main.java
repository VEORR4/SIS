import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    Gerenciamento gerenciamento = new Gerenciamento();

    public static void main(String[] args) {
        int opcao;

        do{
            System.out.println("\n\n==========Gestão de projetos==========");
            System.out.println("1: Funcionários");
            System.out.println("2: projetos");
            System.out.println("3: Participações");
            System.out.println("0: sair");
            System.out.print("Opção: \n\n");

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
            System.out.println("\n2: Listar funcionários");
            System.out.println("\n3: Atualizar funcionário");
            System.out.println("\n4: Remover funcionário");
            System.out.println("\n0: Voltar");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 4){
                System.out.println("Opção inválida.");
                opcao = scanner.nextInt();
            }
            switch (opcao) {
                case 1:
                    Gerenciamento.adicionarFuncionarios();
                    break;
                case 2:
                    Gerenciamento.listarFuncionarios();
                    break;
                case 3:
                    Gerenciamento.atualizarFuncionarios();
                    break;
                case 4:
                    Gerenciamento.removerFuncionarios();
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
