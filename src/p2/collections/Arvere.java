package p2.collections;

import java.util.TreeSet;

public class Arvere {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();

        // Adicionando elementos ao TreeSet
        arvore.add(5);
        arvore.add(2);
        arvore.add(8);
        arvore.add(1);
        arvore.add(4);

        // Imprimindo os elementos do TreeSet (ordenados)
        System.out.println("Elementos do TreeSet: " + arvore);

        // Verificando o tamanho do TreeSet
        System.out.println("Tamanho do TreeSet: " + arvore.size());

        // Verificando se o TreeSet contém um elemento específico
        System.out.println("Contém o número 4? " + arvore.contains(4));

        // Removendo um elemento do TreeSet
        arvore.remove(2);

        // Imprimindo os elementos novamente
        System.out.println("Elementos após a remoção: " + arvore);

        // Iterando pelos elementos do TreeSet
        System.out.println("Iterando pelos elementos:");
        for (Integer numero : arvore)
            System.out.println(numero);


        // Obtendo o primeiro e o último elemento do TreeSet
        System.out.println("Primeiro elemento: " + arvore.first());
        System.out.println("Último elemento: " + arvore.last());
    }
}
