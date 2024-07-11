import java.util.Scanner;

import DAO.FuncionarioDAO;
import DAO.ProjetoDAO;
import DAO.ParticipacaoDAO;

public class Gerenciamento {
     static FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
     static ProjetoDAO ProjetoDAO = new ProjetoDAO();
     static ParticipacaoDAO ParticipacaoDAO = new ParticipacaoDAO();

     static Scanner scanner = new Scanner(System.in);

     static String nome, cargo, departamento;
     static int idFuncionario;
     
     //FUNCIONÁRIOS
     public static void adicionarFuncionarios(){
          System.out.print("Digite o ID do usuário: ");
          idFuncionario = scanner.nextInt();
          System.out.print("Digite o nome do usuário: ");
          nome = scanner.next();
          System.out.print("Digite o cargo do usuário: ");
          cargo = scanner.next();
          System.out.print("Digite o departamento do usuário: ");
          departamento = scanner.next();

          Funcionario novoFuncionario = new Funcionario(idFuncionario, nome, cargo, departamento, true);
          FuncionarioDAO.inserir(novoFuncionario);
          System.out.println("Funcionário adicionado:" + "ID:" + idFuncionario + "Nome:" + nome);
          
     }
     public static void listarFuncionarios(){

     }
     public static void atualizarFuncionarios(){

     }
     public static void removerFuncionarios(){

     }

     //PROJETOS
     public static void criarProjeto(){

     }
     public static void atualizarProjeto(){

     }
     public static void listarProjetos(){

     }
     public static void excluirProjeto(){

     }

     //PARTICIPAÇÕES
     public static void criarParticipação(){

     }
     public static void atualizarPartipacao(){

     }
     public static void lsitarParticipacoes(){

     }
     public static void excluirParticipacao(){

     }




     
}
