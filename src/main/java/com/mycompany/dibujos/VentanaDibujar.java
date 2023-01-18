/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dibujos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kristina
 */
public class VentanaDibujar extends JFrame implements ActionListener {

    public PanelPaint2 panelPaint;
    private JPanel panelPrincipal;
    

    public VentanaDibujar() {
        this.setSize(1000, 600);
        this.setLocation(100, 100);
        this.setTitle("Paint 1.0");
        this.panelPaint = new PanelPaint2();
        this.panelPaint.setBackground(Color.white);

        this.panelPrincipal = new JPanel(new BorderLayout());
        this.panelPrincipal.add(this.panelPaint, BorderLayout.CENTER);
        this.setContentPane(this.panelPrincipal);
       
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new VentanaDibujar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

}
