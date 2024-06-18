public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Inserindo alguns livros
        biblioteca.inserirLivro(new Livro(1, "Dom Quixote", "Miguel de Cervantes", 1605));
        biblioteca.inserirLivro(new Livro(2, "A Arte da Guerra", "Sun Tzu", -500));
        biblioteca.inserirLivro(new Livro(3, "Cem Anos de Solidão", "Gabriel García Márquez", 1967));

        // Listando todos os livros
        System.out.println("Listagem de Livros:");
        biblioteca.listarLivros();

        // Buscando livro pelo ID
        System.out.println("\nBuscando livro pelo ID 2:");
        Livro livroEncontrado = biblioteca.buscarLivroPorId(2);
        if (livroEncontrado != null) {
            System.out.println(livroEncontrado);
        } else {
            System.out.println("Livro não encontrado.");
        }

        // Removendo livro pelo ID
        System.out.println("\nRemovendo livro pelo ID 1:");
        biblioteca.removerLivroPorId(1);
        System.out.println("Listagem de Livros atualizada:");
        biblioteca.listarLivros();

        // Inserindo alguns usuários
        biblioteca.registrarUsuario(new Usuario(1, "Alice", "alice@email.com"));
        biblioteca.registrarUsuario(new Usuario(2, "Bob", "bob@email.com"));

        // Listando todos os usuários
        System.out.println("\nListagem de Usuários:");
        biblioteca.listarUsuarios();

        // Buscando usuário pelo ID
        System.out.println("\nBuscando usuário pelo ID 2:");
        Usuario usuarioEncontrado = biblioteca.buscarUsuarioPorId(2);
        if (usuarioEncontrado != null) {
            System.out.println(usuarioEncontrado);
        } else {
            System.out.println("Usuário não encontrado.");
        }

        // Removendo usuário pelo ID
        System.out.println("\nRemovendo usuário pelo ID 1:");
        biblioteca.removerUsuarioPorId(1);
        System.out.println("Listagem de Usuários atualizada:");
        biblioteca.listarUsuarios();
    }
}
