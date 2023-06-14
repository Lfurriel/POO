package p2.wildcards;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void emitirSom() {
        System.out.println("Som de um animal");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

class Veterinario {
    public void examinar(List<? extends Animal> animais) {
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}

public class VeterinarioSelvagem {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(cachorro);

        List<Gato> gatos = new ArrayList<>();
        gatos.add(gato);

        Veterinario veterinario = new Veterinario();

        System.out.println("Examinando animais:");
        veterinario.examinar(animais);

        System.out.println("Examinando cachorros:");
        veterinario.examinar(cachorros);

        System.out.println("Examinando gatos:");
        veterinario.examinar(gatos);
    }
}
