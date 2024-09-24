package org.example;

public class Aluno extends Pessoa{
    private String turma;

    public Aluno(String nome, int idade, String sexo, String turma) {
        super(nome, idade, sexo);
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
