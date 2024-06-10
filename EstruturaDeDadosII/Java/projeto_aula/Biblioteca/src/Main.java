import java.util.*;

// Classe Livro
class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(int id, String titulo, String autor, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}

// Classe Biblioteca
class Biblioteca {
    private LinkedList<Livro> livros;

    public Biblioteca() {
        this.livros = new LinkedList<>();
    }

    public void inserirLivro(Livro livro) {
        livros.add(livro);
    }

    public Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public void removerLivroPorId(int id) {
        livros.removeIf(livro -> livro.getId() == id);
    }

    public List<Livro> listarLivros() {
        List<Livro> listaOrdenada = new ArrayList<>(livros);
        listaOrdenada.sort(Comparator.comparingInt(Livro::getId));
        return listaOrdenada;
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Inserir livros
        biblioteca.inserirLivro(new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        biblioteca.inserirLivro(new Livro(2, "O Guia do Mochileiro das Galáxias", "Douglas Adams", 1979));
        biblioteca.inserirLivro(new Livro(3, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997));

        // Buscar livros por ID
        Livro livroBuscado = biblioteca.buscarLivroPorId(2);
        if (livroBuscado != null) {
            System.out.println("Livro encontrado: " + livroBuscado);
        } else {
            System.out.println("Livro com ID 2 não encontrado.");
        }

        // Remover livros por ID
        biblioteca.removerLivroPorId(3);
        System.out.println("Livro com ID 3 removido.");

        // Listar livros
        System.out.println("\nLista de livros:");
        for (Livro livro : biblioteca.listarLivros()) {
            System.out.println(livro);
        }
    }
}
