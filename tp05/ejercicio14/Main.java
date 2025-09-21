package tp05.ejercicio14;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Proyecto Blairwitch", LocalTime.of(1, 30));
        System.out.println(proyecto);
        EditorVideo.exportar("MP4", proyecto);
    }
}
