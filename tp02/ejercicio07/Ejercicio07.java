package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
    public static void ejecutarEjercicio(Scanner scanner) {
        int nota;
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(scanner.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }
}
