

package com.mycompany.acertijo;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author ASUS
 */
public class Acertijo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola soy un JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu acertijoMenu = new JMenu("Acertijo");
        JMenuItem resolverItem = new JMenuItem("Resolver");

        resolverItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String respuesta = JOptionPane.showInputDialog(frame, "Escriba el método principal utilizado para crear una ventana personalizada en un Java Swing (recuerde incluír parentesis al final)");
                if (respuesta != null && respuesta.equalsIgnoreCase("JFrame()") || respuesta.equalsIgnoreCase("jframe()") || respuesta.equalsIgnoreCase("JFRAME()") ) {
                    JOptionPane.showMessageDialog(frame, "¡Respuesta correcta! ¡Sigue avanzando!");
                    
                    Fase2 fase2Frame = new Fase2();
                    fase2Frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frame, "Respuesta incorrecta. Inténtalo de nuevo.");
                }
            }
        });

        acertijoMenu.add(resolverItem);
        menuBar.add(acertijoMenu);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JButton resolverButton1 = new JButton("Resolver aquí");
        JButton resolverButton2 = new JButton("Mejor resolver aquí");
        JButton resolverButton3 = new JButton("Aquí se resuelve más fácil");
        JButton resolverButton4 = new JButton("Aquí no hay truco");
        JButton resolverButton5 = new JButton("Motivación");
        JButton resolverButton6 = new JButton("¿Nesitas ayuda?");
        JButton resolverButton7 = new JButton("¿Te rindes?");

        resolverButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Aquí no se resuelve, en el otro botón sí");
            }
        });

        resolverButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hoy no resuelvo, mañana si ;)");
            }
        });
        
            resolverButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Creo que no era tan fácil despues de todo");
            }
        });
        
            resolverButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Consejo: no creas todo lo que aparece en internet :)");
            }
        });
            
            resolverButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "¿En verdad esperabas que un programa te diera afecto?");
            }
        });
            
            resolverButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "¿Que si quiero ayudarte? Mejor duplícaselo y daselo a la siguiente persona");
            }
        });
            
            resolverButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Pista: Resuelve el... ¿Acertijo?");
            }
        });
        frame.add(resolverButton1);
        frame.add(resolverButton2);
        frame.add(resolverButton3);
        frame.add(resolverButton4);
        frame.add(resolverButton5);
        frame.add(resolverButton6);
        frame.add(resolverButton7);
        frame.setVisible(true);
    }
}