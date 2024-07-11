package Model;
import java.util.Date;

public class Projeto {
     private int idProjeto;
     private String nomeProjeto;
     private String descricaoProjeto;
     private Date dataInicio;
     private Date dataFim;

     public Projeto(int idProjeto, String nomeProjeto, String descricaoProjeto, Date dataInicio, Date dataFim){
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

     
     public void setdataInicio(Date dataInicio){
          this.dataInicio = dataInicio;
     }
     public Date getdataInicio(Date dataInicio){
          return this.dataInicio;
     }
   

     public void setDataFim(Date dataFim){
          this.dataFim = dataFim;
     }
     public Date getDataFim(Date dataFim){
          return this.dataFim;
     }
}    

    


     
