package modelo;

/**
 * La clase Asiento representa un asiento en un avión.
 * Cada asiento tiene un número y un estado que indica si está libre o ocupado.
 */
public class Asiento {

    /**
     * Número del asiento.
     */
    private String numero;

    /**
     * Estado actual del asiento.
     */
    private EstadoAsiento estado;

    /**
     * Constructor para crear un nuevo asiento con un número y estado.
     * 
     * @param numero El número del asiento.
     * @param estado El estado del asiento (LIBRE u OCUPADO).
     */
    public Asiento(String numero, EstadoAsiento estado) {
        this.numero = numero;
        this.estado = estado;
    }

    /**
     * Devuelve el número del asiento.
     * 
     * @return El número del asiento.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Establece un nuevo número para el asiento.
     * 
     * @param numero El nuevo número del asiento.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Devuelve el estado del asiento.
     * 
     * @return El estado actual del asiento.
     */
    public EstadoAsiento getEstado() {
        return estado;
    }

    /**
     * Establece un nuevo estado para el asiento.
     * 
     * @param estado El nuevo estado del asiento.
     */
    public void setEstado(EstadoAsiento estado) {
        this.estado = estado;
    }
}
