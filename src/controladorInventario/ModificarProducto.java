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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class ModificarProducto {

    public void TablaModificar(JTable tabla) {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.conexionBD();
            String sql = "SELECT idproducto,nombre,concat('$',precio),cantidad,clase FROM producto.producto ";
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            java.sql.ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("idProducto");
            modelo.addColumn("nombre");
            modelo.addColumn("precio");
            modelo.addColumn("cantidad");
            modelo.addColumn("clase");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.out.println("Error al conectar a la base de datos: " + ex.getMessage());

        }

    }

    public void ModificarBD(int a,String b,int c,int d,String e) {
        try {
            Conexion conex = new Conexion();
            Connection con = conex.conexionBD();
            String modificarSql = "update producto.producto set nombre=?,precio=?, cantidad=?,clase=? where idproducto= "+a;
            PreparedStatement preparar = null;
            
            preparar = con.prepareStatement(modificarSql);
            
            preparar.setString(1, b);
            preparar.setInt(2, c);
            preparar.setInt(3, d);
            preparar.setString(4, e);
            preparar.executeUpdate();
            preparar.close();
            con.close();
            System.out.println("nice");
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }

}
