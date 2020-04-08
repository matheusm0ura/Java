package introdução.POO.associaçao.classes;

public class LivroLivraria {
    private String titulo;
    private String autor;
    private String genero;
    private  int isbn;
    private double preco;



    public LivroLivraria(String titulo, String autor, int isbn, String genero, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
        this.genero = genero;
    }

    public LivroLivraria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String dados(){
        return String.format("\nTítulo: %s \nAutor: %s \nISBN: %d \nPreço: R$ %.2f \nGênero: %s",
                this.getTitulo(),
                this.getAutor(),
                this.getIsbn(),
                this.getPreco(),
                this.getGenero());
    }

}
