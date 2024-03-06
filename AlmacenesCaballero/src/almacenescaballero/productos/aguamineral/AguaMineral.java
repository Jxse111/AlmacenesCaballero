/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenescaballero.productos.aguamineral;

import almacenescaballero.productos.Producto;
import java.util.Objects;

/**
 *
 * @author José
 */
public class AguaMineral extends Producto {

    private String origen;

    /**
     * Constructor de la clase AguaMineral contiene los atributos heredados de
     * la superclase Producto.
     *
     * @param precio precio del producto.
     * @param cantidadLitros cantidad en litros.
     * @param marca marca del producto.
     * @param origen fuente o manantial del que surge el agua mineral.
     */
    public AguaMineral(double precio, int cantidadLitros, String marca, String origen) {
        super(cantidadLitros, precio, marca);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
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
        final AguaMineral other = (AguaMineral) obj;
        return Objects.equals(this.origen, other.origen);
    }

    /**
     * Método toString que devuelve una cadena de texto formateada.
     *
     * @return devuelve una cadena de texto formateada compuesta de los
     * atributos de la clase y los heredados de la superclase Producto.
     */
    @Override
    public String toString() {
        return String.format("%-14s origen:%s", super.toString(), this.origen);
    }

}
