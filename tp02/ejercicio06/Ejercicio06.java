package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
    public static void ejecutarEjercicio(Scanner scanner) {
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = Integer.parseInt(scanner.nextLine());
            if (numero > 0) {
                positivos += 1;
            } else if (numero < 0) {
                negativos += 1;
            } else {
                ceros += 1;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
