/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LazyClass.Before;

/**
 *
 * @author USUARIO
 */
public class DescripcionAntes {
    private String texto;

    public DescripcionAntes(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

// Una Lazy Class es una clase que no hace lo suficiente para justificar su existencia, pero se mantiene en el código por si acaso