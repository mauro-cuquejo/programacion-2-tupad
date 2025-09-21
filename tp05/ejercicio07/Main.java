package tp05.ejercicio07;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", 123456789L);
        Conductor conductor = new Conductor("emmett brown", Licencia.B);
        Vehiculo vehiculo = new Vehiculo("OUTATIME","DeLorean", motor);
        System.out.println(vehiculo);
        System.out.println(conductor);
        System.out.println(motor);
        vehiculo.mostrarConductor();
        vehiculo.mostrarMotor();
        conductor.mostrarVehiculo();

        vehiculo.setConductor(conductor);
        vehiculo.mostrarConductor();
        conductor.mostrarVehiculo();
        System.out.println(vehiculo);
        System.out.println(conductor);
        System.out.println(motor);

    }
}
