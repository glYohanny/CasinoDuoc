/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorInventario;

import conexionBaseDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class MostrarProducto extends Registro {
    
    Conexion conex = new Conexion();
    Connection con = conex.conexionBD();
    String listaSql = "select*from producto.producto";
    PreparedStatement preparar = null;

    public MostrarProducto() {
    }
    
    
    
    public void mostrar() {
        try {
            preparar = con.prepareStatement(listaSql);
            ResultSet set = preparar.executeQuery();
            while (set.next()) {
                System.out.println(set.getString(1));
                System.out.println(set.getString(2));
                System.out.println(set.getString(3));
                System.out.println(set.getString(4));
                System.out.println(set.getString(5));
            }
            preparar.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    
}
