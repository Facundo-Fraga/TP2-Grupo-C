package modelo;

import java.util.Date;

/**
 * La clase Vuelo representa un vuelo operado por una aerolínea.
 * Incluye información sobre la fecha de salida y el estado del vuelo.
 */
public class Vuelo {

    /**
     * Número del vuelo.
     */
    private String numeroVuelo;

    /**
     * Fecha y hora de salida del vuelo.
     */
    private Date fechaSalida;

    /**
     * Estado actual del vuelo.
     */
    private EstadoVuelo estado;

    /**
     * Constructor para crear un vuelo con un número de vuelo, fecha de salida y estado.
     * 
     * @param numeroVuelo El número del vuelo.
     * @param fechaSalida La fecha de salida del vuelo.
     * @param estado      El estado actual del vuelo.
     */
    public Vuelo(String numeroVuelo, Date fechaSalida, EstadoVuelo estado) {
        this.numeroVuelo = numeroVuelo;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
    }

    /**
     * Devuelve el número del vuelo.
     * 
     * @return El número del vuelo.
     */
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * Establece el número del vuelo.
     * 
     * @param numeroVuelo El nuevo número del vuelo.
     */
    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    /**
     * Devuelve la fecha de salida del vuelo.
     * 
     * @return La fecha de salida del vuelo.
     */
    public Date getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Establece la fecha de salida del vuelo.
     * 
     * @param fechaSalida La nueva fecha de salida.
     */
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Devuelve el estado del vuelo.
     * 
     * @return El estado del vuelo.
     */
    public EstadoVuelo getEstado() {
        return estado;
    }

    /**
     * Establece el estado del vuelo.
     * 
     * @param estado El nuevo estado del vuelo.
     */
    public void setEstado(EstadoVuelo estado) {
        this.estado = estado;
    }
}
