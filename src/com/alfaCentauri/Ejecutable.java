package com.alfaCentauri;

import java.awt.*;

public class Ejecutable extends javax.swing.JFrame {

    private javax.swing.JPanel Panel;

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
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graficas");

        Panel.setBackground(new java.awt.Color(106, 93, 69));
    }

    /***/
    public static void main(String []args) {
        System.out.println("Ejemplos de Java 3D.");
    }
}
