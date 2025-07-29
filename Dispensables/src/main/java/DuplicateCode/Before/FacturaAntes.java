/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuplicateCode.Before;

/**
 *
 * @author USUARIO
 */
public class FacturaAntes {
    public void imprimirFactura(Cliente cliente) {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Teléfono: " + cliente.getTelefono());
    }
}
