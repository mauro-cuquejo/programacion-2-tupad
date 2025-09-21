package tp05.ejercicio02;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // agregacion 1 a 1
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
