package p2.collections;

import java.util.HashSet;
import java.util.Set;

public class FurriSet {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("Furri");
        sets.add("Juloia");
        sets.add("Bianca");
        sets.add("Furri"); // SETS num geral não permitem repetições
        sets.add("Pedrogás");

        for (String s: sets)
            System.out.println(s);
    }
}
