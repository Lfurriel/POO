package p2.arquivos;

import java.io.FileReader;
import java.io.IOException;

public class Char {//Le o arquivo char a char (NÃO quebra com caracteres fora da tabela ASCII)
    private static final String pathIn = "D:\\IdeaProjects\\POO\\src\\p2\\arquivos\\arquivo\\in.txt";

    public static void main(String[] args) {

        try (FileReader fr = new FileReader(pathIn)) {
            int c = fr.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fr.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
