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
public class MostrarProducto extends Registro {
    Conexion conex = new Conexion();
    Connection con = conex.conexionBD();
    String listaSql = "select*from producto.producto";
    PreparedStatement preparar = null;

    public MostrarProducto() {
    }

    public void mostrar(DefaultTableModel model,JTable tabla) {
        try {
            preparar = con.prepareStatement(listaSql);
            ResultSet set = preparar.executeQuery();
            Object [] producto=new Object[5];
            
            while (set.next()) {
                producto[0]=set.getInt(1);
                producto[1]=set.getString(2);
                producto[2]=set.getInt(3);
                producto[3]=set.getInt(4);
                producto[4]=set.getString(5);
                model.addRow(producto);
            }
            tabla.setModel(model);
            preparar.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }

}
