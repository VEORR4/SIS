import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Livro obj1 = new Livro("Calculo 1");
        obj1.setAutor("Matemática 1");
        obj1.setAno_publicacao(2005);
        Livro obj2 = new Livro("Estrutura de dados");
        obj2.setAutor("Matemática 2");
        obj2.setAno_publicacao(2008);
        Livro obj3 = new Livro("Banco de dados");
        obj3.setAutor("Matemática 3");
        obj3.setAno_publicacao(2010);

        Usuario user1 = new Usuario("Julia Teixeira Barbosa", "julia@email.com");
        Usuario user2 = new Usuario("Rafael Peres Ferreira", "rafael@email.com");

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("\n\n ********** LIVROS ********** \n");

        System.out.println("INSERINDO LIVROS...\n");
        biblioteca.inserir(obj1);
        biblioteca.inserir(obj2);
        biblioteca.inserir(obj3);

        System.out.println("\n\nLISTANDO TODOS OS LIVROS...\n");
        biblioteca.listarTodos();

        System.out.println("\n\nBUSCANDO LIVRO POR ID...\n");
        Livro obj4 = biblioteca.consultaID(5);
        if (obj4 != null) {
            System.out.println(obj4);
        }

        System.out.println("\n\nREMOVENDO LIVRO POR ID...\n");
        biblioteca.remover(2);

        System.out.println("\n\n ********** USUÁRIOS ********** \n");

        System.out.println("INSERINDO USUÁRIOS...\n");
        biblioteca.inserirUsuario(user1);
        biblioteca.inserirUsuario(user2);

        System.out.println("\n\nLISTANDO TODOS OS USUÁRIOS...\n");
        biblioteca.listarTodosUsuarios();

        System.out.println("\n\nBUSCANDO USUÁRIOS POR ID...\n");
        System.out.println(biblioteca.consultaIDUsuario(2));

        System.out.println("\n\nREMOVENDO USUÁRIOS POR ID...\n");
        biblioteca.removerUsuario(2);

    }
}
