import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Livro> dados;
    private LinkedList<Usuario> dadosUsuario;

    public Biblioteca() {
        dados = new LinkedList<Livro>();
        dadosUsuario = new LinkedList<Usuario>();
    }
    /* LIVRO */

    public void inserir(Livro livro){
        if (dados.contains(livro)) {
            System.out.println("O livro " + livro.getTitulo() + " já está inserido na lista.");
        } else {
            dados.add(livro);
            System.out.println("O livro " + livro.getTitulo() + " foi inserido com sucesso.");
        }
    }

    public Livro consultaID(int id) {
        for (Livro livro : dados) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        System.out.println("ID " + id +" não cadastrado");
        return null;
    }

    public void remover(int id){
        for (Livro livro : dados) {
            if (livro.getId() == id) {
                dados.remove(livro);
                System.out.println("O livro " + livro.getTitulo() + " foi removido da lista.");
            }
        }
    }

    public void listarTodos(){
        System.out.println("ID\tTitulo\tAutor\tAno publicação");
        for (Livro livro : dados) {
            String aux = livro.getId() + "\t" + livro.getTitulo() + "\t" + livro.getAutor() + "\t" + livro.getAno_publicacao();
            System.out.println(aux);
        }
    }

    /* USUÁRIOS */

    public void inserirUsuario(Usuario usuario){
        if (dadosUsuario.contains(usuario)) {
            System.out.println("O usuário " + usuario.getNome() + " já está cadastrado na biblioteca.");
        } else {
            dadosUsuario.add(usuario);
            System.out.println("O usuário " + usuario.getNome() + " foi cadastrado com sucesso.");
        }
    }

    public Usuario consultaIDUsuario(int id) {
        for (Usuario usuario : dadosUsuario) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        System.out.println("Usuário não cadastrado");
        return null;
    }

    public void removerUsuario(int id){
        for (Usuario usuario : dadosUsuario) {
            if (usuario.getId() == id) {
                dadosUsuario.remove(usuario);
                System.out.println("O cadastro do usuário " + usuario.getNome() + " foi removido.");
            }
        }
    }

    public void listarTodosUsuarios(){
        System.out.println("ID\tNome\tE-mail");
        for (Usuario usuario : dadosUsuario) {
            String aux = usuario.getId() + "\t" + usuario.getNome() + "\t" + usuario.getEmail();
            System.out.println(aux);
        }
    }

}

/* 
Inserção de Livros: O sistema deve permitir a inserção de novos livros.
Busca de Livros: O sistema deve permitir a busca de livros pelo ID.
Remoção de Livros: O sistema deve permitir a remoção de livros pelo ID.
Listagem de Livros:
 */
