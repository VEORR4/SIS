import java.sql.Connection;
import java.sql.DriverManager;
public class ConectaDB {
    //atributo
    private Connection conexao;
    //construtor
    public ConectaDB(){
        // são as credencias da sua conexão com BD
        String url = "jdbc:mariadb://localhost:3306/ed2";
        String user = "root";
        String pwd = "root";

        try {
            conexao = DriverManager.getConnection(url, user, pwd);
            System.out.println("Conexão realizada");
        } catch (Exception e) {
            System.out.println("Falha na conexão");
            System.out.println(e.getMessage());
        }
    }

    public Connection getConexaoDB(){
        return conexao;
    }
}
