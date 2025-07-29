/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InappropriateIntimacy.Before;

/**
 *
 * @author USUARIO
 */
public class BancoAntes {
    public void transferir(Cuenta origen, Cuenta destino, double monto) {
        origen.saldo -= monto;
        destino.saldo += monto;
    }
}


// Clases que acceden frecuentemente a los detalles internos de otras clases, lo que crea un fuerte acoplamiento.