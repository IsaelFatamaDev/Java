package scanner;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int numero = rand.nextInt(6) + 1; // El número aleatorio ahora está entre 1 y 6

        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina un número entre el 1 y el 6:");
        int adivinanza = sc.nextInt();

        while (adivinanza != numero) {
            if (adivinanza < numero) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }

            System.out.println("Adivina de nuevo:");
            adivinanza = sc.nextInt();
        }

        System.out.println("¡Acertaste!");
    }

}
