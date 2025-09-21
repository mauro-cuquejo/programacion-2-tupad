package tp05.ejercicio12;

import java.math.BigDecimal;

public class Calculadora {

    // Dependencia de uso
    public static void calcular(Impuesto impuesto) {
        String contribuyenteNombre = (impuesto.getContribuyente() != null) ? impuesto.getContribuyente().toString() : "N/A";
        System.out.println("Calculando impuesto para el contribuyente: " + contribuyenteNombre);
        System.out.println("Monto Original: " + impuesto.getMonto());
        System.out.println("Monto más Intereses: " + impuesto.getMonto().multiply(BigDecimal.TEN));
    }
}
