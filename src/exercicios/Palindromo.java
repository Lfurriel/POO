package exercicios;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(verificaPalindromo(sc.nextLine()))
            System.out.println("É palíndromo");
        else
            System.out.println("Não é palíndromo");
    }

    private static boolean verificaPalindromo(String palavra) {

        palavra = palavra.toLowerCase().replaceAll(" ", "");

        int mid = palavra.length()/2;
        int last = palavra.length() - 1;

        for(int i = 0; i < mid; i++) {
            if(palavra.charAt(i) != palavra.charAt(last))
                return false;
            last--;
        }
        return true;
    }
}
