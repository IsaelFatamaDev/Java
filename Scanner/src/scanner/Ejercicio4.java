package scanner;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre completo: ");
        String nombre = scanner.nextLine();

        if (nombre.startsWith("A")) {
            System.out.println(nombre);
            System.out.println(nombre);
            System.out.println(nombre);
        } else {
            System.out.println(nombre);
        }

        scanner.close();
    }
}
