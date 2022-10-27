/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo;

/**
 *
 * @author XPG
 */
public class ObjetoCatalogo {
   private String autor;
   private int periodo;
   private int valorEconomico;
   private int fecCreacion;
   private int fecMuseo;

    public ObjetoCatalogo(String autor, int periodo, int valorEconomico, int fecCreacion, int fecMuseo) {
        this.autor = autor;
        this.periodo = periodo;
        this.valorEconomico = valorEconomico;
        this.fecCreacion = fecCreacion;
        this.fecMuseo = fecMuseo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the periodo
     */
    public int getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the valorEconomico
     */
    public int getValorEconomico() {
        return valorEconomico;
    }

    /**
     * @param valorEconomico the valorEconomico to set
     */
    public void setValorEconomico(int valorEconomico) {
        this.valorEconomico = valorEconomico;
    }

    /**
     * @return the fecCreacion
     */
    public int getFecCreacion() {
        return fecCreacion;
    }

    /**
     * @param fecCreacion the fecCreacion to set
     */
    public void setFecCreacion(int fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    /**
     * @return the fecMuseo
     */
    public int getFecMuseo() {
        return fecMuseo;
    }

    /**
     * @param fecMuseo the fecMuseo to set
     */
    public void setFecMuseo(int fecMuseo) {
        this.fecMuseo = fecMuseo;
    }
  
}
