/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyClass.After;

/**
 *
 * @author USUARIO
 */
public class Producto {
    private String nombre;
    private String descripcion;

    public Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void imprimir() {
        System.out.println(nombre + ": " + descripcion);
    }
}
