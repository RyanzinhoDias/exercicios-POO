package org.example;

public class Monitor extends Pessoa{
    private int horasTrabalhadas;

    public Monitor(String nome, int idade, String sexo, int horasTrabalhadas) {
        super(nome, idade, sexo);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
