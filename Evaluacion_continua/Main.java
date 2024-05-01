package Evaluacion_continua;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crea autores
        Autor jkRowling = new Autor("J.K. Rowling");
        Autor stephenKing = new Autor("Stephen King");
        
        // Publica libros para cada autor
        Libro harryPotter1 = new Libro("Harry Potter y la piedra filosofal", jkRowling);
        Libro harryPotter2 = new Libro("Harry Potter y la cámara secreta", jkRowling);
        Libro harryPotter3 = new Libro("Harry Potter y el prisionero de Azkaban", jkRowling);
        jkRowling.publicarLibro(harryPotter1);
        jkRowling.publicarLibro(harryPotter2);
        jkRowling.publicarLibro(harryPotter3);

        Libro it = new Libro("It", stephenKing);
        Libro elResplandor = new Libro("El resplandor", stephenKing);
        Libro cementerioDeAnimales = new Libro("Cementerio de animales", stephenKing);
        stephenKing.publicarLibro(it);
        stephenKing.publicarLibro(elResplandor);
        stephenKing.publicarLibro(cementerioDeAnimales);

        // Lista de todos los libros disponibles
        List<Libro> listaTotalLibros = new ArrayList<>();
        listaTotalLibros.add(harryPotter1);
        listaTotalLibros.add(harryPotter2);
        listaTotalLibros.add(harryPotter3);
        listaTotalLibros.add(it);
        listaTotalLibros.add(elResplandor);
        listaTotalLibros.add(cementerioDeAnimales);

        // Crea usuario y miembro premium
        Usuario usuario = new Usuario("Usuario1", listaTotalLibros);
        MiembroPremium miembroPremium = new MiembroPremium("Usuario2 (Miembro Premium)", listaTotalLibros);

        // Realiza las acciones requeridas y mostrar la disponibilidad de los libros
        // Usuario toma prestado un libro y mostrar su disponibilidad
        usuario.tomarPrestado("Harry Potter y la piedra filosofal");
        System.out.println("Estado de 'Harry Potter y la piedra filosofal': " + (harryPotter1.isDisponible() ? "Disponible" : "No disponible"));

        // Devolver el libro tomado prestado y mostrar su disponibilidad
        usuario.devolverLibro(harryPotter1);
        System.out.println("Estado de 'Harry Potter y la piedra filosofal': " + (harryPotter1.isDisponible() ? "Disponible" : "No disponible"));

        // Reservar un libro no disponible y mostrar su disponibilidad
        miembroPremium.reservarLibro(it);
        System.out.println("Estado de 'It': " + (it.isDisponible() ? "Disponible" : "No disponible"));

        // Reservar un libro disponible y mostrar su disponibilidad
        miembroPremium.reservarLibro(elResplandor);
        System.out.println("Estado de 'El resplandor': " + (elResplandor.isDisponible() ? "Disponible" : "No disponible"));

        // Usuario toma prestado un libro que estaba reservado por MiembroPremium y mostrar su disponibilidad
        usuario.tomarPrestado("El resplandor");
        System.out.println("Estado de 'El resplandor': " + (elResplandor.isDisponible() ? "Disponible" : "No disponible"));
    }
}




