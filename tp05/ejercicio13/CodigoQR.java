package tp05.ejercicio13;

public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        String userInfo = (usuario != null) ? usuario.toString() : "No asociado a ningún usuario";
        return "CodigoQR [valor=" + valor + ", usuario=" + userInfo + "]";
    }
}
