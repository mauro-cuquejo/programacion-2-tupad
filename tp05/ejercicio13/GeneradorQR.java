package tp05.ejercicio13;

public class GeneradorQR {

    // Dependencia de creación
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        System.out.println("Código QR generado: " + codigoQR);
    }
}
