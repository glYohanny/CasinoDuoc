/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaInventario;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import conexionBaseDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import conexionBaseDeDatos.Conexion;
import controladorInventario.EliminarProducto;
import controladorInventario.InsertarProducto;
import controladorInventario.MostrarProducto;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modeloInventario.Bebidas;
import modeloInventario.Comida;
import modeloInventario.Producto;

/**
 *
 * @author pedro
 */
public class PagPrincipal extends javax.swing.JFrame {

    InsertarProducto insert = new InsertarProducto();
    MostrarProducto wach = new MostrarProducto();
    DefaultTableModel modelo = new DefaultTableModel();
    Object[] producto = new Object[5];
    EliminarProducto delet = new EliminarProducto();

    public PagPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        agregarP = new javax.swing.JButton();
        eliminarP = new javax.swing.JButton();
        mostrarP = new javax.swing.JButton();
        modificarP = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelAgregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreProducto = new javax.swing.JTextField();
        precioProducto = new javax.swing.JTextField();
        cantidadProducto = new javax.swing.JTextField();
        imagenProducto = new javax.swing.JTextField();
        agregarProducto = new javax.swing.JButton();
        limpiarBotones = new javax.swing.JButton();
        agregado = new javax.swing.JLabel();
        categoriaBox = new javax.swing.JComboBox<>();
        PanelMostrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        mostrarBotom = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        recargar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        Clase = new javax.swing.JComboBox<>();
        PanelEliminar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        eliminarProducto = new javax.swing.JTextField();
        confirmacionEl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PanelModificar = new javax.swing.JPanel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(0, 0, 153));
        jPanel5.setPreferredSize(new java.awt.Dimension(850, 75));

        agregarP.setBackground(new java.awt.Color(218, 160, 47));
        agregarP.setText("AGREGAR PRODUCTO");
        agregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPActionPerformed(evt);
            }
        });

        eliminarP.setText("ELIMINAR PRODUCTOS");
        eliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPActionPerformed(evt);
            }
        });

        mostrarP.setBackground(new java.awt.Color(192, 157, 33));
        mostrarP.setText("MOSTRAR PRODUCTOS");
        mostrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPActionPerformed(evt);
            }
        });

        modificarP.setText("MODIFICAR PRODUCTOS");
        modificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(agregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarP, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(eliminarP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(agregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(modificarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelAgregar.setBackground(new java.awt.Color(255, 153, 0));
        PanelAgregar.setPreferredSize(new java.awt.Dimension(850, 970));

        jLabel2.setText("Ingrese la categoría del producto");

        jLabel3.setText("Ingrese el nombre del producto");

        jLabel4.setText("Ingrese el precio del producto");

        jLabel5.setText("Ingrese la cantidad del producto");

        jLabel6.setText("Ingrese la imagen del producto");

        nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProductoActionPerformed(evt);
            }
        });

        precioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioProductoActionPerformed(evt);
            }
        });

        cantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductoActionPerformed(evt);
            }
        });

        imagenProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenProductoActionPerformed(evt);
            }
        });

        agregarProducto.setText("Agregar");
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });

        limpiarBotones.setText("Limpiar");
        limpiarBotones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBotonesActionPerformed(evt);
            }
        });

        categoriaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebida", "Comida" }));
        categoriaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAgregarLayout.createSequentialGroup()
                                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                                            .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3))
                                            .addGap(18, 18, 18))
                                        .addGroup(PanelAgregarLayout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(14, 14, 14)))
                                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(20, 20, 20)))
                                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cantidadProducto)
                                    .addComponent(nombreProducto)
                                    .addComponent(precioProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(imagenProducto))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(agregado, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(limpiarBotones)
                        .addGap(405, 405, 405)
                        .addComponent(agregarProducto)))
                .addGap(87, 87, 87))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(agregado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(imagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarBotones)
                    .addComponent(agregarProducto))
                .addContainerGap(641, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", PanelAgregar);

        PanelMostrar.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setText("ID PRODUCTO");

        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });

        mostrarBotom.setText("Mostrar");
        mostrarBotom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBotomActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");

        recargar.setText("Recargar");
        recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recargarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idProducto", "nombre", "precio", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        Clase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item no selcionar", "Bebida", "Comida" }));

        javax.swing.GroupLayout PanelMostrarLayout = new javax.swing.GroupLayout(PanelMostrar);
        PanelMostrar.setLayout(PanelMostrarLayout);
        PanelMostrarLayout.setHorizontalGroup(
            PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrarLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(eliminar)
                .addGap(733, 733, 733)
                .addComponent(recargar)
                .addGap(39, 39, 39)
                .addComponent(mostrarBotom)
                .addGap(0, 166, Short.MAX_VALUE))
            .addGroup(PanelMostrarLayout.createSequentialGroup()
                .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMostrarLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(Clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMostrarLayout.setVerticalGroup(
            PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(recargar)
                    .addComponent(mostrarBotom)
                    .addComponent(eliminar))
                .addGap(120, 120, 120))
        );

        jTabbedPane1.addTab("tab2", PanelMostrar);

        PanelEliminar.setBackground(new java.awt.Color(255, 153, 0));

        jLabel7.setText("ID PRODUCTO A ELIMINAR");

        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout PanelEliminarLayout = new javax.swing.GroupLayout(PanelEliminar);
        PanelEliminar.setLayout(PanelEliminarLayout);
        PanelEliminarLayout.setHorizontalGroup(
            PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminarLayout.createSequentialGroup()
                .addGroup(PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(confirmacionEl, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        PanelEliminarLayout.setVerticalGroup(
            PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminarLayout.createSequentialGroup()
                .addGroup(PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(eliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(confirmacionEl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(528, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", PanelEliminar);

        javax.swing.GroupLayout PanelModificarLayout = new javax.swing.GroupLayout(PanelModificar);
        PanelModificar.setLayout(PanelModificarLayout);
        PanelModificarLayout.setHorizontalGroup(
            PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1308, Short.MAX_VALUE)
        );
        PanelModificarLayout.setVerticalGroup(
            PanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", PanelModificar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1308, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 976, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_mostrarPActionPerformed

    private void eliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_eliminarPActionPerformed

    private void agregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_agregarPActionPerformed

    private void modificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_modificarPActionPerformed

    private void nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProductoActionPerformed

    private void precioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioProductoActionPerformed

    private void cantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProductoActionPerformed

    private void imagenProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagenProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagenProductoActionPerformed

    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoActionPerformed
        Producto nProductoC = new Comida();
        Producto nProductoB = new Bebidas();
        String categoria = categoriaBox.getSelectedItem().toString();
        String nombre = nombreProducto.getText().toUpperCase();

        int precio = Integer.parseInt(precioProducto.getText());
        int cantidad = Integer.parseInt(cantidadProducto.getText());

        if (categoria.equals("Bebida")) {

            nProductoB.NuevoProducto(nombre, precio, cantidad);

        } else if (categoria.equals("Comida")) {
            nProductoC.NuevoProducto(nombre, precio, cantidad);
        }

        if (!categoria.equals("") && !nombre.equals("") && !precioProducto.getText().equals("") && !cantidadProducto.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "El elemento a sido agregado exitosamente");

        } else {
            JOptionPane.showMessageDialog(null, "El elemento a sido agregado exitosamente");
        }

    }//GEN-LAST:event_agregarProductoActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed

    }//GEN-LAST:event_idtxtActionPerformed

    private void mostrarBotomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBotomActionPerformed
        String idt = idtxt.getText();
        String cat = this.Clase.getSelectedItem().toString();
        wach.mostrar(jTable2, idt,cat);
    }//GEN-LAST:event_mostrarBotomActionPerformed

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_eliminarProductoActionPerformed

    private void limpiarBotonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBotonesActionPerformed
        nombreProducto.setText("");
        precioProducto.setText("");
        cantidadProducto.setText("");


    }//GEN-LAST:event_limpiarBotonesActionPerformed

    private void categoriaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaBoxActionPerformed
        String categoria = categoriaBox.getSelectedItem().toString();
    }//GEN-LAST:event_categoriaBoxActionPerformed

    private void recargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recargarActionPerformed

    }//GEN-LAST:event_recargarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int idInt = Integer.parseInt(idtxt.getText());
        delet.EliminarProducto(idInt);
        JOptionPane.showMessageDialog(null, "EL elemento a sido eliminado correctamente");
    }//GEN-LAST:event_eliminarActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Clase;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel PanelModificar;
    private javax.swing.JPanel PanelMostrar;
    private javax.swing.JLabel agregado;
    private javax.swing.JButton agregarP;
    private javax.swing.JButton agregarProducto;
    private javax.swing.JTextField cantidadProducto;
    private javax.swing.JComboBox<String> categoriaBox;
    private javax.swing.JLabel confirmacionEl;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminarP;
    private javax.swing.JTextField eliminarProducto;
    private javax.swing.JTextField idtxt;
    private javax.swing.JTextField imagenProducto;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton limpiarBotones;
    private javax.swing.JButton modificarP;
    private javax.swing.JButton mostrarBotom;
    private javax.swing.JButton mostrarP;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JButton recargar;
    // End of variables declaration//GEN-END:variables
}
