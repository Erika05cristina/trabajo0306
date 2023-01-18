/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dibujos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kristina
 */
public class PanelPaint2 extends JPanel implements MouseListener {

    private int x1 = 0;
    private int y1 = 0;
    int altura;
    int ancho;
    String figura;
    String color;
    private Color colorLinea = Color.BLACK;

    public PanelPaint2() {
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(280, 20, 40, 40);
        g.drawLine(200, 100, 400, 110);
        
        switch (figura) {
            case "Círculo":
                switch (color) {
                    case "rojo":
                        g.setColor(Color.red);
                        break;
                    case "azul":
                        g.setColor(Color.BLUE);
                        break;
                    case "amarillo":
                        g.setColor(Color.yellow);
                        break;
                    case "verde":
                        g.setColor(Color.green);
                        break;
                }

                g.drawOval(x1, y1, ancho, ancho);
                break;
            case "Cuadrado":

                switch (color) {
                    case "rojo":
                        g.setColor(Color.red);
                        break;
                    case "azul":
                        g.setColor(Color.BLUE);
                        break;
                    case "amarillo":
                        g.setColor(Color.yellow);
                        break;
                    case "verde":
                        g.setColor(Color.green);
                        break;
                }

                g.drawRect(x1, y1, ancho, ancho);
                break;

            case "Rectángulo":
                switch (color) {
                    case "rojo":
                        g.setColor(Color.red);
                        break;
                    case "azul":
                        g.setColor(Color.BLUE);
                        break;
                    case "amarillo":
                        g.setColor(Color.yellow);
                        break;
                    case "verde":
                        g.setColor(Color.green);
                        break;
                }

                g.drawRect(x1, y1, ancho, altura);
                break;
            case "Triángulo":
                switch (color) {
                    case "rojo":
                        g.setColor(Color.red);
                        break;
                    case "azul":
                        g.setColor(Color.BLUE);
                        break;
                    case "amarillo":
                        g.setColor(Color.yellow);
                        break;
                    case "verde":
                        g.setColor(Color.green);
                        break;
                }
                int[] puntosX = new int[3];
                puntosX[0] = x1;
                puntosX[1] = x1 - (ancho / 2);
                puntosX[2] = x1 + (ancho / 2);

                int[] puntosY = new int[3];
                puntosX[0] = y1;
                puntosX[1] = x1 + altura;
                puntosX[2] = x1 + altura;

                g.drawPolygon(puntosX, puntosY, 3);

                break;/*
            case "Estrella":;
                break;*/

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        this.x1 = e.getX();
        this.y1 = e.getY();
       
        super.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //   JOptionPane.showMessageDialog(this, e.getPoint());

      

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

}
