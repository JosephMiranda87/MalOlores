/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiddleMan.Before;

/**
 *
 * @author USUARIO
 */
public class Orden {
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }
}

// Acceso desde el exterior:
// .getCliente().getNombre();
// orden.getCliente().getCorreo();
// orden.getCliente().getTelefono();