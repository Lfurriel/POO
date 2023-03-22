package aula01.classes;

import java.util.List;

public class Professor extends Pessoa {
    // sub-classe de Pessoa, portanto Professor também apresenta nome, rg, cpf e data de nascimento além de:
    private String contrato;
    private List<String> aulas;

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public List<String> getAulas() {
        return aulas;
    }

    public void setAulas(List<String> aulas) {
        this.aulas = aulas;
    }
}