package joptionpane;

import javax.swing.JOptionPane;

public class Ejercicio1JOpcionPane {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        
        String operacion = JOptionPane.showInputDialog("Ingrese la operación (+, -, *, /): ");
        
        int resultado = 0;
        
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida.");
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
