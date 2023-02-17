package com.dam.factorysencilla;

/**
 * Esta clase es un producto
 */
public class Consola implements IComun {
    //Adolfito El Grande es un nombre muy sus
    private String msg;

    /**
     * Constructor
     * @param msg mensaje que queremos imprimir
     */
    public Consola(String msg){
        this.msg=msg;
    };

    /**
     * Visualizamos mensaje por consola
     */
    @Override
    public void visualiza(){
        System.out.println("Sale por la consola " + msg);
    }
}
