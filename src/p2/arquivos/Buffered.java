package p2.arquivos;

import java.io.*;

public class Buffered {

    private static final String pathIn = "D:\\IdeaProjects\\POO\\src\\p2\\arquivos\\arquivo\\in.txt";
    public static void main(String[] args) {
        System.out.println("Buffered Reader");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathIn))) {
            String linha = bufferedReader.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
