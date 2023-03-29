package aula01;

import aula01.classes.Aluno;
import aula01.classes.Arvore;
import aula01.classes.Cachorro;
import aula01.classes.Gato;

import java.util.Date;

public class Fundamentos {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        Date nascimento = new Date(2002, 3, 20);

        aluno.setNome("Lucas Furriel");
        aluno.setRg("50.613.371-0");
        aluno.setNascimento(nascimento);
        aluno.setRa("221043918");
        aluno.setCurso("CC2014");
        aluno.setMedia(10.0); // Finge :D

        System.out.println("============ " + aluno.getNome() + " ============");
        System.out.println("RG: " + aluno.getRg());
        System.out.println("RA: " + aluno.getRa());
        System.out.println("Nascimento: " + aluno.getNascimento());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.printf("Media: " + aluno.getMedia());

        System.out.print("\n\n");

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.setNome("Dogo");
        cachorro.setRaca("Maltes");
        cachorro.setIdade(4);
        cachorro.setSexo('m');
        cachorro.setBolinhasPegas(14);

        gato.setNome("Pitty");
        gato.setRaca("Siames");
        gato.setIdade(7);
        gato.setSexo('f');
        gato.setVidas(1);


        System.out.println("\nCachorro:");
        System.out.println("\tNome: " + cachorro.getNome());
        System.out.println("\tRaça: " + cachorro.getRaca());
        System.out.println("\tIdade: " + cachorro.getIdade());
        System.out.println("\tSexo: " + cachorro.getSexo());
        System.out.println("\tBolinhas: " + cachorro.getBolinhasPegas());

        System.out.println("\nGato:");
        System.out.println("\tNome: " + gato.getNome());
        System.out.println("\tRaça: " + gato.getRaca());
        System.out.println("\tIdade: " + gato.getIdade());
        System.out.println("\tSexo: " + gato.getSexo());
        System.out.println("\tVidas: " + gato.getVidas());

        gato.brincar(cachorro);
        gato.miar();

        cachorro.brincar(gato);
        cachorro.latir();

        System.out.println("\n\nO gachorro brincou e agora pegou " + cachorro.pegarBolinha() + " bolinhas");

        System.out.println("\n\nO gato perdeu uma vida");
        gato.perderVidas();

        Arvore arvore = new Arvore();
        arvore.setNome("Arvore do Pedro");
        arvore.setAltura(15);
        arvore.setGlicose(10);
        arvore.setLuz(100);
        arvore.setCO2(10);

        System.out.println(arvore.fotosintetizar());
    }
}