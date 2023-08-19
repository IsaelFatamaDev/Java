package scanner;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa las horas trabajadas: ");
            double horasTrabajadas = scanner.nextDouble();
            
            System.out.print("Ingresa el sueldo por hora: ");
            double sueldoPorHora = scanner.nextDouble();
            
            double sueldo = horasTrabajadas * sueldoPorHora;
            
            if (horasTrabajadas > 100) {
                sueldo += 100; // Bono de 100 soles
            }
            
            System.out.println("El sueldo es: " + sueldo + " soles");
        }
    }
}
