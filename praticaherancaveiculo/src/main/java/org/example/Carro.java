package org.example;

public class Carro extends Veiculo {
    private int qtdLugares;
    private String tipoCambio;
    private String Motor;

    public Carro(String cor, int qtdPneus, String modelo, int anoDeFabricacao, int qtdLugares, String tipoCambio, String motor) {
        super(cor, qtdPneus, modelo, anoDeFabricacao);
        this.qtdLugares = qtdLugares;
        this.tipoCambio = tipoCambio;
        Motor = motor;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }
    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }
    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getMotor() {
        return Motor;
    }
    public void setMotor(String motor) {
        Motor = motor;
    }
}
