package modelo;

import java.time.LocalTime;
import java.util.List;

/**
 * Representa un pedido realizado por un cliente.
 */
public class Pedido {
    private Long idPrestamo;
    private LocalTime horaCreacion;
    private EstadoPedido estado;
    private List<Plato> platos;

    /**
     * Crea un nuevo pedido.
     * 
     * @param cliente el cliente que realiza el pedido
     * @param horaCreacion la hora de creación del pedido
     * @param platos la lista de platos en el pedido
     */
    public Pedido(Cliente cliente, LocalTime horaCreacion, List<Plato> platos) {
        this.horaCreacion = horaCreacion;
        this.platos = platos;
        this.estado = EstadoPedido.PENDIENTE; // Estado inicial por defecto
    }

    /**
     * Cambia el estado del pedido.
     * 
     * @param nuevoEstado el nuevo estado del pedido
     */
    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado del pedido ha cambiado a " + nuevoEstado);
    }

    /**
     * Obtiene el id de la prestamo.
     * 
     * @return el id de la prestamo.
     */
    public Long getIdPrestamo() {
        return idPrestamo;
    }
    /**
     * Obtiene la hora de creacion del pedido.
     * 
     * @return la hora de creacion del pedido.
     */
    public LocalTime getHoraCreacion() {
        return horaCreacion;
    }
    /**
     * Obtiene el estado del pedido.
     * 
     * @return el estado del pedido.
     */
    public EstadoPedido getEstado() {
        return estado;
    }
    /**
     * Obtiene los platos del pedido.
     * 
     * @return los platos del pedido.
     */
    public List<Plato> getPlatos() {
        return platos;
    }
}