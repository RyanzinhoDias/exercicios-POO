package org.example;

public class ContaPJ extends Conta{
    public ContaPJ(String numeroDaConta, String nomeDoTitular, String tipo, double saldo) {
        super(numeroDaConta, nomeDoTitular, tipo, saldo);
        this.setSaldo(getSaldo()+50);
    }
}
