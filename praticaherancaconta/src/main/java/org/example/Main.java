package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaPF minhaContaPF = new ContaPF("0000", "Nome Sobrenome", "PF", 1000);
        ContaPJ minhaContaPJ = new ContaPJ("00001", "Nome2", "PJ", 5000);

        System.out.printf("Número da Conta %s\nNome titular: %s\nTipo da Conta: %s\nSaldo: %.2f\n",
                minhaContaPF.getNumeroDaConta(), minhaContaPF.getNomeDoTitular(), minhaContaPF.getTipo(), minhaContaPF.getSaldo());

        System.out.printf("\nNúmero da Conta %s\nNome titular: %s\nTipo da Conta: %s\nSaldo: %.2f",
                minhaContaPJ.getNumeroDaConta(), minhaContaPJ.getNomeDoTitular(), minhaContaPJ.getTipo(), minhaContaPJ.getSaldo());

    }
}