package Evaluacion_continua;

public class Libro {
    private String titulo;
    private Autor autor;
    private boolean disponible;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void marcarPrestado() {
        this.disponible = false;
    }

    public void marcarDevuelto() {
        this.disponible = true;
    }
}
