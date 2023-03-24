package exercicios;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //exercicioUm(sc);
        //exercicioDois(sc);
        //exercicioTres(sc);
        //exercicioQuatro(sc);
        exercicioCinco(sc);

    }

    public static void exercicioUm(Scanner sc) {
        int a, b, c;
        System.out.print("Digite o numero 1: ");
        a = sc.nextInt();
        System.out.print("Digite o numero 2: ");
        b = sc.nextInt();
        System.out.print("Digite o numero 3: ");
        c = sc.nextInt();

        int soma = a + b + c;
        System.out.println("SOMA: " + soma);

        int produto = a * b * c;
        System.out.println("PRODUTO: " + produto);

        float media = (float) (soma / 3);
        System.out.println("MÉDIA: " + media);

        int maior;
        if (a > b && a > c)
            maior = a;
        else if (b > a && b > c)
            maior = b;
        else
            maior = c;
        System.out.println("MAIOR: " + maior);

        int menor;
        if (a < b && a < c)
            menor = a;
        else if (b < a && b < c)
            menor = b;
        else
            menor = c;
        System.out.println("MENOR: " + menor);
    }

    public static void exercicioDois(Scanner sc) {
        double raio;
        double pi = Math.PI;

        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();

        System.out.println("Raio: " + raio);
        System.out.println("Diâmetro: " + (raio * 2));
        System.out.printf("Área: %.2f", (pi * raio * raio));
    }

    public static void exercicioTres(Scanner sc) {
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0)
            System.out.println("São múltiplos.");
        else
            System.out.println("Não são múltiplos.");
    }

    public static void exercicioQuatro(Scanner sc) {
        System.out.print("Digite o caractere: ");
        char c = sc.next().charAt(0);
        System.out.println("O carctere " + c + " tem o código " + (int) c + " na tabela ASCII");
    }

    public static void exercicioCinco(Scanner sc) {
        double []lista = new double[15];
        
        for(int i = 0; i < 15; i++) {
            System.out.print("Digite um número: ");
            lista[i] = sc.nextDouble();
        }
        
        boolean aux;
        double maior1 = 0, maior2 = 0;
        for (double d : lista) {
            aux = true;
            if(d > maior1) {
                maior1 = d;
                aux = false;
            }
            else if (d > maior2 && aux)
                maior2 = d;
        }

        System.out.println("Os maiores são: " + maior1 + " " + maior2);
    }
}
