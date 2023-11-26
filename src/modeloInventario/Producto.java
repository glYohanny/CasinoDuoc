/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloInventario;

/**
 *
 * @author pedro
 */
public abstract class Producto {

    protected String nombreProducto;
    protected int precioProducto;
    protected int cantidaProducto;
    protected String tipoProducto;

    public Producto() {
    }

    public Producto(String nombreProducto, int precioProducto, int cantidaProducto, String tipoProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidaProducto = cantidaProducto;
        this.tipoProducto = tipoProducto;
    }
    

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidaProducto() {
        return cantidaProducto;
    }

    public void setCantidaProducto(int cantidaProducto) {
        this.cantidaProducto = cantidaProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public abstract Producto NuevoProducto(String nom,int pre,int cant);
    
    
    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", cantidaProducto=" + cantidaProducto + ", tipoProducto=" + tipoProducto + '}';
    }
 
}
