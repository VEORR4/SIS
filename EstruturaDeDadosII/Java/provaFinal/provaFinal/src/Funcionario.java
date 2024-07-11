public class Funcionario {
     private int idFuncionario;
     private String nome;
     private String cargo;
     private String departamento;   
     
     public void setIdFuncionario(int idFuncionario){
          this.idFuncionario = idFuncionario;
     }
     public int getIdFuncionario(int idFuncionario){
         return this.idFuncionario;
     }

     public void setNome(String nome){
          this.nome = nome;
     }
     public String getNome(String nome){
          return this.nome;
     }

     public void setCargo(String cargo){
          this.cargo = cargo;
     }
     public String getCargo(String cargo){
          return this.cargo;
     }

     public void setDepartamento(String departamento){
          this.departamento = departamento;
     }
     public String getDepartamento(String departamento){
          return this.departamento;
     }
}
