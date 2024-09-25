package org.example;

public class Calculadora {
    private int valor1;
    private int valor2;

    public Calculadora() {
        this.valor1 = 0;
        this.valor2 = 0;
    }

    public int getValor1() {
        return valor1;
    }
    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }
    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int soma(int valor1, int valor2){
        return valor1 + valor2;
    }

    public int subtracao(int valor1, int valor2){
        return valor1 - valor2;
    }

    public int multiplicacao(int valor1, int valor2){
        return valor1 * valor2;
    }

    public float divisao(float valor1, float valor2){
        if (valor2 == 0){
            return 0;
        }
        return (valor1 / valor2);
    }

    public int quociente(int valor1, int valor2){
        return valor1 / valor2;
    }

    public float resto(int valor1, int valor2){
        return (float) valor1 % valor2;
    }



}
