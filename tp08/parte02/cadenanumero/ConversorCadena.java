package tp08.parte02.cadenanumero;

public class ConversorCadena {
    public static int convertirANumero(String cadena) {
        try {
            return Integer.parseInt(cadena);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no es un número válido.");
            return -1;
        }
    }
}
