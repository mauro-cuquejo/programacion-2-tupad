package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    private static int obtenerMayor(int a, int b, int c) {
        if (b > a && b > c) {
            return b;
        }
        if (c > a && c > b) {
            return c;
        }
        return a;
    }

    public static void ejecutarEjercicio(Scanner scanner) {

        System.out.print("Ingrese el primer número: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el tercer número: ");
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println("El mayor es: %d".formatted(obtenerMayor(num1, num2, num3)));
    }
}
