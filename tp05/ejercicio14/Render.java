package tp05.ejercicio14;

public class Render {
    private String formato;
    private Proyecto proyecto;


    public Render(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        String proyecto = (this.proyecto != null) ? this.proyecto.toString() : "Sin proyecto asociado";
        return "Render [formato=" + formato + ", proyecto=" + proyecto + "]";
    }
}
