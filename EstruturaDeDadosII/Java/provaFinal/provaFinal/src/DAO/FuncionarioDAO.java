package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import Model.Funcionario;


public class FuncionarioDAO {
    
     private ConexaoDB conexao;

     public FuncionarioDAO(){
          this.conexao = new ConexaoDB();
     }

     public void inserir (Funcionario funcionario){
          String sql = "INSERT INTO Funcionario(idFuncionario, nome, cargo, departamento) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setInt(1, funcionario.getIdFuncionario(0));
            pst.setString(2, funcionario.getNome());
            pst.setString(2, funcionario.getCargo(sql));
            pst.setString(2, funcionario.getDepartamento(sql));
            pst.execute();

            System.out.println("Inserção ok: " + funcionario);
        }catch (Exception e){
            System.out.println("Falha na inserção: " + e.getMessage());
        } 
    } 

    public Funcionario consultarFuncionarios() {
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
                obj.getIdFuncionario(idFuncionario);
                lista.add(obj);
            }
            for (Funcionario funcionario : lista) {
                System.out.println("ID: " + funcionario.getIdFuncionario(0));
                System.out.println("Nome: " + funcionario.getNomeFuncionario(sql));
                System.out.println("Cargo: " + funcionario.getCargo(sql));
                System.out.println("Departamento: " + funcionario.getDepartamento(sql));
                System.out.println("-------------------------");
            }
        }catch (Exception e){
            System.out.println("Falha na consulta: " + e.getMessage());  
        } 
        return 
    }
    public Funcionario atualizarFuncionarios (int idFuncionario){
        Funcionario obj = null;
        String sql = "SELECT * FROM Funcionario WHERE idFuncionario = ?";
        try {
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setInt(1, idFuncionario);
            ResultSet resultados = pst.executeQuery();
            if (resultados.next()){
                int idFuncionario = resultados.getInt("idFuncionario");
                String nome = resultados.getString("nome");
                String cargo = resultados.getString("cargo");
                String departamento = resultados.getString("departamento");
                
                obj = new Funcionario(idFuncionario, nome, cargo, departamento);
                obj.getIdFuncionario(idFuncionario);
                obj.setNomeFuncionario(nome);
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

    public void removerFuncionarios(int idFuncionario){
        String sql = "DELETE FROM Funcionario WHERE idFuncionario = ?";
        try{
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Funcionario excluído.");
        } catch (SQLException e) {
            System.out.println("Falha na exclusão: " + e.getMessage());
        } 
    }

    public void atualizarFuncionarios (Funcionario funcionario){
        String sql = "UPDATE Funcionario SET id = ?, nome = ? WHERE idFuncionario = ?";
        try {
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setInt(1, funcionario.getIdFuncionario(0));
            pst.setString(2, funcionario.nomeFuncionario());
            pst.setString(3, funcionario.getCargo(sql));
            pst.setString(4, funcionario.getDepartamento(sql));

            int resultado = pst.executeUpdate();
            if (resultado > 0){
                System.out.println("Funcionário atualizado com sucesso: " + funcionario);
            }
            else {
                System.out.println("Funcionário não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Falha na atualização: " + e.getMessage());
        } 
    }
}
     

