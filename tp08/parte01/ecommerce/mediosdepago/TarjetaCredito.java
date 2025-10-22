package tp08.parte01.ecommerce.mediosdepago;

public class TarjetaCredito implements MedioDePago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Medio de Pago Tarjeta de Crédito.");
    }

    @Override
    public String getTipoMedioDePago() {
        return "Tarjeta de Crédito";
    }
}
