package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculadora minhaCalculadora = new Calculadora();

        System.out.println(minhaCalculadora.soma());
        System.out.println(minhaCalculadora.subtracao());
        System.out.println(minhaCalculadora.multiplicacao());
        System.out.println(minhaCalculadora.divisao());
        System.out.println(minhaCalculadora.getValor1() + " - " + minhaCalculadora.getValor2());
        minhaCalculadora.limparDados();
        System.out.println(minhaCalculadora.getValor1() + " - " + minhaCalculadora.getValor2());
    }
}