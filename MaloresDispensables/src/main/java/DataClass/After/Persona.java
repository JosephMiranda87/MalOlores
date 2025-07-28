/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClass.After;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String obtenerSaludoFormal() {
        return "Hola, mi nombre es " + nombre + " y tengo " + edad + " años.";
    }
}
