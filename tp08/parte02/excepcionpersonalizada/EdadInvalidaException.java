package tp08.parte02.excepcionpersonalizada;

public class EdadInvalidaException extends Throwable {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }

}
