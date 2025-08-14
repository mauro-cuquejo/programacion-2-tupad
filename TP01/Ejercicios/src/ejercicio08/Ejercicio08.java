package ejercicio08;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.print("Ingrese el primer número: ");
        int primerNumero = Integer.parseInt(input.nextLine());        
        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = Integer.parseInt(input.nextLine());        
        
        int division = primerNumero / segundoNumero;
        
        System.out.println("División: " + primerNumero + " / " + segundoNumero + " = " + division);

    }
}
