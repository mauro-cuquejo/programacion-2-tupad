package tp08.parte02.trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivoWithResources {
    public static void leerArchivo(String ruta) {
        try {
            File archivo = new File(ruta);
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                System.out.println("Contenido del archivo: " + reader.readLine());
            } catch (IOException e) {
                System.out.println("Error de lectura del archivo.");
            }
        } catch (Exception e) {
            System.out.println("no se encontró el archivo");
        }
    }

}
