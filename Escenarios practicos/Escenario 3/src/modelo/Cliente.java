package modelo;

/**
 * La clase Cliente representa a un cliente del sistema de reservas.
 * Cada cliente tiene un nombre y un identificador único.
 */
public class Cliente {

    /**
     * Identificador único del cliente.
     */
    private String id;

    /**
     * Nombre del cliente.
     */
    private String nombre;

    /**
     * Constructor para crear un nuevo cliente con un ID y nombre.
     * 
     * @param id     El identificador único del cliente.
     * @param nombre El nombre del cliente.
     */
    public Cliente(String id, String nombre) {
        if (id.isBlank() || nombre.isBlank()) {
            throw new IllegalArgumentException("ID y nombre no pueden estar en blanco.");
        }
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Devuelve el identificador del cliente.
     * 
     * @return El identificador del cliente.
     */
    public String getId() {
        return id;
    }

    /**
     * Devuelve el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el cliente.
     * 
     * @param nombre El nuevo nombre del cliente.
     * @throws IllegalArgumentException si el nombre es nulo o está en blanco.
     */
    public void setNombre(String nombre) {
        if (nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar en blanco.");
        }
        this.nombre = nombre;
    }
}
