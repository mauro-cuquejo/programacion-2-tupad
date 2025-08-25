package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    private static String obtenerEtapa(int edad) {
        if (edad < 12) {
            return "Niño";
        }
        if (edad <= 17) {
            return "Adolescente";
        }
        if (edad <= 59) {
            return "Adulto";
        }
        return "Adulto mayor";
    }

    public static void ejecutarEjercicio(Scanner scanner) {
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Eres un " + obtenerEtapa(edad));
    }
}
