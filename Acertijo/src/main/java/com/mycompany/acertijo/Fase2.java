/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acertijo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Fase2 extends JFrame {
    private JButton[] botones;
    private Random random = new Random();
    private Color[] colores = {Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW};
    private JLabel preguntaLabel;
    private JButton botonPregunta;
    private Color colorPregunta;

    public Fase2() {
        setTitle("Fase 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 3)); // Matriz 3x3

        botones = new JButton[8]; // 8 botones

        char[] nombres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        for (int i = 0; i < 8; i++) {
            botones[i] = new JButton(String.valueOf(nombres[i]));
            botones[i].setPreferredSize(new Dimension(150, 150));
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String buttonText = ((JButton) e.getSource()).getText();
                    Color botonColor = ((JButton) e.getSource()).getBackground();

                    if (buttonText.equals("G") && botonColor == Color.GREEN) {
                        // Crear un cuadro de diálogo con pregunta y cuadro de texto de respuesta
                        JTextField respuestaField = new JTextField();
                        Object[] message = {
                            "Escriba el método de la clase JOptionPane que utilizaría para mostrar un mensaje en una ventana emergente (recuerde incluír parentesis al final) ",
                            respuestaField
                        };

                        int option = JOptionPane.showConfirmDialog(
                                Fase2.this,
                                message,
                                "Pregunta",
                                JOptionPane.OK_CANCEL_OPTION
                        );

                        if (option == JOptionPane.OK_OPTION) {
                            String respuestaUsuario = respuestaField.getText();

                            if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase("showMessageDialog()") || respuestaUsuario.equalsIgnoreCase("showmessagedialog()") || respuestaUsuario.equalsIgnoreCase("SHOWMESSAGEDIALOG()")) {
                                // Mostrar una ventana emergente en blanco                              
                                JOptionPane.showMessageDialog(Fase2.this, "Respuesta correcta", "Respuesta Correcta", JOptionPane.PLAIN_MESSAGE);
                                
                                Fase3 fase3 = new Fase3();
                                fase3.setVisible(true);
                            } else {
                                // Mostrar un mensaje si la respuesta es incorrecta
                                JOptionPane.showMessageDialog(Fase2.this, "Respuesta incorrecta");
                            }
                        }
                    } else {
                        // Mostrar un mensaje "Ups, eso no era"
                        JOptionPane.showMessageDialog(Fase2.this, "Ups, eso no era");
                    }
                }
            });
            panel.add(botones[i]);
        }

        preguntaLabel = new JLabel("Seleccione el botón G cuando esté verde");
        preguntaLabel.setHorizontalAlignment(JLabel.CENTER);

        panel.add(new JLabel()); // Espacio en blanco
        panel.add(preguntaLabel);

        javax.swing.Timer timer = new javax.swing.Timer(2000, new ActionListener() { // Cambiamos a 2000 (2 segundos)
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColorBotonesAleatoriamente();
            }
        });
        timer.start();

        add(panel);
    }

    private void cambiarColorBotonesAleatoriamente() {
        for (JButton boton : botones) {
            Color colorAleatorio = colores[random.nextInt(colores.length)];
            boton.setBackground(colorAleatorio);
        }
        colorPregunta = botones[6].getBackground(); // Color del botón G
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Fase2().setVisible(true);
            }
        });
    }
}






















