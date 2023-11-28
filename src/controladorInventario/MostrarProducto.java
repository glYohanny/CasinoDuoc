/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorInventario;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
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

    public MostrarProducto() {
    }

    public void mostrar(JTable tabla, String buscar, String busca) {
        String WHERE = buscar;
        String letra;
        if (!"Item no selcionar".equals(busca)) {
            if ("Bebida".equals(busca)){
            letra = "'B'";
            WHERE = "WHERE clase = "+letra;
            }else{            
            letra = "'C'";
            WHERE = "WHERE clase = "+letra;}

        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.conexionBD();
            String sql = "SELECT idproducto,nombre,concat('$',precio),cantidad,clase FROM producto.producto " + WHERE;
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
}
