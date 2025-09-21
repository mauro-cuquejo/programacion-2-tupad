package tp05.ejercicio12;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Contribuyente contribuyente = new Contribuyente("Pedro de los Palotes", "20-12345678-9");
        System.out.println(contribuyente);
        Impuesto impuesto = new Impuesto(new BigDecimal("12345.67"));
        System.out.println(impuesto);
        calculadora.calcular(impuesto);
        impuesto.setContribuyente(contribuyente);
        System.out.println(impuesto);
        calculadora.calcular(impuesto);
    }
}
