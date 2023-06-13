package a;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nomeCompleto;
    private String senha;

    public Usuario(String nomeCompleto, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.senha = codificaSenha(senha, 4);
    }

    public final String codificaSenha(String senha, int chave) {
        StringBuilder senhaCodificada = new StringBuilder();

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);

            if (Character.isLetter(caractere)) {
                char codificado = (char) (((caractere - 'a' + chave) % 26) + 'a');
                senhaCodificada.append(codificado);
            } else {
                senhaCodificada.append(caractere);
            }
        }

        return senhaCodificada.toString();
    }

    public String getSenha() {
        return senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeCompleto;
    }
}
