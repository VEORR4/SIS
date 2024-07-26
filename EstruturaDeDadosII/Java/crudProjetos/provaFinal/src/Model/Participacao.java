package Model;
public class Participacao {
     private int idParticipacao;
     private int idFuncionario;
     private int idProjeto;
     private int horasTrabalhadas;

     public Participacao(int idParticipacao, int idFuncionario, int idProjeto, int horasTrabalhadas){
          this.idParticipacao = idParticipacao;
          this.idFuncionario = idFuncionario;
          this.idProjeto = idProjeto ;
          this.horasTrabalhadas = horasTrabalhadas;
     }

     public void setIdPaidParticipacao(int idParticipacao){
          this.idParticipacao = idParticipacao;
     }
     public int getIdPaidParticipacao(int idParticipacao){
         return this.idParticipacao;
     }


     public void setIdFuncionario(int idFuncionario){
          this.idFuncionario = idFuncionario;
     }
     public int getIdFuncionario(int idFuncionario){
          return this.idFuncionario;
     }


     public void setIdProjeto(int idProjeto){
          this.idProjeto = idProjeto;
     }
     public int getIdProjeto(int idProjeto){
          return this.idProjeto;
     }

     
     public void setHorasTrabalhadas(int horasTrabalhadas){
          this.horasTrabalhadas = horasTrabalhadas;
     }
     public int getHorasTrabalhadas(int horasTrabalhadas){
          return this.horasTrabalhadas;
     }

     public String toString(){
          return "\nProjeto adicionado:\n\n" + "ID da participação:" + idParticipacao +  "\nID do funcionário:" + idFuncionario + "\nId do projeto: " + idProjeto + "\nHoras trabalhadas:" + horasTrabalhadas;
     }
}     






