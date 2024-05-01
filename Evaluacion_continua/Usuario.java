package Evaluacion_continua;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Libro> librosPrestados;
    private List<Libro> listaTotalLibros; // Lista de todos los libros disponibles

    // Constructor que toma la lista de todos los libros como parámetro
    public Usuario(String nombre, List<Libro> listaTotalLibros) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
        this.listaTotalLibros = listaTotalLibros; // Inicializa la lista de todos los libros
    }

    // Método para tomar prestado un libro
    public void tomarPrestado(String nombre) {
        boolean libroEncontrado = false;
        for (Libro libro : listaTotalLibros) {
            if (libro.getTitulo().equals(nombre)) {
                libroEncontrado = true;
                if (libro.isDisponible()) {
                    libro.marcarPrestado();
                    librosPrestados.add(libro);
                    System.out.println("El libro con título: " + libro.getTitulo() + " ha sido prestado al usuario " + this.nombre);
                } else {
                    System.out.println("El libro '" + nombre + "' no está disponible.");
                }
                break;
            }
        }
        if (!libroEncontrado) {
            System.out.println("Libro no encontrado: " + nombre);
        }
    }

    // Método para devolver un libro
    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.marcarDevuelto();
            librosPrestados.remove(libro);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está en la lista de préstamos de " + nombre + ".");
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
}





