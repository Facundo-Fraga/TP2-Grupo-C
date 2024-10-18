package modelo;

import java.math.BigDecimal;

/**
 * Representa un plato en el menú del restaurante.
 */
public class Plato {
    private Long idPlato;
    private String nombre;
    private BigDecimal precio;
    private CategoriaPlato categoria;

    /**
     * Crea un nuevo plato.
     * 
     * @param idPlato   el identificador único del plato
     * @param nombre    el nombre del plato
     * @param precio    el precio del plato
     * @param categoria la categoría del plato
     */
    public Plato(Long idPlato, String nombre, BigDecimal precio, CategoriaPlato categoria) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Obtiene el id del plato.
     * 
     * @return el id del plato.
     */
    public Long getIdPlato() {
        return idPlato;
    }

    /**
     * Obtiene el nombre del plato.
     * 
     * @return el nombre del plato.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del plato.
     * 
     * @return el precio del plato.
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * Obtiene la categoria del plato.
     * 
     * @return la categoria del plato.
     */
    public CategoriaPlato getCategoria() {
        return categoria;
    }
}