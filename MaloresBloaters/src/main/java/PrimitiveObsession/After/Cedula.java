/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimitiveObsession.After;

/**
 *
 * @author USUARIO
 */
public class Cedula {
    private String valor;

    public Cedula(String valor) {
        if (!valor.matches("\\d{10}")) {
            throw new IllegalArgumentException("Cédula inválida");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}