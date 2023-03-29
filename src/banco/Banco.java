package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private String nome;
    private int numero;
    private List<Agencia> agencias = new ArrayList<>();
    private static int contador = 1;

    public Banco() {
    }

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void novaAgencia() {
        Scanner sc = new Scanner(System.in);
        Agencia agencia = new Agencia();

        System.out.print("\nDigite o nome da agência: ");
        agencia.setNome(sc.nextLine());
        agencia.setNumero(contador++);

        this.agencias.add(agencia);
    }
}
