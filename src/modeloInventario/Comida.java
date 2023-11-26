/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloInventario;

/**
 *
 * @author pedro
 */
public class Comida extends Producto{
    Inventario lista=new Inventario();
    public Comida() {
    }

    
    public Comida(String nombreProducto, int precioProducto, int cantidaProducto, String tipoProducto) {
        super(nombreProducto, precioProducto, cantidaProducto, tipoProducto);
    }

    @Override
    public Producto NuevoProducto(String nom,int pre,int cant) {
       Comida nComida =new Comida(nom,pre,cant,"C");
       lista.AgregarSQL(nComida);
       return nComida;
    }
    
}
