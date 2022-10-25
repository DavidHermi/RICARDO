import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File archivo = new File("/home/dam2a/IdeaProjects/primitiveWriteUTF/texto3");
        DataOutputStream escribirArchivo = new DataOutputStream(new FileOutputStream(archivo));
        DataInputStream lerArquivo = new DataInputStream(new FileInputStream(archivo));

        int i = 0;
        do {
            System.out.println("Escribindo a cadea: O tempo está xélido");
            escribirArchivo.writeUTF("O tempo está xélido");
            System.out.println("Tamaño do ficheiro: " + escribirArchivo.size());
            i++;
        } while (i < 3);

        escribirArchivo.close();
        int b;
        while ((b = lerArquivo.available()) != 0) {
            System.out.println("Quedan por ler " + b + " bytes");
            String cadea = lerArquivo.readUTF();
            System.out.println(cadea);

        }
        System.out.println("Xa non queda nada por ler");
        lerArquivo.close();

    }
}