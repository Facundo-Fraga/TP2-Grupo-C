package edu.unam;

/**
 * La enumeración EstadoLibro define los posibles estados de un libro en el sistema de biblioteca.
 * Los estados pueden ser:
 * <ul>
 *   <li>DISPONIBLE: El libro está disponible para ser prestado.</li>
 *   <li>PRESTADO: El libro ha sido prestado y no está disponible actualmente.</li>
 * </ul>
 */
public enum EstadoLibro {
    /**
     * Indica que el libro está disponible para ser prestado.
     */
    DISPONIBLE,

    /**
     * Indica que el libro ha sido prestado y no está disponible.
     */
    PRESTADO;
}
