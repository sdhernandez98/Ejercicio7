/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo;

/**
 *
 * @author XPG
 */
public class Sala {
    
    private int cuadro ;
    private int escultura ;
    private int objetos ;   

    public Sala(int cuadro, int escultura, int objetos) {
        this.cuadro = cuadro;
        this.escultura = escultura;
        this.objetos = objetos;
    }

    /**
     * @return the cuadro
     */
    public int getCuadro() {
        return cuadro;
    }

    /**
     * @param cuadro the cuadro to set
     */
    public void setCuadro(int cuadro) {
        this.cuadro = cuadro;
    }

    /**
     * @return the escultura
     */
    public int getEscultura() {
        return escultura;
    }

    /**
     * @param escultura the escultura to set
     */
    public void setEscultura(int escultura) {
        this.escultura = escultura;
    }

    /**
     * @return the objetos
     */
    public int getObjetos() {
        return objetos;
    }

    /**
     * @param objetos the objetos to set
     */
    public void setObjetos(int objetos) {
        this.objetos = objetos;
    }
    
    public void consultarNumCuadros () {
        
    }
    
    public void consultarNumEsculturas () {
        
    }
    
    public void consultarNumObjetos () {
        
    }
    
}
