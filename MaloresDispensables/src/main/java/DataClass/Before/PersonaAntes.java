/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClass.Before;

/**
 *
 * @author USUARIO
 */
public class PersonaAntes {
    private String nombre;
    private int edad;

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    public int getEdad() { 
        return edad; 
    }
    public void setEdad(int edad) { 
        this.edad = edad; 
    }
}

// Clases que solo tienen getters y setters, sin comportamiento, rompen encapsulamiento y hacen que otros objetos dependan directamente de su estructura interna.

