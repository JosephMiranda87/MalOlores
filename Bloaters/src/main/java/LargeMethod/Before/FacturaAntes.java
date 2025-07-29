/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LargeMethod.Before;

/**
 *
 * @author USUARIO
 */
public class FacturaAntes {
    public void generarFactura() {
        System.out.println("Inicio de la factura");
        System.out.println("Producto A - $10");
        System.out.println("Producto B - $15");
        System.out.println("Subtotal: $25");
        System.out.println("IVA: $3");
        System.out.println("Total: $28");
        System.out.println("Fin de la factura");
    }
}

// Un método que realiza muchas cosas, lo que dificulta su comprensión, pruebas y reutilización.