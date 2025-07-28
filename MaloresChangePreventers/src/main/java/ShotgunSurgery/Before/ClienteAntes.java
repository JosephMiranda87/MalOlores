/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShotgunSurgery.Before;

/**
 *
 * @author USUARIO
 */
public class ClienteAntes {
    public String nombre;
    public String direccion;
    public void imprimir() {
        System.out.println(nombre + ", " + direccion);
    }
}

// Cuando se necesita hacer un cambio en el sistema y tienes que tocar muchas clases o módulos pequeños para hacerlo. Esto aumenta el riesgo de errores y el costo de mantenimiento.
// Si decides cambiar la estructura de Cliente, debes actualizar muchas clases.
