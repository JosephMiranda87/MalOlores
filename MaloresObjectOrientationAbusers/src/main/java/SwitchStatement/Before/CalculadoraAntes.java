/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwitchStatement.Before;

/**
 *
 * @author USUARIO
 */
public class CalculadoraAntes {
    public double calcular(String operacion, double a, double b) {
        switch (operacion) {
            case "suma":
                return a + b;
            case "resta":
                return a - b;
            case "multiplica":
                return a * b;
            case "divide":
                return a / b;
            default:
                throw new IllegalArgumentException("Operación desconocida");
        }
    }

}


// Un switch con muchos casos que realizan lógica diferente según un tipo puede ser una señal de que deberías usar polimorfismo.