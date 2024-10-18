package edu.unam;

import java.time.LocalDate;

/**
 * La clase Prestamo representa el préstamo de un libro por parte de un usuario en el sistema de biblioteca. 
 * Incluye información sobre las fechas de préstamo, vencimiento y devolución, así como el estado del préstamo.
 */
public class Prestamo {

    /**
     * La fecha en la que se realiza el préstamo. Por defecto, se inicializa con la fecha actual.
     */
    private LocalDate fechaPrestamo = LocalDate.now();

    /**
     * La fecha de vencimiento del préstamo. Por defecto, es 10 días después de la fecha del préstamo.
     */
    private LocalDate fechaVencimiento = fechaPrestamo.plusDays(10);

    /**
     * La fecha en la que el libro fue devuelto. Puede ser nula si el libro no ha sido devuelto.
     */
    private LocalDate fechaDevolucion;

    /**
     * El estado del préstamo (activo, completado, etc.). Se inicializa por defecto como ACTIVO.
     */
    private EstadoPrestamo estado = EstadoPrestamo.ACTIVO;

    /**
     * El libro que está siendo prestado.
     */
    private Libro libro;

    /**
     * El usuario que realiza el préstamo.
     */
    private Usuario usuario;

    /**
     * Constructor para crear un nuevo préstamo.
     * 
     * @param libro El libro que se va a prestar.
     * @param usuario El usuario que está solicitando el préstamo.
     * @throws IllegalArgumentException si el libro o el usuario son nulos.
     */
    public Prestamo(Libro libro, Usuario usuario) {
        if (libro != null && usuario != null) {
            this.libro = libro;
            this.usuario = usuario;
        } else {
            throw new IllegalArgumentException("LIBRO O USUARIO NULOS");
        }
    }

    /**
     * Devuelve la fecha en la que se realizó el préstamo.
     * 
     * @return La fecha de préstamo.
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Devuelve la fecha de vencimiento del préstamo.
     * 
     * @return La fecha de vencimiento.
     */
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Devuelve la fecha en la que el libro fue devuelto.
     * 
     * @return La fecha de devolución del libro, o null si no ha sido devuelto.
     */
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Devuelve el estado actual del préstamo.
     * 
     * @return El estado del préstamo (por ejemplo, ACTIVO, COMPLETADO).
     */
    public EstadoPrestamo getEstado() {
        return estado;
    }

    /**
     * Devuelve el libro que está siendo prestado.
     * 
     * @return El libro prestado.
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Devuelve el usuario que realizó el préstamo.
     * 
     * @return El usuario que solicitó el préstamo.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Establece la fecha de devolución del préstamo.
     * 
     * @param fechaDevolucion La fecha en la que el libro fue devuelto.
     */
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Establece un nuevo estado para el préstamo.
     * 
     * @param estado El nuevo estado del préstamo (por ejemplo, ACTIVO, COMPLETADO).
     */
    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }
}
