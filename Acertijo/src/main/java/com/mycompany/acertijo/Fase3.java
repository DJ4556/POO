/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acertijo;

/**
 *
 * @author ASUS
 */
import javax.swing.*;

public class Fase3 extends JFrame {
    public Fase3() {
        setTitle("Fase 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        // Agrega aquí los componentes y la lógica de tu Fase 3
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Fase3().setVisible(true);
            }
        });
    }
}

