package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class FuncionarioDAO {
    
     private ConectaDB conexao;

     public FuncionarioDAO(){
          this.conexao = new ConectaDB();
     }

     public void inserir(Funcionario funcionario){
          String sql = "INSERT INTO Funcionario(idFuncionario, nome, cargo, departamento) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setString(1, Funcionario.getIdFuncionario());
            pst.setString(2, Funcionario.getNome());
            pst.setString(2, Funcionario.getCargo());
            pst.setString(2, Funcionario.getDepartamento());
            pst.execute();

            System.out.println("Inserção ok: " + Funcionario);
        }catch (Exception e){
            System.out.println("Falha na inserção: " + e.getMessage());
        } 
    } 

    public void consultarTodos() {
        String sql = "SELECT * FROM Funcionario";
        LinkedList<Funcionario> lista = new LinkedList<Funcionario>();
        try{
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            ResultSet resultados = pst.executeQuery();

            while (resultados.next()) {
                int idFuncionario = resultados.getInt("idFuncionario");
                String nome = resultados.getString("nome");
                String cargo = resultados.getString("cargo");
                String departamento = resultados.getString("departamento");

                Funcionario obj = new Funcionario(idFuncionario, nome, cargo, departamento);
                obj.setidFuncionario(idFuncionario);
                lista.add(obj);
            }
            for (Funcionario Funcionario : lista) {
                System.out.println("ID: " + Funcionario.getIdFuncionario());
                System.out.println("Nome: " + Funcionario.getNome());
                System.out.println("Cargo: " + Funcionario.getCargo());
                System.out.println("Departamento: " + Funcionario.getDepartamento());
                System.out.println("-------------------------");
            }
        }catch (Exception e){
            System.out.println("Falha na consulta: " + e.getMessage());
        } 
    }
    public Funcionario consultarID(int idFuncionario){
        Funcionario obj = null;
        String sql = "SELECT * FROM Funcionario WHERE idFuncionario = ?";
        try {
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setInt(1, idFuncionario);
            ResultSet resultados = pst.executeQuery();
            if (resultados.next()){
                int id = resultados.getInt("id");
                String nome = resultados.getString("nome");
                String cargo = resultados.getString("cargo");
                String departamento = resultados.getString("departamento");
                
                obj = new Funcionario(id, nome);
                obj.setidFuncionario(idFuncionario);
                obj.setNome(nome);
                obj.setCargo(cargo);
                obj.setDepartamento(departamento);
            } else {
                System.out.println("Funcionario não encontrado.");
            }
        }catch (SQLException e){
            System.out.println("Falha na consulta: " + e.getMessage());
        } 
        return obj;
    }

    public void excluir(int id){
        String sql = "DELETE FROM Funcionario WHERE idFuncionario = ?";
        try{
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Funcionario excluido.");
        } catch (SQLException e) {
            System.out.println("Falha na exclulsão: " + e.getMessage());
        } 
    }

    public void alterar(Funcionario Funcionario){
        String sql = "UPDATE Funcionario SET id = ?, nome = ? WHERE idFuncionario = ?";
        try {
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setString(1, Funcionario.getid());
            pst.setString(2, Funcionario.getEmail());
            pst.setInt(3, Funcionario.getidFuncionario());

            int resultado = pst.executeUpdate();
            if (resultado > 0){
                System.out.println("Funcionario atualizado com sucesso: " + Funcionario);
            }
            else {
                System.out.println("Funcionario não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Falha na atualização: " + e.getMessage());
        } 
    }
}
     

