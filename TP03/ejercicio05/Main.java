package TP03.ejercicio05;

public class Main {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Enterprise", 50);
        nave1.mostrarEstado();
        nave1.avanzar(20);
        nave1.mostrarEstado();
        nave1.despegar();
        nave1.avanzar(20);
        nave1.mostrarEstado();
        nave1.avanzar(0);
        nave1.avanzar(3);
        nave1.avanzar(1);
        nave1.avanzar(1);
        nave1.mostrarEstado();
        nave1.recargarCombustible(20);
        nave1.mostrarEstado();
        nave1.avanzar(5);
        nave1.despegar();
        nave1.mostrarEstado();
        nave1.avanzar(1);
        nave1.mostrarEstado();
    }
}
