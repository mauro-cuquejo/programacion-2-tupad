package tp08.parte01.ecommerce.mediosdepago;

public class PayPal implements MedioDePago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Medio de Pago PayPal.");
    }

    @Override
    public String getTipoMedioDePago() {
        return "PayPal";
    }

}
