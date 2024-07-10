public class Funcionario {
     private int id;
     private String nome;
     private String cargo;
     private String departamento;   
     
     public void setId(int id){
          this.id = id;
     }
     public int getId(int id){
         return this.id;
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
