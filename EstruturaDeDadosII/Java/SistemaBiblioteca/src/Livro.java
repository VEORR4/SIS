public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private static int contador = 0;

    public Livro(String titulo) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAno_publicacao(ano_publicacao);
        
        //contador += 1;
        //this.setId(contador);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        titulo = titulo.toUpperCase();
        this.titulo = titulo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public String toString() {
        return "Id: " + getId() + " Titulo: " + getTitulo() + " Autor: " + getAutor() + " Ano: " + getAno_publicacao();
    }

}