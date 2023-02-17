package com.dam.factorysencilla;

import javax.swing.JOptionPane;

/**
 * Esta clase es un producto
 */
public class Ventana implements IComun {
    private String msg;

    /**
     * Constructor
     * @param msg mensaje que queremos imprimir
     */
    public Ventana(String msg) {
        this.msg = msg;
    }

    /**
     * Visualizamos mensaje por consola
     */
    @Override
    public void visualiza(){
        JOptionPane.showMessageDialog(null,"Sale por un ventana " + msg);
    }
}
