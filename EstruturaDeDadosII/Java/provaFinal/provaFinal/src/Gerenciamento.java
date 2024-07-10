import java.util.Scanner;

public class Gerenciamento {
     //inserir DAOS

     public static void adicionarFuncionarios(){
          System.out.print("Digite o ID do usuário: ");
          id = scanner.next();
          System.out.print("Digite o nome do usuário: ");
          nome = scanner.next();
          System.out.print("Digite o cargo do usuário: ");
          cargo = scanner.next();
          System.out.print("Digite o departamento do usuário: ");
          departamento = scanner.next();

          Funcionario novoFuncionario = new Funcionario(id, nome, cargo, departamento, true);
          
     }
     public static void listarFuncionarios(){

     }
     public static void atualizarFuncionarios(){

     }
     public static void removerFuncionarios(){

     }



     
}
