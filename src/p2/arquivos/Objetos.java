package p2.arquivos;


import java.io.*;
import java.util.ArrayList;

public class Objetos {
    private static final String pathPonteiro = "D:\\IdeaProjects\\POO\\src\\p2\\arquivos\\arquivo\\ponteiros.dat";
    public static void main(String[] args) {
        ArrayList<Ponteiro> ponteiros = criaPonteiros();
        //ArrayList<Ponteiro> ponteiros = lePonteiros();
        for (Ponteiro p : ponteiros)
            System.out.println(p.toString());
    }

    private static ArrayList<Ponteiro> lePonteiros() { //LE DO ARQUIVO
        ArrayList<Ponteiro> retorno = new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(pathPonteiro))) {
            retorno = (ArrayList<Ponteiro>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return retorno;
    }

    private static ArrayList<Ponteiro> criaPonteiros() { //ESCREVE NO ARQUIVO
        ArrayList<Ponteiro> retorno = new ArrayList<>();
        retorno.add(new Ponteiro(1, 2));
        retorno.add(new Ponteiro(3, 4));
        retorno.add(new Ponteiro(5, 6));
        retorno.add(new Ponteiro(7, 8));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(pathPonteiro))) {
            out.writeObject(retorno);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return retorno;
    }
}
