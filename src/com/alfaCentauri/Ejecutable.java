package com.alfaCentauri;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que define el main.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class Ejecutable extends javax.swing.JFrame {

    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Etiqueta1;
    private javax.swing.JLabel Etiqueta2;

    public static final int HEIGHT = 800;
    public static final int WIDTH = 600;
    public static final String TITLE = "Ejemplo de Java 3D.";

    /**
     * Constructs a new frame that is initially invisible.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     */
    public Ejecutable() throws HeadlessException {
        initComponents();
        this.setTitle(TITLE);
    }

    /**
     * Inicio de componentes.
     **/
    private void initComponents() {
        Panel = new javax.swing.JPanel();
        Etiqueta1 = new javax.swing.JLabel();
        Etiqueta2 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graficas");
        //Panel de trabajo
        Panel.setBackground(new java.awt.Color(106, 93, 69));

        Etiqueta1.setFont(new java.awt.Font("Arial Black", 0, 12));
        Etiqueta1.setText("Valor1 =");
        Etiqueta1.setToolTipText("Valor #1.");
        Dimension tamanio = new Dimension(50, 25);
        Etiqueta1.setPreferredSize(tamanio);
        Etiqueta1.setLocation(10, 10);
        Etiqueta1.setVisible(true);
        Panel.add(Etiqueta1);

        Etiqueta2.setFont(new java.awt.Font("Arial Black", 0, 12));
        Etiqueta2.setText("Valor2 =");
        Etiqueta2.setPreferredSize(tamanio);
        Etiqueta2.setLocation(10, 40);
        Etiqueta2.setVisible(true);
        Panel.add(Etiqueta2);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(Panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(Panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-768)/2, (screenSize.height-621)/2, 768, 621);
    }

    /***/
    public static void main(String []args) {
        System.out.println("Ejemplos de Java 3D.");
        Ejecutable ventana = new Ejecutable();
        ventana.setVisible(true);
        System.out.println("Fin del ejemplo.");
    }
}
