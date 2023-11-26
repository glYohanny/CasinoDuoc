/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeloInventario;

/**
 *
 * @author pedro
 */
public class nose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Comida();
        Producto producto1= new Bebidas();
        Inventario list=new Inventario();
        list.agregarLista(producto1.NuevoProducto("bala", 0, 0));
        list.agregarLista(producto.NuevoProducto("mela", 0, 0));
        list.mostrarLista();
    }
    
}
