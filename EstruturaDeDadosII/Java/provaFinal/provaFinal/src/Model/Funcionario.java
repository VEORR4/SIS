package Model;
public class Funcionario {
     private int idFuncionario;
     private String nomeFuncionario;
     private String cargo;
     private String departamento;  

     public Funcionario(int idFuncionario, String nomeFuncionario, String cargo, String departamento){
          this.idFuncionario = idFuncionario;
          this.nomeFuncionario = nomeFuncionario;
          this.cargo = cargo;
          this.departamento = departamento;
     }
     
     public void setIdFuncionario(int idFuncionario){
          this.idFuncionario = idFuncionario;
     }
     public int getIdFuncionario(int idFuncionario){
         return this.idFuncionario;
     }

     public void setNomeFuncionario(String nomeFuncionario){
          this.nomeFuncionario = nomeFuncionario;
     }
     public String getNomeFuncionario(String nomeFuncionario){
          return this.nomeFuncionario;
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

     public String toString() {
        return " ID: " + getIdFuncionario(idFuncionario) + " Nome: " + getNomeFuncionario(cargo) + "Cargo: " + getCargo(cargo) + "Departamento: " + getDepartamento(departamento);
    }

     public String getNome() {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'getNome'");
     }

     public String nomeFuncionario() {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'nomeFuncionario'");
     }

     public void alterar(Funcionario funcionario) {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'alterar'");
     }

}
