package Evaluacion_continua;

import java.util.List;
import java.util.ArrayList;

public class MiembroPremium extends Usuario {
    private List<Libro> librosReservados;

    public MiembroPremium(String nombre, List<Libro> listaTotalLibros) {
        super(nombre, listaTotalLibros); // Llamada al constructor de la clase base Usuario
        this.librosReservados = new ArrayList<>();
    }

    public List<Libro> getLibrosReservados() {
        return librosReservados;
    }

    public void setLibrosReservados(List<Libro> librosReservados) {
        this.librosReservados = librosReservados;
    }

    public void reservarLibro(Libro libro) {
        if (libro.isDisponible()) {
            libro.marcarPrestado(); // Marcar el libro como prestado al reservarlo
            librosReservados.add(libro);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido reservado por el miembro premium " + getNombre());
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible para reserva.");
        }
    }
}







