package modelo;

/**
 * La clase Avion representa un avión utilizado para operar vuelos.
 * Incluye información sobre el modelo del avión y la capacidad de asientos.
 */
public class Avion {

    /**
     * Modelo del avión.
     */
    private String modelo;

    /**
     * Capacidad de asientos del avión.
     */
    private int capacidad;

    /**
     * Constructor para crear un nuevo avión.
     * 
     * @param modelo    El modelo del avión.
     * @param capacidad La capacidad de asientos del avión.
     */
    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    /**
     * Devuelve el modelo del avión.
     * 
     * @return El modelo del avión.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del avión.
     * 
     * @param modelo El nuevo modelo del avión.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve la capacidad de asientos del avión.
     * 
     * @return La capacidad de asientos.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad de asientos del avión.
     * 
     * @param capacidad La nueva capacidad de asientos.
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
