package p2.arquivos;

import java.io.*;

public class Scanner {
    private static final String pathIn = "D:\\IdeaProjects\\POO\\src\\p2\\arquivos\\arquivo\\in.txt";
    public static void main(String[] args) {
        File arquivo = new File(pathIn);

        try (java.util.Scanner sc = new java.util.Scanner(arquivo)) {
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
