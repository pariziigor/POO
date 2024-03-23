public class Main {
    public static void main(String[] args) {
        Editora e1 = new Editora("Pearson", "99999");

        Autor a1 = new Autor("Deitel", "121212");
        Autor a2 = new Autor("Maria", "131313");

        Livro livro = new Livro("Java", 2016, 400.00, e1);
        livro.adicionarAutor(a1, a2);
    }
}