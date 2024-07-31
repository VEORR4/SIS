package Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

// import DAO.FuncionarioDAO;

// import DAO.ProjetoDAO;
import Model.Funcionario;
import Model.Participacao;
import Model.Projeto;
// import DAO.ParticipacaoDAO;



public class Gerenciamento {
     // static FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
     // static ProjetoDAO ProjetoDAO = new ProjetoDAO();
     // static ParticipacaoDAO ParticipacaoDAO = new ParticipacaoDAO();

     static Scanner scanner = new Scanner(System.in);

     static String nomeFuncionario, cargo, departamento, nomeProjeto, descricaoProjeto, nomeParticipacao, descricaoParticipacao, dataInicio, dataFim;
     static int idFuncionario, idProjeto, idParticipacao, horasTrabalhadas;

     static LinkedList<Funcionario> listaFuncionarios = new LinkedList<Funcionario>();
     static LinkedList<Projeto> listaProjetos = new LinkedList<Projeto>();
     
     
     //FUNCIONÁRIOS
     public static Funcionario adicionarFuncionarios(){
          try {
               System.out.print("Digite o ID do funcionário: ");
               idFuncionario = Integer.parseInt(scanner.nextLine());
          } catch (Exception e) {
               System.err.println("Dados inválidos...");
               return null;
          }

          System.out.print("Digite o nome do funcionário: ");
          nomeFuncionario = scanner.nextLine();
          System.out.print("Digite o cargo do funcionário: ");
          cargo = scanner.nextLine();
          System.out.print("Digite o departamento do funcionário: ");
          departamento = scanner.nextLine();
          System.out.print("\n");

          Funcionario novoFuncionario = new Funcionario(idFuncionario, nomeFuncionario, cargo, departamento);
          // FuncionarioDAO.inserir(novoFuncionario);
          System.out.println(novoFuncionario);  
          return novoFuncionario;   
     }
     
     public static void listarFuncionarios(){
          System.out.println("\nFuncionários:\n");
          for (Funcionario funcionario : listaFuncionarios){
               System.out.println("ID:" + funcionario.getIdFuncionario() + " Nome:" + funcionario.getNomeFuncionario());
          }
     }

//      public static void atualizarFuncionarios(){
//           System.out.print("Digite o ID do usuário a ser atualizado: ");
//           idFuncionario= scanner.nextInt();

//           Funcionario funcionario = FuncionarioDAO.consultarFuncionarios();

//           if (funcionario != null) {
//             System.out.print("Digite o novo ID do funcionário: ");
//             idFuncionario = scanner.nextInt();
//             System.out.print("Digite o nome atualizado do funcionário: ");
//             nomeFuncionario = scanner.next();
//             System.out.print("Digite o novo cargo do funcionário: ");
//             cargo = scanner.next();
//             System.out.print("Digite o novo departamento do funcionário: ");
//             departamento = scanner.next();

//             funcionario.setIdFuncionario(idFuncionario);
//             funcionario.setNomeFuncionario(nomeFuncionario);
//             funcionario.setCargo(cargo);
//             funcionario.setDepartamento(departamento);

//             funcionario.alterar(funcionario);
//             System.out.println("Funcionário:" + nomeFuncionario + "atualizado.");
//         }   else {
//             System.out.println("Funcionário não encontrado.");
//         }
//     }
//      }
//      public static void removerFuncionarios(){

//      }

     //PROJETOS
     public static void criarProjeto(){
          System.out.print("Digite o ID do projeto: ");
          idProjeto = scanner.nextInt();
          scanner.nextLine();

          System.out.print("Digite o nome do projeto: ");
          nomeProjeto = scanner.nextLine();

          System.out.print("Digite a descrição do projeto: ");
          descricaoProjeto = scanner.nextLine();

          System.out.print("Digite data de início do projeto(dd/mm/yyyy): ");
          dataInicio = scanner.nextLine();
     
          System.out.print("Digite data final do projeto(dd/mm/yyyy): ");
          dataFim = scanner.nextLine();
          System.out.print("\n");
          

          Projeto novoProjeto = new Projeto(idProjeto, nomeProjeto, descricaoProjeto, dataInicio, dataFim);
          listaProjetos.add(novoProjeto);
          // ProjetoDAO.inserir(novoProjeto);

          System.out.println(novoProjeto);
     }

     public static void listarProjetos(){
          for (Projeto projeto : listaProjetos) {
               System.out.println("ID:" + projeto.getId(idProjeto));
          }
     }
     
//      public static void atualizarProjeto(){
//      }

//      public static void excluirProjeto(){
//      }

     //PARTICIPAÇÕES
     public static void criarParticipacao(){
          System.out.print("Digite o ID da participação: ");
          idParticipacao = scanner.nextInt();
          System.out.print("Digite ID do funcionário: ");
          idFuncionario = scanner.nextInt();
          System.out.print("ID do projeto: ");
          idProjeto= scanner.nextInt();
          System.out.print("Digite as horas trabalhadas na participação: ");
          horasTrabalhadas = scanner.nextInt();

          Participacao novaParticipacao = new Participacao(idParticipacao, idFuncionario, idProjeto, horasTrabalhadas);
          // ParticipacaoDAO.inserir(novaParticipacao);
          System.out.println(novaParticipacao);
     }
     
//      public static void atualizarPartipacao(){

//      }
//      public static void listarParticipacoes(){

//      }
//      public static void excluirParticipacao(){

//      }
     




     
}

