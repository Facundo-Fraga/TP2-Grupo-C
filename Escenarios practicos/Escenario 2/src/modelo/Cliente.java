package modelo;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Representa un cliente del restaurante.
 */
public class Cliente {
    private Long idCliente;
    private String nombre;
    private Mesa mesa;

    /**
     * Crea un nuevo cliente.
     * 
     * @param idCliente el identificador único del cliente
     * @param nombre    el nombre del cliente
     */
    public Cliente(Long idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    /**
     * Realiza un pedido para una mesa.
     * 
     * @param mesa   la mesa en la que se realiza el pedido
     * @param platos los platos que se están pidiendo
     */
    public void realizarPedido(Mesa mesa, ArrayList<Plato> platos) {
        if (!mesa.isEstadoOcupacion()) {
            System.out.println("La mesa no está ocupada. No se puede realizar el pedido.");
            return;
        }
        Pedido pedido = new Pedido(this, LocalTime.now(), platos);
        System.out.println("Pedido realizado para la mesa " + mesa.getIdMesa());
    }

    /**
     * Permite al cliente tomar una mesa si está disponible.
     * 
     * @param mesa la mesa a tomar
     */
    public void tomarMesa(Mesa mesa) {
        if (mesa.isEstadoOcupacion()) {
            System.out.println("La mesa ya está ocupada.");
        } else {
            this.mesa = mesa;
            mesa.cambiarEstado(true);
            System.out.println("Cliente ha tomado la mesa " + mesa.getIdMesa());
        }
    }

    /**
     * Obtiene el id del cliente.
     * 
     * @return el id del cliente.
     */
    public Long getIdCliente() {
        return idCliente;
    }
    /**
     * Obtiene el nombre del cliente.
     * 
     * @return el nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene la mesa donde esta el cliente.
     * 
     * @return la mesa donde esta el cliente.
     */
    public Mesa getMesa() {
        return mesa;
    }
}