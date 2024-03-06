/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenescaballero.productos.almacen;

import almacenescaballero.productos.Producto;

/**
 *
 * @author José
 */
public class Almacen {

    private Producto[] productos;

    /**
     * Constructor sin parámetros que instancia un array de productos.
     */
    public Almacen() {
        this.productos = new Producto[500];
    }

    /**
     * Método que agrega un producto a nuestro array de productos.
     *
     * @param p el producto pasado por parametros
     * @return devuelve si ha sido encontrado o no para que salga del bucle.
     */
    public boolean agregarProducto(Producto p) {
        boolean encontrado = false;
        for (int i = 0; i < productos.length && encontrado; i++) {
            if (productos[i] == null) {
                productos[i] = p;
            }
        }
        return encontrado;
    }

    /**
     * Método que elimina un producto.
     *
     * @param id del producto.
     */
    public void eliminarProducto(int id) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && id == productos[i].getId()) {
                productos[i] = null;
            }
        }
    }

    /**
     * Método que muestra la informacion del producto almacenado.
     */
    public void mostrarInformacion() {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                System.out.println(productos[i]);
            }
        }
    }

    /**
     * Método que calcula el precio total de cada producto.
     *
     * @return el precio total de cada producto.
     */
    public double calcularPrecio() {
        double precioTotal = 0.0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                precioTotal += productos[i].getPrecio();
            }

        }
        return precioTotal;
    }

}
