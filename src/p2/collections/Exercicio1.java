package p2.collections;

import java.util.*;


public class Exercicio1 {
    public static void imprimeAlfabetica (Map<String, Integer> palavras) {
        System.out.println("Ordem alfabética: ");
        for(Map.Entry<String, Integer> entry : palavras.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());

    }

    public static void imprime10MaisFrequentes(Map<String, Integer> palavras) {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(palavras.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("As dez palavras mais frequentes:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
            if (count >= 10) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        String str = "ESSE ARQUIVO AQUI É SÓ PRA TESTES " +
                "VOU ESCREVER AQUI UMAS GROSELHA " +
                "E VER SE ESSA BOMBA DE CÓDIGO LÊ :D";
        Map<String, Integer> palavras = getPalavrasMap(str);
        imprimeAlfabetica(palavras);
        imprime10MaisFrequentes(palavras);
    }

    private static Map<String, Integer> getPalavrasMap(String str) {
        Map<String, Integer> palavras = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        String[] strSplit = str.split("\\s+");
        for (String palavra : strSplit)
            palavras.put(palavra, palavras.getOrDefault(palavra, 0) + 1);

        return palavras;
    }

}