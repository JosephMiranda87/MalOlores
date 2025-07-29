/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuplicateCode.After;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;

    // constructor + getters...

    public void imprimirInformacion() {
        System.out.println("Cliente: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }
}