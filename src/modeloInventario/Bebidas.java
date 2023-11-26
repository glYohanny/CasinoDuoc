/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloInventario;

/**
 *
 * @author pedro
 */
public class Bebidas extends Producto {
    Inventario lista=new Inventario();
    public Bebidas() {
    }

    public Bebidas(String nombreProducto, int precioProducto, int cantidaProducto, String tipoProducto) {
        super(nombreProducto, precioProducto, cantidaProducto, tipoProducto);
    }
    @Override
    public Producto NuevoProducto(String nom,int pre,int cant) {
       Producto nBebida =new Comida(nom,pre,cant,"B");
       lista.AgregarSQL(nBebida);
       return nBebida;
    }
}
