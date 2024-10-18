package modelo;

import java.util.Date;

/**
 * La clase Reserva representa una reserva de vuelo realizada por un usuario.
 * Incluye información sobre el vuelo, el asiento, la fecha de la reserva y el estado actual de la reserva.
 */
public class Reserva {

    /**
     * Vuelo asociado a la reserva.
     */
    private Vuelo vuelo;

    /**
     * Asiento reservado por el usuario.
     */
    private Asiento asiento;

    /**
     * Fecha en la que se realizó la reserva.
     */
    private Date fechaReserva;

    /**
     * Estado actual de la reserva.
     */
    private EstadoReserva estado;

    /**
     * Constructor para crear una nueva reserva.
     * 
     * @param vuelo        El vuelo reservado.
     * @param asiento      El asiento reservado.
     * @param fechaReserva La fecha en la que se realizó la reserva.
     * @param estado       El estado de la reserva (ABIERTA, CERRADA o CANCELADA).
     */
    public Reserva(Vuelo vuelo, Asiento asiento, Date fechaReserva, EstadoReserva estado) {
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
    }

    // Getters y Setters
    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }
}
