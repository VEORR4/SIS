import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;
    private List<Usuario> usuarios;

    // Construtor
    public Biblioteca() {
        this.acervo = new LinkedList<>();
        this.usuarios = new LinkedList<>();
    }

    // Métodos para Livros
    public void inserirLivro(Livro livro) {
        acervo.add(livro);
    }

    public Livro buscarLivroPorId(int id) {
        for (Livro livro : acervo) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null; // Retorna null se não encontrar o livro com o ID especificado
    }

    public void removerLivroPorId(int id) {
        Livro livroParaRemover = null;
        for (Livro livro : acervo) {
            if (livro.getId() == id) {
                livroParaRemover = livro;
                break;
            }
        }
        if (livroParaRemover != null) {
            acervo.remove(livroParaRemover);
        }
    }

    public void listarLivros() {
        for (Livro livro : acervo) {
            System.out.println(livro);
        }
    }

    // Métodos para Usuários
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null; // Retorna null se não encontrar o usuário com o ID especificado
    }

    public void removerUsuarioPorId(int id) {
        Usuario usuarioParaRemover = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuarioParaRemover = usuario;
                break;
            }
        }
        if (usuarioParaRemover != null) {
            usuarios.remove(usuarioParaRemover);
        }
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
