package TP03.ejercicio04;

public class Gallina {
    private Long idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(Long idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("ID Gallina: " + idGallina + ", Edad: " + edad + " años, Huevos puestos: " + huevosPuestos);
    }
}