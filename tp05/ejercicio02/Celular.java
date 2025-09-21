package tp05.ejercicio02;

public class Celular {
    private final String imei;
    private final String marca;
    private final String modelo;
    private final Bateria bateria; // agregacion 1 a 1
    private Usuario usuario;  // Asociacion bidireccional 1 a 1

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public String mostrarCelular() {
        String bateria = (this.bateria != null) ?
                "con bateria modelo: " + this.bateria.getModelo() + " y capacidad: " + this.bateria.getCapacidad() + " MA." :
                "sin bateria";

        return "Celular [imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + "]";
    }
}
