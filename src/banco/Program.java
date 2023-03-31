package banco;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do banco: ");
        String nome = sc.nextLine();
        System.out.print("Número do banco: ");
        int numero = sc.nextInt();

        Banco banco = new Banco(nome, numero);

        int op = 1;

        while (op != 0) {
            banco.novaAgencia();
            System.out.print("Inserir nova agência? <1> SIM <0> NÃO: ");
            op = sc.nextInt();
        }

        for (Agencia a : banco.getAgencias()) {
            System.out.println("\n\nInserindo contas na " + a.getNome());
            op = 1;
            while (op != 0) {
                a.novaConta();
                System.out.print("Inserir nova conta? <1> SIM <0> NÃO: ");
                op = sc.nextInt();
            }
        }

        apresentarBanco(banco);
        operacoes(banco, sc);
    }

    private static void apresentarBanco(Banco banco) {

        System.out.println("------------------------------------------------");
        System.out.println("NOME: " + banco.getNome() + " - " + banco.getNumero());

        for (Agencia a : banco.getAgencias()) {
            System.out.println("------------------------------------------------");
            System.out.println(a.getNome() + " - " + a.getNumero());
            for (Conta conta : a.getContas()) {
                System.out.println(conta.getConta() + " " + conta.getCliente().getNome());
            }
        }
    }

    private static void operacoes(Banco banco, Scanner sc) {
        Conta conta;
        int op;

        do {
            do {
                conta = buscarConta(banco, sc);
            } while (conta == null);
            conta.operacoes(sc);
            System.out.println("DIGITE <1> CONTINUAR <0> SAIR");
            op = sc.nextInt();
        } while (op != 0);

    }

    private static Conta buscarConta(Banco banco, Scanner sc) {
        int agencia, conta;
        Conta result = null;
        System.out.print("Digite numero da agencia e numero da conta: ");
        agencia = sc.nextInt();
        conta = sc.nextInt();

        boolean naoAchouAgencia = true;
        boolean naoAchouConta = true;

        for (Agencia a : banco.getAgencias()) {
            if (a.getNumero() == agencia) {
                naoAchouAgencia = false;
                for (Conta c : a.getContas()) {
                    naoAchouConta = false;
                    if(c.getConta() == conta) {
                        result = c;
                    }
                }
            }
        }

        if(naoAchouAgencia)
            System.out.println("Número de agência não encontrado");
        if (naoAchouConta)
            System.out.println("Número de conta não encontrado");

        return result;
    }
}
