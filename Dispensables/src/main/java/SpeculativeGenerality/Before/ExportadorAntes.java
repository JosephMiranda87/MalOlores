/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SpeculativeGenerality.Before;

/**
 *
 * @author USUARIO
 */
public abstract class ExportadorAntes {
    public abstract void exportar();


public class ExportadorPDF extends ExportadorAntes {
    public void exportar() {
        System.out.println("Exportando a PDF...");
    }
}

}
// Solo se usa ExportadorPDF en toda la app
// Código que fue escrito para un posible futuro uso, pero actualmente no se necesita (por ejemplo, clases abstractas sin necesidad real).