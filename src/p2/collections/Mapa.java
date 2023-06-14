package p2.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        HashMap<String, Integer> nomeSenha = new HashMap<>();
        nomeSenha.put("Julia", 123);
        nomeSenha.put("Furri", 456);
        nomeSenha.put("Scarancio", 789);

        System.out.println(nomeSenha.get("Furri")); //Printa o value da key "Furri"

        for (Map.Entry<String, Integer> hm : nomeSenha.entrySet())
            System.out.println(hm.getKey() + " -> " + hm.getValue());
    }
}
