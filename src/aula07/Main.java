package aula07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println("= " + Calculator.calcular(a,b,op));
        } catch (JuloiaException e) {
            throw new RuntimeException(e);
        }
    }
}
