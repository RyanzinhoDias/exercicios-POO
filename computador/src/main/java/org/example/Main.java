package org.example;

public class Main {
    public static void main(String[] args) {
        Computador meuComputador = new Computador("Dell", 16, 250);

        meuComputador.imprimir();
        meuComputador.upgrad(4,262);
        System.out.println("\n");
        meuComputador.imprimir();
    }
}