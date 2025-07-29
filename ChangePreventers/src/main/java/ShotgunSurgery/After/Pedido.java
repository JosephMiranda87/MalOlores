/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShotgunSurgery.After;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    public Cliente cliente;
    public void imprimir() {
        System.out.println("Pedido de: " + cliente.getResumen());
    }
}
