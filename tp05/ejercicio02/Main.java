package tp05.ejercicio02;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Mauro", 35353535);

        System.out.println("Usuario" + usuario.getNombre() + "dni" + usuario.getDni());
        usuario.mostrarCelular();

        Bateria bateria = new Bateria("a500", 5000);

        Celular celular = new Celular("1322asdas321", "Samsung", "Galaxy 128", bateria);

        celular.setUsuario(usuario);

        usuario.mostrarCelular();


    }
}
