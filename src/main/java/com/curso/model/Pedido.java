package com.curso.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Clase que representa un pedido en el sistema.
 */
@Entity
@Table(name = "pedidos")
public class Pedido {

    /**
     * Identificador único del pedido.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    /**
     * Código del producto asociado al pedido.
     */
    @Column(name = "codigo_producto")
    private int codigoProducto;
    /**
     * Cantidad de unidades solicitadas en el pedido.
     */
    private int unidades;
    /**
     * Total del pedido en términos de costo.
     */
    private double total;
    /**
     * Fecha en la que se realizó el pedido.
     */
    private Date fecha;

    /**
     * Constructor por defecto de la clase Pedido.
     */
    public Pedido() {
    }

    /**
     * Constructor que recibe el identificador único del pedido.
     *
     * @param idPedido El identificador único del pedido.
     */
    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Constructor que recibe todos los atributos de un pedido.
     *
     * @param idPedido       El identificador único del pedido.
     * @param codigoProducto El código del producto asociado al pedido.
     * @param unidades       La cantidad de unidades solicitadas en el pedido.
     * @param total          El total del pedido en términos de costo.
     * @param fecha          La fecha en la que se realizó el pedido.
     */
    public Pedido(int idPedido, int codigoProducto, int unidades, double total, Date fecha) {
        this.idPedido = idPedido;
        this.codigoProducto = codigoProducto;
        this.unidades = unidades;
        this.total = total;
        this.fecha = fecha;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idPedido;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pedido other = (Pedido) obj;
        if (idPedido != other.idPedido)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pedido [idPedido=" + idPedido + ", codigoProducto=" + codigoProducto + ", unidades=" + unidades
                + ", total=" + total + ", fecha=" + fecha + "]";
    }

}
