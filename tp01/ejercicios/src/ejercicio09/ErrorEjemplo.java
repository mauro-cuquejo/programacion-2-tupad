package ejercicio09;

import java.util.Scanner;

public class ErrorEjemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // ERROR Se corrigió cambiando por nextLine, que recibe un string.
        System.out.println("Hola, " + nombre);
    }
}