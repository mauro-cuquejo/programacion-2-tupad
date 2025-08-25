package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    private static final double DESCUENTO_ESPECIAL = 0.10;

    private static double calcularDescuentoEspecial(double precio) {
        return precio * DESCUENTO_ESPECIAL;
    }

    public static void ejecutarEjercicio(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());

        double descuento = calcularDescuentoEspecial(precio);

        System.out.println("El descuento especial aplicado es: " + descuento);
        System.out.println("El precio final con descuento es: " + (precio - descuento));
    }
}
