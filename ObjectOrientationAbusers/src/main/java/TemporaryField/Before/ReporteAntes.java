/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemporaryField.Before;

/**
 *
 * @author USUARIO
 */
public class ReporteAntes {
    private String formatoExcel;
    private String formatoPDF;

    public void generarPDF(String datos) {
        formatoPDF = datos;
        // solo se usa aquí
    }

    public void generarExcel(String datos) {
        formatoExcel = datos;
        // solo se usa aquí
    }
}

// Campos de clase que solo se utilizan en casos particulares o métodos específicos. Generan confusión y dificultan el mantenimiento.
