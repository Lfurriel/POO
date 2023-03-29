package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private int numero;
    private List<Agencia> agencias = new ArrayList<>();

    public Banco(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
        this.agencias = null;
    }

    public static void novaAgencia() {
        Agencia agencia = new Agencia();
        
    }

}
