package org.example;

public class ContaPF extends Conta{
    public ContaPF(String numeroDaConta, String nomeDoTitular, String tipo, double saldo) {
        super(numeroDaConta, nomeDoTitular, tipo, saldo);
        this.setSaldo(getSaldo()+50);
    }

//    public double valorSaldo(saldo){
//        return setSaldo(getSaldo()+saldo);
//    }

}
