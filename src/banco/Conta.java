package banco;

import java.util.Scanner;

public class Conta {
    private Cliente cliente;
    private int conta;
    private double saldo;
    private String senha;

    public Conta(Cliente cliente, int idAgencia, int idConta) {
        this.cliente = cliente;
        this.conta = getId(idAgencia, idConta);
        this.saldo = 0.0;
    }

    private int getId(int idAgencia, int idConta) {
        return idAgencia * 1000 + idConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getConta() {
        return conta;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    protected String getSenha() {
        return senha;
    }

    public void operacoes(Scanner sc) {
        boolean senhaIncorreta;
        int tentativas = 1;
        String senha;

        sc.nextLine(); //limpando buffer
        System.out.println("CONTA: " + this.conta);
        System.out.println("CLIENTE: " + this.cliente.getNome());
        do {
            senhaIncorreta = false;
            System.out.print("Digite sua senha: ");
            senha = sc.nextLine();

            if(!senha.equals(this.senha)) {
                senhaIncorreta = true;
                tentativas++;
                System.out.println("Senha incorreta!");
            }
        } while (senhaIncorreta && tentativas < 3);

        if(senhaIncorreta)
            System.out.println("Não podera acessar");
        else {
            System.out.println("SEU SALDO: R$" + saldo);
            int op;
            double valor;
            do {
                System.out.println("<1> Depositar\n<2> Sacar\n<0> Sair");
                op = sc.nextInt();
                switch (op) {
                    case 0:
                        System.out.println("Obrigado!");
                        break;
                    case 1:
                        System.out.print("Valor a ser depositado: ");
                        valor = sc.nextDouble();
                        depositar(valor);
                        break;
                    case 2:
                        System.out.print("Valor a ser sacado: ");
                        valor = sc.nextDouble();
                        sacar(valor);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } while (op != 0);

        }
    }


    private void depositar(double deposito) {

        this.saldo += deposito;
        System.out.println("Seu novo saldo: R$" + this.saldo);
    }

    private void sacar(double saque) {
        if (this.saldo > saque) {
            this.saldo -= saque;
            System.out.println("Seu novo saldo: R$" + this.saldo);
        } else
            System.out.println("Sem saldo :c ");
    }
}
