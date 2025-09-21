package tp03.ejercicio01;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Mauro", "Cuquejo", "Matemáticas", 8.5);

        estudiante1.mostrarInformacion();

        estudiante1.subirCalificacion(1.5);
        estudiante1.mostrarInformacion();

        estudiante1.bajarCalificacion(2);
        estudiante1.mostrarInformacion();
    }
}
