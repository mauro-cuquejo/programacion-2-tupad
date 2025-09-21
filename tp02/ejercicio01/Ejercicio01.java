package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    private static boolean esBisiesto(int anio) {
        return ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0));
    }

    public static void ejecutarEjercicio(Scanner scanner) {
        System.out.print("Ingrese un año: ");
        int anio = Integer.parseInt(scanner.nextLine());

        String resultado = esBisiesto(anio) ? "es bisiesto." : "no es bisiesto.";
        System.out.println("El año " + anio + " " + resultado);
    }
}
