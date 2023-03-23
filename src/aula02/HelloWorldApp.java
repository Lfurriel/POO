package aula02;

import java.util.Scanner;

public class HelloWorldApp {
    public static void main(String[] args) {

        System.out.print("Olá! Digite seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome);

    }
}
