package aula06;

import aula06.produtos.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shampoo[] shampoos = new Shampoo[3];
        Biscoito[] biscoitos = new Biscoito[3];
        Leite[] leites = new Leite[3];

        shampoos[0] = new Shampoo("LOREAL", 500, 5); //100
        shampoos[1] = new Shampoo("DOVE", 500, 10); //50
        shampoos[2] = new Shampoo("SKALA", 100, 10); //10

        biscoitos[0] = new Biscoito("OREO", 100, 100); //1
        biscoitos[1] = new Biscoito("BAUDUCO", 50, 5); //10
        biscoitos[2] = new Biscoito("CLUB SOCIAL", 50, 100); //0.5

        leites[0] = new Leite("PARMALAT", 100, 50); //20
        leites[1] = new Leite("ITALAC", 50, 50); //1
        leites[2] = new Leite("LIDER", 100, 10);//10

        try {
            System.out.println("LEITE: " + leites[1/0].getNome());
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("ERRO: " + e.getLocalizedMessage());
            throw new RuntimeException("ALO??");
        }  finally {
            System.out.println("JULIA? ");
        }
    }
}
