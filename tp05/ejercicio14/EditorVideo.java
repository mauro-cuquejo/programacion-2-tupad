package tp05.ejercicio14;

public class EditorVideo {

    //Dependencia de creación
    public static void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        System.out.println("Exportando proyecto: " + proyecto + " en formato: " + formato);
        System.out.println("Render generado: " + render);
    }
}
