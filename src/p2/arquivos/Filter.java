package p2.arquivos;

import java.io.*;

public class Filter {

    private static final String pathIn = "D:\\IdeaProjects\\POO\\src\\p2\\arquivos\\arquivo\\in.txt";
    public static void main(String[] args) throws IOException {
        try (InputStreamReader filterIn = new InputStreamReader(new FileInputStream(pathIn))) {
            int c = filterIn.read();
            while (c != -1) {
                System.out.print(Character.toUpperCase((char) c));
                c = filterIn.read();
            }
        }
    }
}