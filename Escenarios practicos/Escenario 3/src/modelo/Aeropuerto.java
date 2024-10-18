package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Aeropuerto representa un aeropuerto en el sistema.
 * Cada aeropuerto tiene un nombre y una lista de vuelos que operan en él.
 */
public class Aeropuerto {

    /**
     * Nombre del aeropuerto.
     */
    private String nombre;

    /**
     * Lista de vuelos que operan en el aeropuerto.
     */
    private List<Vuelo> vuelos;

    /**
     * Constructor para crear un nuevo aeropuerto con un nombre.
     * 
     * @param nombre El nombre del aeropuerto.
     */
    public Aeropuerto(String nombre) {
        this.nombre = nombre;
        this.vuelos = new ArrayList<>();
    }

    /**
     * Devuelve el nombre del aeropuerto.
     * 
     * @return El nombre del aeropuerto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el aeropuerto.
     * 
     * @param nombre El nuevo nombre del aeropuerto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la lista de vuelos que operan en el aeropuerto.
     * 
     * @return Una lista de vuelos.
     */
    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    /**
     * Agrega un nuevo vuelo a la lista de vuelos del aeropuerto.
     * 
     * @param vuelo El vuelo a agregar.
     */
    public void agregarVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
    }

    /**
     * Elimina un vuelo de la lista de vuelos del aeropuerto.
     * 
     * @param vuelo El vuelo a eliminar.
     * @return true si el vuelo fue eliminado, false si no estaba en la lista.
     */
    public boolean eliminarVuelo(Vuelo vuelo) {
        return this.vuelos.remove(vuelo);
    }
}
