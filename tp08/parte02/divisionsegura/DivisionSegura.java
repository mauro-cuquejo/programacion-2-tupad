package tp08.parte02.divisionsegura;

public class DivisionSegura {
    public static Double dividir(double numerador, double denominador) {
        try {
            if (denominador == 0) {
                throw new ArithmeticException("Error: División por cero no permitida.");
            }
            return numerador / denominador;
        } catch (ArithmeticException e) {
            System.out.println("Error en división: " + e.getMessage());
            return null;
        }
    }
}
