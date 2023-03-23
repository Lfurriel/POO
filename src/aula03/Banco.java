package aula03;


import aula03.classes.Cliente;
import aula03.classes.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        List<Conta> contas = criarContas();
        apresentarContas(contas);

    }

    public static List<Conta> criarContas() {

        Scanner sc = new Scanner(System.in);
        List<Conta> result = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println();
            Cliente cliente = new Cliente();
            System.out.println();
            System.out.println("Novo clinte:");
            System.out.print("\tInsira seu nome: ");
            cliente.setNome(sc.nextLine());
            System.out.print("\tInsira seu cpf: ");
            cliente.setCpf(sc.nextLong());
            System.out.print("\tInsira seu rg: ");
            cliente.setRg(sc.nextLong());

            Conta conta = new Conta(cliente);
            System.out.println("Sua nova conta criada, saldo: " + conta.getSaldo());

            System.out.print("Valor para depositar: ");
            double valor = sc.nextDouble();
            conta.depositar(valor);

            sc.nextLine();

            result.add(conta);
        }

        return result;
    }
    private static void apresentarContas(List<Conta> contas) {

        Scanner sc = new Scanner(System.in);

        for (Conta c: contas) {
            System.out.println("\n-----------------\n");
            System.out.println("CONTA: 0001-" + c.getConta());
            System.out.println("Cliente: " + c.getCliente().getNome());
            System.out.println("Saldo: R$" + c.getSaldo());

            System.out.print("\nDigite o valor para sacar: ");
            c.sacar(sc.nextDouble());
            System.out.println();
        }
    }

}
