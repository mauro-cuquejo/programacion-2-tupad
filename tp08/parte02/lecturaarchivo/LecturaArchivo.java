package tp08.parte02.lecturaarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
    public static void leerArchivo(String ruta) {
        File archivo = new File(ruta);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(archivo));
            System.out.println("Contenido del archivo: " + reader.readLine());

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
        } catch (IOException e) {
            System.out.println("Error de lectura del archivo.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }
}
