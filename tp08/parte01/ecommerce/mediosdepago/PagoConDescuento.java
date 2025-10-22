package tp08.parte01.ecommerce.mediosdepago;

public interface PagoConDescuento {
    public default double aplicarDescuento(double monto, double porcentaje) {
        double descuento = monto * (porcentaje / 100);
        double montoConDescuento = monto - descuento;
        System.out.println("Aplicando descuento del " + porcentaje + "%: " +
                "$" + descuento + ". Monto final: $" + montoConDescuento);
        return montoConDescuento;
    }
}
