package joptionpane;

import javax.swing.JOptionPane;

public class Ejercicio5JOptionPane {
    public static void main(String[] args) {

        String horasTrabajadasStr = JOptionPane.showInputDialog("Ingrese las horas trabajadas:");
        String sueldoPorHoraStr = JOptionPane.showInputDialog("Ingrese el sueldo por hora:");

        int horasTrabajadas = Integer.parseInt(horasTrabajadasStr);
        double sueldoPorHora = Double.parseDouble(sueldoPorHoraStr);

        double sueldo = horasTrabajadas * sueldoPorHora;

        if (horasTrabajadas > 100) {
            sueldo += 100;
        }

        JOptionPane.showMessageDialog(null, "El sueldo total es: " + sueldo + " soles");
    }
}
