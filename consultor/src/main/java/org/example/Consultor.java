package org.example;

public class Consultor extends Funcionario{
    public Consultor(String matricula, String nome, float salario) {
        super(matricula, nome, salario);
    }

    @Override
    public float getSalario() {
        return (float) (super.getSalario()*0.1) + super.getSalario();
    }

    public float getSalario(float percentual){
        return (float) (super.getSalario()*(percentual/100)) + super.getSalario();
    }

}
