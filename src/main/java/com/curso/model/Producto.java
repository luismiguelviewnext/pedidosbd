package com.curso.model;

/**
 * Clase que representa un producto en el sistema.
 */
public class Producto {

    /**
     * Código único del producto.
     */
    private int codigoProducto;
    /**
     * Nombre del producto.
     */
    private String nombreProducto;
    /**
     * Precio unitario del producto.
     */
    private double precioUnitario;
    /**
     * Stock disponible del producto.
     */
    private int stock;

    /**
     * Constructor por defecto de la clase Producto.
     */
    public Producto() {
        super();

    }

    /**
     * Constructor que recibe el código único del producto.
     *
     * @param codigoProducto El código único del producto.
     */
    public Producto(int codigoProducto) {
        super();
        this.codigoProducto = codigoProducto;
    }

    /**
     * Constructor que recibe todos los atributos de un producto.
     *
     * @param codigoProducto El código único del producto.
     * @param nombreProducto El nombre del producto.
     * @param precioUnitario El precio unitario del producto.
     * @param stock          El stock disponible del producto.
     */
    public Producto(int codigoProducto, String nombreProducto, double precioUnitario, int stock) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.stock = stock;

    }

    /**
     * Obtiene el código único del producto.
     *
     * @return El código único del producto.
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Establece el código único del producto.
     *
     * @param codigoProducto El código único del producto.
     */
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombreProducto El nombre del producto.
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * Obtiene el precio unitario del producto.
     *
     * @return El precio unitario del producto.
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Establece el precio unitario del producto.
     *
     * @param precioUnitario El precio unitario del producto.
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Obtiene el stock disponible del producto.
     *
     * @return El stock disponible del producto.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock disponible del producto.
     *
     * @param stock El stock disponible del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoProducto;
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
        Producto other = (Producto) obj;
        if (codigoProducto != other.codigoProducto)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Producto [codigoProducto=" + codigoProducto + ", producto=" + nombreProducto + ", precioUnitario="
                + precioUnitario + ", stock=" + stock + "]";
    }

}
