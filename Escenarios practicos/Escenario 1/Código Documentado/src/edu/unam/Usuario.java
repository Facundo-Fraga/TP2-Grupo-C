package edu.unam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase Usuario representa un usuario del sistema de biblioteca.
 * Cada usuario tiene un identificador, un nombre, y una lista de préstamos de
 * libros.
 * Proporciona funcionalidades para realizar préstamos y devoluciones de libros.
 */
public class Usuario {

    /**
     * Identificador único del usuario.
     */
    private String id;

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Lista de préstamos asociados al usuario.
     */
    private List<Prestamo> prestamos = new ArrayList<>();

    /**
     * Constructor para crear un nuevo usuario con un ID y nombre.
     * 
     * @param id     El identificador único del usuario.
     * @param nombre El nombre del usuario.
     * @throws IllegalArgumentException si el nombre o el id están en blanco o
     *                                  nulos.
     */
    public Usuario(String id, String nombre) {
        if (!nombre.isBlank() && !id.isBlank()) {
            this.id = id;
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("VALOR EN BLANCO O NULO");
        }
    }

    /**
     * Devuelve el identificador del usuario.
     * 
     * @return El identificador del usuario.
     */
    public String getId() {
        return id;
    }

    /**
     * Devuelve el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve una copia de la lista de préstamos del usuario.
     * 
     * @return Una lista con los préstamos del usuario.
     */
    public List<Prestamo> getPrestamos() {
        List<Prestamo> retPrestamos = new ArrayList<>();
        retPrestamos.addAll(prestamos);
        return retPrestamos;
    }

    /**
     * Establece un nuevo nombre para el usuario.
     * 
     * @param nombre El nuevo nombre del usuario.
     * @throws IllegalArgumentException si el nombre es nulo o está en blanco.
     */
    public void setNombre(String nombre) {
        if (!nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("NOMBRE EN BLANCO O NULO");
        }
    }

    /**
     * Permite al usuario realizar el préstamo de un libro, siempre que esté
     * disponible.
     * Cambia el estado del libro a 'PRESTADO' y agrega el préstamo a la lista del
     * usuario.
     * 
     * @param libro El libro que será prestado.
     * @return El objeto Prestamo correspondiente al préstamo realizado.
     * @throws IllegalArgumentException si el libro es nulo o no está disponible.
     */
    public Prestamo prestarLibro(Libro libro) {
        if (libro != null && libro.getEstado() == EstadoLibro.DISPONIBLE) {
            Prestamo nuevoPrestamo = new Prestamo(libro, this);
            libro.setEstado(EstadoLibro.PRESTADO);
            prestamos.add(nuevoPrestamo);
            return nuevoPrestamo;
        } else {
            throw new IllegalArgumentException("LIBRO INEXISTENTE/NO DISPONIBLE");
        }
    }

    /**
     * Permite al usuario devolver un libro prestado, marcando el préstamo como
     * completado
     * y cambiando el estado del libro a 'DISPONIBLE'.
     * 
     * @param prestamo El préstamo correspondiente al libro a devolver.
     * @return El objeto Prestamo con el estado actualizado a 'COMPLETADO'.
     * @throws IllegalArgumentException si el préstamo es nulo o no pertenece a la
     *                                  lista de préstamos del usuario.
     */
    public Prestamo devolverLibro(Prestamo prestamo) {
        if (prestamo != null && prestamos.contains(prestamo)) {
            prestamo.setFechaDevolucion(LocalDate.now());
            prestamo.setEstado(EstadoPrestamo.COMPLETADO);
            prestamo.getLibro().setEstado(EstadoLibro.DISPONIBLE);
            return prestamo;
        } else {
            throw new IllegalArgumentException("ERROR AL DEVOLVER EL LIBRO");
        }
    }
    
}

