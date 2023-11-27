/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controladorInventario;

/**
 *
 * @author pedro
 */
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      InsertarProducto insert=new InsertarProducto();
      ModificarProducto modify=new ModificarProducto();
      EliminarProducto delet=new EliminarProducto();
      MostrarProducto show=new MostrarProducto();
      
      
        delet.EliminarProducto(14);
    }
    
}
