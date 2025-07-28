/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MessageChains.After;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    private Cliente cliente;
    public String obtenerCiudadCliente() {
        return cliente.obtenerCiudad();
    }
}
