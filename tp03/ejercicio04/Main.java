package tp03.ejercicio04;

public class Main {

    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1L, 2, 5);
        Gallina gallina2 = new Gallina(2L, 3, 8);

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        gallina1.ponerHuevo();
        gallina2.envejecer();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

    }
}