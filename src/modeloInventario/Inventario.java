/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloInventario;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Inventario {
    
    private ArrayList<Producto> listaProducto;

    public Inventario() {
        listaProducto = new ArrayList<>();
    }

    public void agregarLista(Producto proc) {
        listaProducto.add(proc);
    }

    public void mostrarLista() {
        for (Producto temp : listaProducto) {
            System.out.println(temp);

        }
    }
    

    public void eliminarProducto(Producto prod) {
        listaProducto.remove(prod);
    }


}
