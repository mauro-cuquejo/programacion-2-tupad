package tp05.ejercicio05;

public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("Asus",
                "A7F1C9E2-4D6F-4B5C-8A9E-3F2B6D4A8C15",
                "PRIME A520M-K",
                "AMD A520");
        System.out.println(computadora);
        computadora.mostrarPlacaMadre();
        computadora.mostrarPropietario();

        Propietario propietario = new Propietario("Mauro Curbejo", 2020202020L);
        propietario.setComputadora(computadora);
        computadora.mostrarPropietario();
        propietario.mostrarComputadora();
    }
}
