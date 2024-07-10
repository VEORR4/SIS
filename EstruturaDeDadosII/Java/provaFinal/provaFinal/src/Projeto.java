import java.util.Date;

public class Projeto {
     private int id;
     private String nome;
     private String descricao;
     private Date data_inicio;
     private Date data_fim;

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


     public void setDescricao(String descricao){
          this.descricao = descricao;
     }
     public String getDescricao(String descricao){
          return this.descricao;
     }

     
     public void setData_inicio(Date data_inicio){
          this.data_inicio = data_inicio;
     }
     public Date getData_inicio(Date data_inicio){
          return this.data_inicio;
     }
   

     public void setData_fim(Date data_fim){
          this.data_fim = data_fim;
     }
     public Date getData_fim(Date data_fim){
          return this.data_fim;
     }
}    

    


     
