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
    String insertSql = "insert into producto.producto(nombre,precio,cantidad,clase)values(?,?,?,?)";
    PreparedStatement preparar = null;

    public InsertarProducto() {
    }

    
    public void InsertarProducto(String nomProc,int preProc,int canProc,String clasProc) {
        try {
            preparar = con.prepareStatement(insertSql);
            preparar.setString(1, nomProc);          
            preparar.setInt(2, preProc);
             preparar.setInt(3, canProc);
             preparar.setString(4, clasProc);
             
            preparar.executeUpdate();
            preparar.close();
            con.close();
            System.out.println("nice");
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}
