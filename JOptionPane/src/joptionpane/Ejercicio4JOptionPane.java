package joptionpane;

import javax.swing.JOptionPane;

public class Ejercicio4JOptionPane {
    public static void main(String[] args) {

        String nombreCompleto = JOptionPane.showInputDialog("Por favor, ingresa tu nombre completo:");

        if (nombreCompleto.startsWith("A") || nombreCompleto.startsWith("a")) {
            JOptionPane.showMessageDialog(null, nombreCompleto + "\n" + nombreCompleto + "\n" + nombreCompleto);
        } else {
            JOptionPane.showMessageDialog(null, nombreCompleto);
        }
    }
}

