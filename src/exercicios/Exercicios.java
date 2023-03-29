package exercicios;

import java.util.*;

import utils.Utils;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //exercicioUm(sc);
        //exercicioDois(sc);
        //exercicioTres(sc);
        //exercicioQuatro(sc);
        //exercicioCinco(sc);
        //exercicioSeis(sc);
        //exercicioSete(sc);
        //exercicioOito(sc);
        //exercicioNove(sc);
        //exercicioDez(sc);
        exercicioOnze(sc);

    }

    private static void exercicioUm(Scanner sc) {
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

    private static void exercicioDois(Scanner sc) {
        double raio;
        double pi = Math.PI;

        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();

        System.out.println("Raio: " + raio);
        System.out.println("Diâmetro: " + (raio * 2));
        System.out.printf("Área: %.2f", (pi * raio * raio));
    }

    private static void exercicioTres(Scanner sc) {
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0)
            System.out.println("São múltiplos.");
        else
            System.out.println("Não são múltiplos.");
    }

    private static void exercicioQuatro(Scanner sc) {
        System.out.print("Digite o caractere: ");
        char c = sc.next().charAt(0);
        System.out.println("O carctere " + c + " tem o código " + (int) c + " na tabela ASCII");
    }

    private static void exercicioCinco(Scanner sc) {
        double[] lista = new double[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite um número: ");
            lista[i] = sc.nextDouble();

        }

        double maior1 = -1.79769E+308, maior2 = maior1 + 1;
        for (double d : lista) {
            if (d > maior1) {
                maior1 = d;
            } else if (d > maior2)
                maior2 = d;
        }

        System.out.println("Os maiores são: " + maior1 + " " + maior2);
    }

    private static void exercicioSeis(Scanner sc) {
        Map<String, Double> mapa = new LinkedHashMap<>();
        double valor;
        final double fixo = 200.0;
        String nome;

        System.out.println("<-1> Sair");
        do {
            valor = -1;
            System.out.print("Nome do vendedor: ");
            nome = sc.nextLine();
            if (!nome.equals("-1")) {
                System.out.print("Digite valor total de vendas: ");
                valor = sc.nextDouble();

                if (valor != -1) {
                    valor = fixo + (0.09 * valor);
                    mapa.put(nome, valor);
                }
                sc.nextLine();
            }
        } while (valor != -1);


        System.out.println("\n\n-------------------------------");

        for (String m : mapa.keySet()) {
            System.out.println("Vendedor: " + m + " - Salário: R$" + mapa.get(m).toString());
        }
    }

    private static void exercicioSete(Scanner sc) {
        int n = sc.nextInt();
        double e = 0.0;
        for (int i = 1; i <= n; i++)
            e += (1 / Utils.fatorial(i));

        System.out.println(e);
    }

    private static void exercicioOito(Scanner sc) {
        int[] numeros = new int[15];

        System.out.println("Digite 12 numeros: ");

        for (int i = 0; i < 12; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 12; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " : PAR");
            } else {
                System.out.println(numeros[i] + " : IMPAR");
            }
        }
    }

    private static void exercicioNove(Scanner sc) {
        int[] numeros = new int[15];
        int maiores10 = 0, menores8 = 0;
        System.out.println("Digite 12 numeros: ");

        for (int i = 0; i < 12; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] < 8)
                menores8++;
            else if (numeros[i] > 10)
                maiores10++;
        }

        System.out.println("Porcentagem menores que 8: " + (menores8 * 100 / 12) + "%");
        System.out.println("Porcentagem maiores que 10: " + (maiores10 * 100 / 12) + "%");
    }

    private static void exercicioDez(Scanner sc) {
        int[][] numeros;
        System.out.println("Digite o lado do quadrado mágico: ");
        int n = sc.nextInt();
        boolean unicos = true;
        numeros = new int[n][n];

        int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

        int[] somaLinhas, somaColunas;

        somaLinhas = new int[n];
        somaColunas = new int[n];

        System.out.println("Digite " + (n * n) + " numeros: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numeros[i][j] = sc.nextInt();

                somaLinhas[i] += numeros[i][j];
                somaColunas[j] += numeros[i][j];
                if (i == j)
                    somaDiagonalPrincipal += numeros[i][j];
                if (i + j == n - 1)
                    somaDiagonalSecundaria += numeros[i][j];


                for (int k = 0; k < i; k++) {
                    for (int l = 0; l < j; l++) {
                        if (numeros[k][l] == numeros[i][j]) {
                            unicos = false;
                            System.out.println(215 + " " + i);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (somaLinhas[i] != somaLinhas[i + 1]) {
                unicos = false;
                break;
            }
            if (somaColunas[i] != somaColunas[i + 1]) {
                unicos = false;
                break;
            }
        }

        if (unicos && (somaDiagonalPrincipal != somaDiagonalSecundaria ||
                somaColunas[0] != somaLinhas[0] || somaDiagonalPrincipal != somaLinhas[0]))
            unicos = false;

        if (unicos)
            System.out.println("É um quadrado mágico");
        else
            System.out.println("Não é quadrado magico");
    }

    private static void exercicioOnze(Scanner sc) {
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();
        boolean verifica = true;
        int []vet = new int[127];
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            vet[c]++;
            if(vet[c] > 1) {
                verifica = false;
                System.out.println("Existem caracteres repetidos");
            }
        }
        if(verifica)
            System.out.println("Não existem caracteres repetidos");
    }
}
