package modelo;

/**
 * Representa una mesa en el restaurante.
 */
public class Mesa {
    private Long idMesa;
    private boolean estadoOcupacion;

    /**
     * Crea una nueva mesa.
     * 
     * @param idMesa el identificador único de la mesa
     */
    public Mesa(Long idMesa) {
        this.idMesa = idMesa;
        this.estadoOcupacion = false; // Por defecto desocupada
    }

    /**
     * Cambia el estado de ocupación de la mesa.
     * 
     * @param estado el nuevo estado de ocupación (true si está ocupada, false si está desocupada)
     */
    public void cambiarEstado(boolean estado) {
        this.estadoOcupacion = estado;
        System.out.println("El estado de la mesa " + idMesa + " ha cambiado a " + (estado ? "Ocupada" : "Desocupada"));
    }

    // Getters y setters
    public Long getIdMesa() {
        return idMesa;
    }

    public boolean isEstadoOcupacion() {
        return estadoOcupacion;
    }
}
