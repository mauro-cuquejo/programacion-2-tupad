package tp05.ejercicio01;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Jorge Páez", "12345678A");

        Pasaporte pasaporte = new Pasaporte(987654321L,
                LocalDateTime.now(),
                "ruta/a/la/imagen.jpg",
                "JPEG");

        System.out.println("Titular: " + titular.getNombre() + ", DNI: " + titular.getDni());
        System.out.println(
                "Pasaporte Numero: " + pasaporte.getNumero() + ", Fecha Emision: " + pasaporte.getFechaEmision());
        System.out.println(
                "Foto Formato: " + pasaporte.getFoto().getFormato() + ", Imagen: " + pasaporte.getFoto().getImagen());

        titular.setPasaporte(pasaporte);

        System.out.println("Titular del Pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte del Titular: " + titular.getPasaporte().getNumero());
    }
}
