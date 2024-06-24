import java.util.LinkedList;

public class MainDB {
    public static void main(String[] args) {/* 
        Livro liv = new Livro("O Senhor dos Anéis", "J. R. R Tolkien", 1953); */

        LivroDAO objDAO = new LivroDAO();
        //objDAO.inserir(liv);
        
        LinkedList<Livro> dados = objDAO.consultarTodos();
        System.out.println(dados);
    }
}
