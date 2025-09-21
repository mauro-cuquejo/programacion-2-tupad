package tp05.ejercicio10;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Ana Gomez", 12345678L);
        System.out.println(titular);
        CuentaBancaria cuentaBancaria = new CuentaBancaria("1234567890123456",
                BigDecimal.valueOf(10000.0),
                "Abc123",
                LocalDateTime.now());

        System.out.println(cuentaBancaria);
        System.out.println(titular);
        cuentaBancaria.setTitular(titular);
        System.out.println(cuentaBancaria);
        System.out.println(titular);
    }
}
