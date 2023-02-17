package com.dam.factorysencilla;

/**
 * Fabrica encargada de devolver el producto
 * que elegimos según el tipo
 */
public class FactoriaDeSalidas {
    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;
    /**
     * Devuelve producto del tipo de la Interface
     * @param type 1: consola, 2:ventana
     * @param msg string a imprimir
     * @return producto segun el tipo
     */
    public static IComun getProducto(int type, String msg) {
        switch (type) {
            // tipo consola
            case CONSOLA:
                return new Consola(msg);
            // tipo ventana
            case VENTANA:
                return new Ventana(msg);
            // otro tipo
            default:
                return null;
        }
    }
}
