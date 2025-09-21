package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = Integer.parseInt(input.nextLine());
        System.out.println("Su nombre es: " + nombre 
                + ", y su edad es: " + edad);
    }
}
