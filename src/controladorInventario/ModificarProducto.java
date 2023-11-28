/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorInventario;

import conexionBaseDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author pedro
 */
public class ModificarProducto extends Registro {
     

    Conexion conex = new Conexion();
    Connection con = conex.conexionBD();
    String modificarSql = "update producto set nombre=?,precio=?, cantidad=?,clase=? where idproducto=?;";
    PreparedStatement preparar = null;

    public ModificarProducto() {
        
        
    }
    
}
