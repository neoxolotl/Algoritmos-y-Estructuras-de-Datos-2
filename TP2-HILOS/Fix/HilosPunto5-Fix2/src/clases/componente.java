/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author fsosa
 */

public class componente {
    
    private int codigo, coorX, coorY, velocidad, avance;
    private long tiempo;
    private String nombre;

    public componente(int codigo, int coorX, int coorY, long tiempo, int velocidad, String nombre) {
        this.codigo = codigo;
        this.coorX = coorX;
        this.coorY = coorY;
        this.tiempo = tiempo;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCoorX() {
        return coorX;
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
