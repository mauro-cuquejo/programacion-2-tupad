package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio05 {
    
    public static final String OPERACION = "%s: %d %s %d = %s";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.print("Ingrese el primer numero: ");
        int primerNumero = Integer.parseInt(input.nextLine());        
        System.out.print("Ingrese el segundo numero: ");
        int segundoNumero = Integer.parseInt(input.nextLine());
        int suma = primerNumero + segundoNumero;
        int resta = primerNumero - segundoNumero;
        int multiplicacion = primerNumero * segundoNumero;
        
        String resultadoDivision;
        if (segundoNumero != 0){
            resultadoDivision = String.valueOf(primerNumero + segundoNumero);
        } else {
            resultadoDivision = "No se puede realizar la operación";
        }
        System.out.println(String.format(OPERACION, "Suma", primerNumero, "+", segundoNumero, suma));        
        System.out.println(String.format(OPERACION, "Resta", primerNumero, "-", segundoNumero, resta));        
        System.out.println(String.format(OPERACION, "Multiplicacion", primerNumero, "*", segundoNumero, multiplicacion));        
        System.out.println(String.format(OPERACION, "Division", primerNumero, "/", segundoNumero, resultadoDivision));
    }
}
