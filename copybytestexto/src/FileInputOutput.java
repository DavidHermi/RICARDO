import javax.swing.*;
import java.io.*;

public class FileInputOutput {

    public FileInputOutput() {
    }

    public void copiarTexto() throws IOException {

        File file = new File("/home/dam2a/Escritorio/CosasRichi/Ejercicios/CopybytestextoEjercicio/texto1.txt");

        FileInputStream leerarchivo = new FileInputStream(file);
        FileOutputStream escribirarchivo = new FileOutputStream("texto2.txt", true);

            /* for (int i = 0; i < file.length(); i++) {
                int bytes = leerarchivo.read();
                if (bytes == -1) {
                    break;
                } */
        int bytes;
        while ((bytes = leerarchivo.read()) != -1) {
            escribirarchivo.write(bytes);
        }
        escribirarchivo.close();
        leerarchivo.close();

    }
}