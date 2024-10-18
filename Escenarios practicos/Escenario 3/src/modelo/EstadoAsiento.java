package modelo;

/**
 * La enumeración EstadoAsiento define los posibles estados de un asiento en el avión.
 * Los estados pueden ser:
 * <ul>
 *   <li>LIBRE: El asiento está disponible para ser reservado.</li>
 *   <li>OCUPADO: El asiento ha sido reservado y no está disponible actualmente.</li>
 * </ul>
 */
public enum EstadoAsiento {
    /**
     * Indica que el asiento está disponible para ser reservado.
     */
    LIBRE,

    /**
     * Indica que el asiento ha sido reservado y no está disponible.
     */
    OCUPADO;
}
