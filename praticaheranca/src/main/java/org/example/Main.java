package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno meuAluno = new Aluno("Ryan", 20, "Masculino", "POO");
        Monitor meuMonitor = new Monitor("Ryan", 21, "Masculino", 8);

        System.out.printf("Nome: %s\nIdade: %d\nSexo: %s\nTurma: %s\n", meuAluno.getNome(), meuAluno.getIdade(), meuAluno.getSexo(), meuAluno.getTurma());
        System.out.printf("\nNome: %s\nIdade: %d\nSexo: %s\nTurma: %s", meuMonitor.getNome(), meuMonitor.getIdade(), meuMonitor.getSexo(), meuMonitor.getHorasTrabalhadas());
    }
}