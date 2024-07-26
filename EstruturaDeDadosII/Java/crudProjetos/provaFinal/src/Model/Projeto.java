package Model;
import java.util.Date;

public class Projeto {
     private int idProjeto;
     private String nomeProjeto;
     private String descricaoProjeto;
     private String dataInicio;
     private String dataFim;

     public Projeto(int idProjeto, String nomeProjeto, String descricaoProjeto, String dataInicio, String dataFim){
          this.idProjeto = idProjeto;
          this.nomeProjeto = nomeProjeto;
          this.descricaoProjeto = descricaoProjeto ;
          this.dataInicio = dataInicio;
          this.dataFim = dataFim;
     }

     public void setId(int idProjeto){
     this.idProjeto = idProjeto;
     }
     public int getId(int idProjeto){
         return this.idProjeto;
     }

     public void setNomeProjeto(String nomeProjeto){
          this.nomeProjeto = nomeProjeto;
     }
     public String getNomeProjeto(String nomeProjeto){
          return this.nomeProjeto;
     }


     public void setDescricaoProjeto(String descricaoProjeto){
          this.descricaoProjeto = descricaoProjeto;
     }
     public String getDescricaoProjeto(String descricaoProjeto){
          return this.descricaoProjeto;
     }

     
     public void setdataInicio(String dataInicio){
          this.dataInicio = dataInicio;
     }
     public String getdataInicio(String dataInicio){
          return this.dataInicio;
     }
   

     public void setDataFim(String dataFim){
          this.dataFim = dataFim;
     }
     public String getDataFim(String dataFim){
          return this.dataFim;
     }

     public String toString(){          
          return "Funcionário adicionado:\n\n ID:" + idProjeto + "\nNome:" + nomeProjeto + " \nDescrição:" + descricaoProjeto + "\nInício:" + dataInicio + "\nFim:" + dataFim;
     }        
}
    


     
