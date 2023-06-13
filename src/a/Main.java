package a;

import java.io.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {



        Scanner scan = new Scanner(System.in);
        int op;
        do {
            System.out.println("Escolha");
            System.out.println("1) Cadastro");
            System.out.println("2) Login");
            System.out.println("0) Sair");
            op = scan.nextInt();
            scan.nextLine();
            if (op == 1) {
                cadastrar(scan);
            } else if (op == 2) {
                login(scan);
            }
        } while(op != 0);
    }

    private static void login(Scanner scanner) {
        System.out.println("Digite o nome completo");
        String nome = scanner.nextLine();
        System.out.println("Digite a senha");
        String senha = scanner.nextLine();
        ObjectInputStream inObj = null;
        File in = null;

        int op;
        System.out.println("1) Ler do arquivo txt");
        System.out.println("2) Ler do arquivo Objeto");
        op = scanner.nextInt();
        if (op == 1) {
            try {
                in = new File("out.txt");
                Scanner s = new Scanner(in);
                while (s.hasNextLine()) {
                    String[] str = s.nextLine().split("/");
                    if (str[0].equals(nome) && senha.equals(decodificaSenha(str[1], 4))) {
                        System.out.println("Logado");
                        break;
                    }
                    s.nextLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (op == 2) {
            try {
                inObj = new ObjectInputStream(new FileInputStream("outObjeto.dat"));
                Usuario u;
                boolean encontrado = false; // Flag para verificar se o usuário foi encontrado
                while (true) {
                    try {
                        u = (Usuario) inObj.readObject();
                        System.out.println(u.toString());
                        if (u.getNomeCompleto().equals(nome) && decodificaSenha(u.getSenha(), 4).equals(senha)) {
                            System.out.println("Logado");
                            encontrado = true;
                            break;
                        }
                    } catch (EOFException e) {
                        break; // Sai do loop quando chegar ao final do arquivo
                    }
                }
                if (!encontrado) {
                    System.out.println("Usuário não encontrado");
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }

    public static void cadastrar(Scanner scanner) throws IOException {
        System.out.println("Digite o nome completo");
        String nome = scanner.nextLine();
        System.out.println("Digite a senha");
        String senha = scanner.nextLine();
        Usuario user = new Usuario(nome, senha);
        ObjectOutputStream outObj = null;
        FileWriter out = null;

        try {
            outObj = new ObjectOutputStream(new FileOutputStream("outObjeto.dat", true));
            outObj.writeObject(user);
            out = new FileWriter("out.txt", true);
            out.write(nome + "/" + user.codificaSenha(senha, 4) + "\n");
            out.write("\n");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (outObj != null)
                outObj.close();
            if(out != null)
               out.close();
        }
    }

    public static String decodificaSenha(String senhaCodificada, int chave) {
        StringBuilder senhaDecodificada = new StringBuilder();

        for (int i = 0; i < senhaCodificada.length(); i++) {
            char caractere = senhaCodificada.charAt(i);

            if (Character.isLetter(caractere)) {
                char decodificado = (char) (((caractere - 'a' - chave + 26) % 26) + 'a');
                senhaDecodificada.append(decodificado);
            } else {
                senhaDecodificada.append(caractere);
            }
        }

        return senhaDecodificada.toString();
    }
}
