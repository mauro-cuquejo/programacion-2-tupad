package ejercicio13;

public class Ejercicio13 {
    public static void ejecutarEjercicio() {
        double[] precios = { 199.99, 299.5, 149.75, 399.0, 89.99 };
        System.out.println("Precios originales:");
        imprimirPreciosRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirPreciosRecursivo(precios, 0);
    }

    private static void imprimirPreciosRecursivo(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.println("Precio: " + precios[indice]);
        imprimirPreciosRecursivo(precios, indice + 1);
    }
}
