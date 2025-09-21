package tp05.ejercicio08;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan Perez", "juanperez@jmail.com");
        System.out.println(usuario);
        Documento documento = new Documento("Contrato",
                "Contratamos a Juan perez...",
                "abc123", LocalDateTime.now(), usuario);

        System.out.println(documento);
        System.out.println(documento.getFirmaDigital());
    }
}
