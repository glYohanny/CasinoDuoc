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
public class EliminarProducto extends Registro {
    

    Conexion conex = new Conexion();
    Connection con = conex.conexionBD();
    String deletSql = "DELETE FROM producto where idproducto=?";
    PreparedStatement preparar = null;

    public void EliminarProducto(){
        try {
            preparar = con.prepareStatement(deletSql);
            preparar.setInt(1, 1);

            preparar.executeUpdate();
            preparar.close();
            con.close();
            System.out.println("nice");
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}
