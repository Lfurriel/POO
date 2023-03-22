package aula01.classes;

public class Aluno extends Pessoa {
    // sub-classe de Pessoa, portanto aluno também apresenta nome, rg, cpf e data de nascimento além de:


    private String curso;
    private String ra;
    private Double media;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}