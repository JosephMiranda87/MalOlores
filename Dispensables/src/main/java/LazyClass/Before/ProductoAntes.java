/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyClass.Before;

/**
 *
 * @author USUARIO
 */
public class ProductoAntes {
    private String nombre;
    private DescripcionAntes descripcion;

    public ProductoAntes(String nombre, DescripcionAntes descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void imprimir() {
        System.out.println(nombre + ": " + descripcion.getTexto());
    }
}

// Una Lazy Class es una clase que no hace lo suficiente para justificar su existencia, pero se mantiene en el código por si acaso