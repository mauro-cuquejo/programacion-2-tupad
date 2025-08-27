package TP03.ejercicio05;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private boolean enVuelo;
    private static final int LIMITE_COMBUSTIBLE = 100;
    private static final int CONSUMO_POR_ANIO_LUZ = 10;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.enVuelo = false;
    }

    public void despegar() {
        if (this.enVuelo) {
            System.out.println("La nave " + this.nombre + " ya está en vuelo.");

        } else if (combustible == 0) {
            System.out.println("La nave " + this.nombre + " no tiene suficiente combustible para despegar.");
        } else {
            this.enVuelo = true;
            combustible -= 10;
            System.out.println("La nave " + this.nombre +
                    " ha despegado correctamente. Combustible restante: " + this.combustible + ".");
        }
    }

    public void avanzar(int distancia) {
        if (!this.enVuelo) {
            System.out.println("La nave " + this.nombre + " no puede avanzar porque no está en vuelo.");
        } else if (distancia <= 0) {
            System.out.println("La distancia a avanzar debe ser mayor que cero.");
        } else {
            if (this.combustible >= CONSUMO_POR_ANIO_LUZ * Math.abs(distancia)) {
                this.combustible -= CONSUMO_POR_ANIO_LUZ * Math.abs(distancia);
                System.out.println(this.nombre + " ha avanzado " +
                        distancia + " Años Luz. Combustible restante: " + this.combustible + ".");
                if (this.combustible == 0) {
                    this.enVuelo = false;
                    System.out.println("La nave " + this.nombre + " se ha quedado sin combustible y se ha detenido.");
                }
            } else {
                System.out.println(
                        this.nombre + " no tiene suficiente combustible para avanzar la distancia solicitada.");
            }
        }

    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser mayor que cero.");
        } else if (this.combustible + cantidad > LIMITE_COMBUSTIBLE) {
            System.out.println("La cantidad de combustible excede la capacidad máxima de la nave " + this.nombre + ".");
        } else {
            this.combustible += cantidad;
            System.out.println("La nave " + this.nombre + " ha recargado " +
                    cantidad + " unidades de combustible. Combustible total: " + combustible + ".");
        }
    }

    public void mostrarEstado() {
        System.out.println(
                "Nave: " + nombre + ", Combustible: " + combustible + ". Consumo por Año Luz: " + CONSUMO_POR_ANIO_LUZ
                        + ", En vuelo: " + enVuelo + ".");
    }
}