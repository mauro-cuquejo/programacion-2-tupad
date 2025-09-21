package ejercicio08;
import java.util.Scanner;

public class Ejercicio08Modificado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.print("Ingrese el primer número: ");
        double primerNumero = Double.parseDouble(input.nextLine());        
        System.out.print("Ingrese el segundo número: ");
        double segundoNumero = Double.parseDouble(input.nextLine());        
        
        double division = primerNumero / segundoNumero;
        
        System.out.println("División: " + primerNumero + " / " + segundoNumero + " = " + division);

    }
}
