package modelo;

/**
 * La enumeración EstadoReserva define los posibles estados de una reserva.
 * Los estados pueden ser:
 * <ul>
 *   <li>ABIERTA: La reserva está activa.</li>
 *   <li>CERRADA: La reserva ha sido completada.</li>
 *   <li>CANCELADA: La reserva ha sido cancelada.</li>
 * </ul>
 */
public enum EstadoReserva {
    /**
     * Indica que la reserva está activa.
     */
    ABIERTA,

    /**
     * Indica que la reserva ha sido completada.
     */
    CERRADA,

    /**
     * Indica que la reserva ha sido cancelada.
     */
    CANCELADA;
}
