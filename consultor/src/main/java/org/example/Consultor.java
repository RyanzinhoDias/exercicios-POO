package org.example;

public class Consultor extends Funcionario{
    public Consultor(String matricula, String nome, float salario) {
        super(matricula, nome, salario);
    }

    @Override
    public float getSalario() {
        return (float) (super.getSalario()*0.1) + super.getSalario();
    }

    

}
