package org.example;

public class Desktop extends Computador{
    private String tipoDaFonte;

    public Desktop(String processador, int qtdMemoria, String qtdDisco, String tipoDaFonte) {
        super(processador, qtdMemoria, qtdDisco);
        this.tipoDaFonte = tipoDaFonte;
    }

    public String getTipoDaFonte() {
        return tipoDaFonte;
    }
    public void setTipoDaFonte(String tipoDaFonte) {
        this.tipoDaFonte = tipoDaFonte;
    }
}
