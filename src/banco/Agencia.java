package banco;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agencia {
    private String nome;
    private int numero;
    private List<Conta> contas = new ArrayList<>();

    private int idConta = 1;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void novaConta() {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        System.out.print("Digite nome do cliente: ");
        cliente.setNome(sc.nextLine());
        System.out.print("Digite cpf do cliente: ");
        cliente.setCpf(sc.nextLong());
        System.out.print("Digite rg do cliente: ");
        cliente.setRg(sc.nextLong());

        sc.nextLine();
        Conta conta = new Conta(cliente, this.numero, idConta++);
        String senha;
        do {
            System.out.print("Insira uma senha: ");
            senha = sc.nextLine();
            if (!Utils.validaSenha(senha))
                System.out.println("Senha inválida");
        } while (!Utils.validaSenha(senha));
        conta.setSenha(senha);

        System.out.println("numero: " + conta.getConta());

        contas.add(conta);
    }
}
