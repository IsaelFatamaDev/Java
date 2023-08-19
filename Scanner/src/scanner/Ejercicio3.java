package scanner;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu sexo (H/M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Ingresa tu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura (cm): ");
        double altura = scanner.nextDouble();

        double pesoIdeal = 0;

        if (sexo != 'H') if (sexo == 'M') {
            pesoIdeal = (altura - 100) * 0.85;
        } else {
            System.out.println("Sexo no válido.");
            return;
        } else {
            pesoIdeal = (altura - 100) * 0.9;
        }

        System.out.println("Tu peso ideal es: " + pesoIdeal + " kg");

        scanner.close();
    }
}
