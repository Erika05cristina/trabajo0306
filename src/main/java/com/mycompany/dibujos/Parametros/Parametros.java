/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dibujos.Parametros;

/**
 *
 * @author Kristina
 */
public class Parametros {
    int ancho;
    int alto;
    String color ;
    String figura;

    public Parametros(int ancho, int alto, String color, String figura) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.figura = figura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }
    
     @Override
    public String toString() {
        return "Parametros{" + "ancho=" + ancho + ", alto=" + alto + ", color=" + color + ", figura=" + figura + '}';
    }
}
