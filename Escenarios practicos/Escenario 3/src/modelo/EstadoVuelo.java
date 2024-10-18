package modelo;

/**
 * La enumeración EstadoVuelo define los posibles estados de un vuelo en el sistema de reservas de vuelos.
 * Los estados pueden ser:
 * <ul>
 *   <li>PROGRAMADO: El vuelo está programado y listo para realizarse.</li>
 *   <li>EMBARCANDO: El vuelo está en proceso de embarque.</li>
 *   <li>EN_RUTA: El vuelo está en curso.</li>
 *   <li>ATRASADO: El vuelo ha sido retrasado.</li>
 *   <li>CANCELADO: El vuelo ha sido cancelado.</li>
 *   <li>DESVIADO: El vuelo ha sido desviado de su ruta original.</li>
 *   <li>FINALIZADO: El vuelo ha aterrizado y se ha completado.</li>
 * </ul>
 */
public enum EstadoVuelo {
    /**
     * Indica que el vuelo está programado y listo para realizarse.
     */
    PROGRAMADO,

    /**
     * Indica que el vuelo está en proceso de embarque.
     */
    EMBARCANDO,

    /**
     * Indica que el vuelo está en curso.
     */
    EN_RUTA,

    /**
     * Indica que el vuelo ha sido retrasado.
     */
    ATRASADO,

    /**
     * Indica que el vuelo ha sido cancelado.
     */
    CANCELADO,

    /**
     * Indica que el vuelo ha sido desviado de su ruta original.
     */
    DESVIADO,

    /**
     * Indica que el vuelo ha aterrizado y se ha completado.
     */
    FINALIZADO;
}
