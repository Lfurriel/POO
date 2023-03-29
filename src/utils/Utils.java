package utils;

public class Utils {

    public static double fatorial(int number) {
        double result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

    public static boolean validaSenha(String senha) {
        String especial = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]";
        String numeros = "\\d";
        String maiuscula = "[A-Z]";

        return senha.matches(".*" + especial + ".*") &&
                senha.matches(".*" + numeros + ".*") &&
                senha.matches(".*" + maiuscula + ".*");
    }

}
