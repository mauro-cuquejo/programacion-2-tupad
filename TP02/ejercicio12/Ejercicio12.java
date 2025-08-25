package ejercicio12;

public class Ejercicio12 {

    private static void imprimirPreciosIterativo(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: " + precio);
        }
    }

    public static void ejecutarEjercicio() {
        double[] precios = { 199.99, 299.5, 149.75, 399.0, 89.99 };

        System.out.println("Precios originales:");
        imprimirPreciosIterativo(precios);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirPreciosIterativo(precios);
    }
}
