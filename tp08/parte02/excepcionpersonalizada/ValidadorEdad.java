package tp08.parte02.excepcionpersonalizada;

public class ValidadorEdad {
    public static void validarEdad(int edad) {
        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
            } else {
                System.out.println("Edad válida: " + edad);
            }
        } catch (EdadInvalidaException e) {
            System.out.println("Error de validación de edad: " + e.getMessage());
        }
    }
}
