package modelo;

import java.util.Date;

/**
 * La clase Aerolinea representa una compañía aérea que opera varios vuelos.
 * Proporciona funcionalidades para agregar vuelos y reprogramarlos.
 */
public class Aerolinea {

    /**
     * Nombre de la aerolínea.
     */
    private String nombre;

    /**
     * Lista de vuelos operados por la aerolínea.
     */
    private Vuelo[] vuelos;

    /**
     * Constructor para crear una nueva aerolínea con un nombre y una lista de vuelos.
     * 
     * @param nombre El nombre de la aerolínea.
     * @param vuelos La lista de vuelos.
     */
    public Aerolinea(String nombre, Vuelo[] vuelos) {
        this.nombre = nombre;
        this.vuelos = vuelos;
    }

    /**
     * Devuelve el nombre de la aerolínea.
     * 
     * @return El nombre de la aerolínea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la aerolínea.
     * 
     * @param nombre El nuevo nombre de la aerolínea.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la lista de vuelos de la aerolínea.
     * 
     * @return La lista de vuelos.
     */
    public Vuelo[] getVuelos() {
        return vuelos;
    }

    /**
     * Establece la lista de vuelos de la aerolínea.
     * 
     * @param vuelos La nueva lista de vuelos.
     */
    public void setVuelos(Vuelo[] vuelos) {
        this.vuelos = vuelos;
    }

    /**
     * Agrega un vuelo a la lista de vuelos de la aerolínea.
     * 
     * @param vuelo El vuelo a agregar.
     */
    public void agregarVuelo(Vuelo vuelo) {
        // Lógica para agregar un vuelo
    }

    /**
     * Reprograma un vuelo cambiando la fecha de salida.
     * 
     * @param salida La nueva fecha de salida del vuelo.
     */
    public void reprogramarVuelo(Date salida) {
        // Lógica para reprogramar un vuelo
    }
}
