package entities;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
    }

    // Construtores, getters e setters...

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
    }

    public Integer getMatricula() {
        return null;
    }

    public void setNome(String nome) {
    }
}
