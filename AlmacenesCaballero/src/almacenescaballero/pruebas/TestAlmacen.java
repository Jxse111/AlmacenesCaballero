/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class_1.java to edit this template
 */
package almacenescaballero.pruebas;

/**
 *
 * @author José
 */
import almacenescaballero.productos.Producto;
import almacenescaballero.productos.aguamineral.AguaMineral;
import almacenescaballero.productos.almacen.Almacen;
import almacenescaballero.productos.bebidaazucarada.BebidaAzucarada;
import java.util.Scanner;

public class TestAlmacen {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        // Variables de salida
        Almacen almacen = new Almacen();
        Producto p1 = new Producto(2, 1.50, "Puleva");
        Producto p2 = new AguaMineral(1.30, 1, "Font vella", "Manantial Sacalm");
        Producto p3 = new BebidaAzucarada(1.80, 1, "Monster", 15, false);

        // Variables auxiliares
        //para calculos intermedios
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA EJEMPLO");
        System.out.println("----------------------");
        System.out.println(" ");

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        System.out.println("Almaceno el producto 1 que es Batido Puleva con "
                + p1.toString());
        almacen.agregarProducto(p1);
        System.out.println("Almaceno el producto 2 que es Botella Agua Font Vella con "
                + p2.toString());
        System.out.println();
        almacen.agregarProducto(p2);
        almacen.calcularPrecio();
        System.out.println("Elimino el producto con id 2 que es Botella Agua Font vella con "
                + p2.toString());
        almacen.eliminarProducto(2);
        System.out.println();
        System.out.println("Almaceno el producto 3 que es Monster Energy con "
                + p3.toString());
        almacen.agregarProducto(p3);

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

    }
}
