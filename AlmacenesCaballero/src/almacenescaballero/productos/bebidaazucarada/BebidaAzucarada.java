/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenescaballero.productos.bebidaazucarada;

import almacenescaballero.productos.Producto;

/**
 *
 * @author José
 */
public class BebidaAzucarada extends Producto {

    private int porcentajeAzucar;
    private boolean promocion;

    /**
     * Constructor de la clase BebidaAzucarada contiene los atributos propios de
     * la clase como los heredados de la superclase Producto.
     *
     * @param precio precio del producto.
     * @param cantidadLitros cantidad en litros.
     * @param marca marca del producto.
     * @param porcentajeAzucar cantidad de azucar que tiene la bebida por
     * porcentaje.
     * @param promocion comprobante de si la bebida azucarada tiene o no
     * promocion.
     */
    public BebidaAzucarada(double precio, int cantidadLitros, String marca, double porcentajeAzucar, boolean promocion) {
        super(cantidadLitros, precio, marca);
        this.porcentajeAzucar = (int) porcentajeAzucar;
        this.promocion = promocion;
    }

    public int getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(int porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    /**
     * Método que devuelve si tiene o no promocion y si el producto tiene
     * promocion.
     *
     * @return devuelvela el precio con el 20% si es true y si es false devuelve
     * 0 indicando que no hay promocion.
     */
    public double isPromocion() {
        if (promocion = true) {
            return getPrecio() * 0.20;
        }
        return 0;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BebidaAzucarada other = (BebidaAzucarada) obj;
        if (this.porcentajeAzucar != other.porcentajeAzucar) {
            return false;
        }
        return this.promocion == other.promocion;
    }

    /**
     * Método toString que devuelve una cadena de texto formateada.
     *
     * @return devuelve una cadena de texto formateada compuesta de los
     * atributos de la clase y los heredados de la superclase Producto.
     */
    @Override
    public String toString() {
        return String.format("%-14s porcentajeAzucar:%d,promocion:%s ",
                super.toString(), this.porcentajeAzucar,
                this.promocion);
    }

}
