/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IncompleteLibraryClass.After;

/**
 *
 * @author USUARIO
 */
public class Fecha {
    private int dia, mes, anio;

    public boolean esBisiesto() {
        return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0);
    }

}