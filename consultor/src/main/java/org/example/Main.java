package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Consultor consultor = new Consultor("0000", "Teste", 1000);

        System.out.println(consultor.getSalario(10));

    }
}