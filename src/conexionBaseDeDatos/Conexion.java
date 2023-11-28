/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionBaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class Conexion {

    public Conexion() {
    }
    
     public Connection conexionBD() {
        String url = "jdbc:mysql://localhost:3306/producto";
        String usuario = "root";
        //String contraseña = "06Villegas#ñTorres2004";
        String contraseña = "";
        Connection conexion = null;
        try {

            conexion = DriverManager.getConnection(url, usuario, contraseña);

            if (conexion != null) {

                System.out.println("CONEXIÓN EXITOSA.");

            }

        } catch (SQLException e) {

            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    
    }
}
