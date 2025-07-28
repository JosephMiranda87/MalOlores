/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RefuedRequest.Before;

/**
 *
 * @author USUARIO
 */
public class PerroAntes extends AnimalAntes {
    @Override
    public void volar() {
        // No aplica, los perros no vuelan
        throw new UnsupportedOperationException("Un perro no puede volar");
    }
}

// Una subclase hereda métodos o atributos que no usa, lo cual indica una mala jerarquía de herencia. 
//Viola el principio de herencia porque la subclase no es realmente un subtipo del padre.