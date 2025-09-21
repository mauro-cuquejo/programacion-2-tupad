package tp05.ejercicio13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("mirko Lovicio", "mirko.lovicio@gmiau.com"); //mirko es mi gato
        System.out.println(usuario);
        GeneradorQR generadorQR = new GeneradorQR();
        System.out.println("Generando código QR para el usuario...");
        generadorQR.generar("https://www.ejemplo.com/perfil/mirkolovicio", usuario);
        System.out.println("Código QR generado con éxito.");
        System.out.println(usuario);
    }
}
