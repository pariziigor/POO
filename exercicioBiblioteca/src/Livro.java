import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private double preco;
    private Editora editora;

    public Livro(String titulo, int anoPublicacao, double preco, Editora editora) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.editora = editora;
    }

    private List<Autor> autores = new ArrayList<>();

    public void adicionarAutor(Autor...a){
        Collections.addAll(autores,a);
    }

    public void removerAutor(Autor a){
        this.autores.remove(a);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
}
