package aula02;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int linha1, coluna1, linha2, coluna2;

        System.out.print("Digite a linha e coluna da primeira matriz: ");
        linha1 = sc.nextInt();
        coluna1 = sc.nextInt();

        System.out.print("Digite a linha e coluna da segunda matriz: ");
        linha2 = sc.nextInt();
        coluna2 = sc.nextInt();

        if(coluna1 != linha2)
            System.out.println("Não é possível calcular a multiplicação de matrizes");
        else
            leMatriz(linha1, coluna1, linha2, coluna2, sc);

    }

    private static void leMatriz(int linha1, int coluna1, int linha2, int coluna2, Scanner sc) {
        System.out.println();
        int i, j;
        int[][] matrizA = new int[linha1][coluna1], matrizB = new int[linha2][coluna2], result = new int[linha1][coluna2];

        System.out.println("Digite os valores da primeira matriz:\n");
        for(i = 0; i < linha1; i++) {
            for (j = 0; j < coluna1; j++){
                matrizA[i][j] = sc.nextInt();
            }

        }

        System.out.println("\nDigite os valores da segunda matriz:\n");
        for(i = 0; i < linha2; i++) {
            for (j = 0; j < coluna2; j++){
                matrizB[i][j] = sc.nextInt();
            }

        }

        System.out.println("Matriz A:");
        imprimeMatriz(matrizA, linha1, coluna1);
        System.out.println("Matriz B:");
        imprimeMatriz(matrizB, linha2, coluna2);

        result = multiplicaMatrizes(matrizA, matrizB, linha1, coluna1, coluna2);
        System.out.println("Resultado:");
        imprimeMatriz(result, linha1, coluna2);


    }

    private static int[][] multiplicaMatrizes(int[][] matrizA, int[][] matrizB, int linha1, int coluna1, int coluna2) {


        int[][] result = new int[linha1][coluna2];

        for (int i = 0; i < linha1; i++) {
            for (int j = 0; j < coluna2; j++) {
                for (int k = 0; k < coluna1; k++) {
                    result[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return result;
    }

    private static void imprimeMatriz(int[][] result, int linha, int coluna) {
        System.out.println("\n");
        int i, j;
        for(i = 0; i < linha; i++) {
            System.out.println();
            for (j = 0; j < coluna; j++){
                System.out.print(result[i][j] + " ");
            }

        }

    }


}
