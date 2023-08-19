package joptionpane;

import javax.swing.JOptionPane;

public class Ejercicio2JOptionPane {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 5) + 1;
        int intentos = 0;
        int numeroUsuario;
        
        do {
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número entre 1 y 5: "));
            intentos++;
        } while (numeroUsuario != numeroAleatorio);
        
        JOptionPane.showMessageDialog(null, "¡Correcto! Adivinaste el número " + numeroAleatorio + " en " + intentos + " intentos.");
    }
}
