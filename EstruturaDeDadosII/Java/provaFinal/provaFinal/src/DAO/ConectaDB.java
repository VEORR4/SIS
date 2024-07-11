package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaDB {

    private Connection conexao;

    public ConectaDB() {
        String url="jdbc:mariadb://localhost:3306/ConexaoDB";
        String usuario="admin";
        String senha="admin";

        try {
            System.out.println("Conectando...");
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada!\n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Não foi possível encontrar o arquivo.");
        }
    }

    public Connection getConexaoDB(){
        return conexao;
    }

    public void desconectaDB() {
        if (conexao != null) {
            try {
                conexao.close();
                System.out.println("Conexão fechada");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}


