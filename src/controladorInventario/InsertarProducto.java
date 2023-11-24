/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorInventario;

import conexionBaseDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class InsertarProducto extends Registro {
    

    Conexion conex = new Conexion();
    Connection con = conex.conexionBD();
    String insertSql = "insert into producto(nombre,precio,cantidad)values(?,?,?,?)";
    PreparedStatement preparar = null;

    public InsertarProducto() {
    }

    
    public void InsertarProducto() {
        try {
            preparar = con.prepareStatement(insertSql);
            preparar.setInt(1, 76);
            preparar.setString(2, "el gato con hojas");
            preparar.setString(3, "jose matagato");
            preparar.setInt(4, 500000);
            preparar.executeUpdate();
            preparar.close();
            con.close();
            System.out.println("nice");
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}
