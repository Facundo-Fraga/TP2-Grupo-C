package edu.unam;

/**
 * La enumeración EstadoPrestamo define los posibles estados de un préstamo en el sistema de biblioteca.
 * Los estados pueden ser:
 * <ul>
 *   <li>ACTIVO: El préstamo está en curso y el libro no ha sido devuelto.</li>
 *   <li>COMPLETADO: El préstamo ha sido completado y el libro ha sido devuelto.</li>
 * </ul>
 */
public enum EstadoPrestamo {
    /**
     * Indica que el préstamo está activo. El libro aún no ha sido devuelto.
     */
    ACTIVO,

    /**
     * Indica que el préstamo ha sido completado. El libro ha sido devuelto.
     */
    COMPLETADO;
}
