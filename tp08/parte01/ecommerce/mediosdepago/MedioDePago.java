package tp08.parte01.ecommerce.mediosdepago;

public interface MedioDePago extends Pago, PagoConDescuento {
    public abstract String getTipoMedioDePago();

}
