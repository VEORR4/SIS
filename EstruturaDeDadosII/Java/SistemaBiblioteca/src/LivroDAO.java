import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class LivroDAO {
    public void inserir(Livro livro) {
        ConectaDB conexao = new ConectaDB();
        String sql = "INSERT INTO livro(titulo, autor, ano) VALUES (?,?,?)";
        try {
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            pst.setString(1, livro.getTitulo());
            pst.setString(2, livro.getAutor());
            pst.setInt(3, livro.getAno_publicacao());
            pst.execute();
            System.out.println("O livro " + livro.getTitulo() + " foi inserido com sucesso.");
        } catch (Exception e) {
            System.out.println("Falha na execução: " + e);
        }

    }

    public LinkedList<Livro> consultarTodos(){
        ConectaDB conexao = new ConectaDB();
        String sql = "SELECT * FROM livro";
        LinkedList<Livro> lista = new LinkedList<>();
        try {
            PreparedStatement pst = conexao.getConexaoDB().prepareStatement(sql);
            ResultSet resultados = pst.executeQuery();
            System.out.println(resultados.next());
            //executar consulta
            while (resultados.next()) {
                //recuperando dados do banco
                String titulo = resultados.getString("titulo");
                String autor = resultados.getString("autor");
                int ano = resultados.getInt("ano");
                int id = resultados.getInt("idLivro");
                //cria objeto java
                Livro obj = new Livro(titulo);
                obj.setAutor(autor);
                obj.setAno_publicacao(ano);
                obj.setId(id);
                //adicionar na lista
                lista.add(obj);
                
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Falha na execução: " + e);
        }
        return null;
    }
}
