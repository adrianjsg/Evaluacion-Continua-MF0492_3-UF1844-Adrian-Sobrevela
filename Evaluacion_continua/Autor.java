package Evaluacion_continua;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private List<Libro> libros;

    public Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void publicarLibro(Libro libro) {
        libros.add(libro);
    }
}

