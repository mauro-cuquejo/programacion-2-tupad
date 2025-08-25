package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
    public static void ejecutarEjercicio(Scanner scanner) {
        int sumaPares = 0;
        System.out.print("Ingrese un número (0 para terminar): ");
        int numero = Integer.parseInt(scanner.nextLine());
        while (numero != 0) {
            if (numero != 0 && numero % 2 == 0) {
                sumaPares += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
