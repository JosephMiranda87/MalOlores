/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IncompleteLibraryClass.Before;

/**
 *
 * @author USUARIO
 */
public class UtilidadFechaAntes {
    public static boolean esBisiesto(FechaAntees fecha) {
        int anio = fecha.getAnio();
        return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0);
    }
}


// Una clase de librería que no ofrece suficiente funcionalidad y que te obliga a escribir mucho código externo para hacer tareas básicas que podrían estar en la clase misma.