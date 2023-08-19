package joptionpane;

import javax.swing.JOptionPane;

public class Ejercicio3JOpcionPane {
    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog(null, "Ingresa tu sexo (H/M):");
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu peso en kg:"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu altura en cm:"));

        double pesoIdeal = calcularPesoIdeal(sexo, altura);
        if (pesoIdeal != -1) {
            JOptionPane.showMessageDialog(null, "Tu peso ideal es aproximadamente " + String.format("%.2f", pesoIdeal) + " kg.");
        }

        if (peso < pesoIdeal) {
            JOptionPane.showMessageDialog(null, "Estás por debajo de tu peso ideal.");
        } else if (peso > pesoIdeal) {
            JOptionPane.showMessageDialog(null, "Estás por encima de tu peso ideal.");
        } else {
            JOptionPane.showMessageDialog(null, "Estás en tu peso ideal.");
        }
    }

    public static double calcularPesoIdeal(String sexo, int altura) {
        if (sexo.equals("H")) {
            return (altura - 100) - ((altura - 150) / 4);
        } else if (sexo.equals("M")) {
            return (altura - 100) - ((altura - 150) / 2.5);
        } else {
            JOptionPane.showMessageDialog(null, "Sexo no válido. Por favor, introduce 'H' para hombre o 'M' para mujer.");
            return -1;
        }
    }
}
