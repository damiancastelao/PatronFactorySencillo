package com.dam.factorysencilla;

/**
 * Calse principal que llama a la factoria
 * para crear los onjetos
 */
public class App {

    static IComun salida;
    public static void main(String[] args) {

        // salida por consola
        salida = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.CONSOLA, "Hola");
        salida.visualiza();

        // salida
        salida = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.VENTANA, "Chau");
        salida.visualiza();
    }
}
