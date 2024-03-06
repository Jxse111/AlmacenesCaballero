/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenescaballero.productos;

import java.util.Objects;

/**
 *
 * @author José
 */
public class Producto {

    private int id;
    private int identificador = 1;
    private int cantidadLitros;
    private double precio;
    private String marca;

    /**
     * Constructos con 4 parametros , que son los atributos que se inicializan
     * en el construcotr.
     *
     * @param cantidadLitros cantidad de litros del producto.
     * @param precio precio del producto.
     * @param marca marca del producto.
     */
    public Producto(int cantidadLitros, double precio, String marca) {
        this.id = identificador;
        identificador++;
        this.cantidadLitros = cantidadLitros;
        this.precio = precio;
        this.marca = marca;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadLitros() {
        return this.cantidadLitros;
    }

    public void setCantidadLitros(int cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
        final Producto other = (Producto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.cantidadLitros != other.cantidadLitros) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        return Objects.equals(this.marca, other.marca);
    }

    /**
     * Método toString que devuelve una cadena de texto formateada.
     *
     * @return devuelve una cadena de texto formateada compuesta de los
     * atributos de la clase.
     */
    @Override
    public String toString() {
        return String.format("id:%d,cantidad:%dL,precio:%.2f€,marca:%s",
                this.id, this.cantidadLitros, this.precio,
                this.marca);
    }

}
