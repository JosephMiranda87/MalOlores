/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InappropriateIntimacy.After;
import InappropriateIntimacy.Before.Cuenta;
/**
 *
 * @author USUARIO
 */
public class Banco {
    public void transferir(Cuenta origen, Cuenta destino, double monto) {
        origen.retirar(monto);
        destino.depositar(monto);
    }
}
