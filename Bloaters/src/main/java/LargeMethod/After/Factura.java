/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LargeMethod.After;

/**
 *
 * @author USUARIO
 */
public class Factura {
    public void generarFactura() {
        imprimirCabecera();
        imprimirProductos();
        imprimirTotales();
        imprimirPie();
    }

    private void imprimirCabecera() {
        System.out.println("Inicio de la factura");
    }

    private void imprimirProductos() {
        System.out.println("Producto A - $10");
        System.out.println("Producto B - $15");
    }

    private void imprimirTotales() {
        System.out.println("Subtotal: $25");
        System.out.println("IVA: $3");
        System.out.println("Total: $28");
    }

    private void imprimirPie() {
        System.out.println("Fin de la factura");
    }
}


// Un método que realiza muchas cosas, lo que dificulta su comprensión, pruebas y reutilización.