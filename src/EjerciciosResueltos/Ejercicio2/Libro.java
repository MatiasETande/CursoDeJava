package EjerciciosResueltos.Ejercicio2;

public class Libro {

    private long ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro(long ISBN, String titulo, String autor, int numeroDePaginas){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroDePaginas=numeroDePaginas;
    }

    //get
    public long getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }


    //Setter
    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numero de Paginas=" + numeroDePaginas +
                '}';
    }
}
