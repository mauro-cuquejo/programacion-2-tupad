package tp08.parte01.ecommerce.cliente;

public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviando notificación a cliente " + this.nombre + ": " + mensaje);
    }
}
