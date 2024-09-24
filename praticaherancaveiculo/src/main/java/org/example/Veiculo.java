package org.example;

public class Veiculo {
    private String cor;
    private int qtdPneus;
    private String modelo;
    private int anoDeFabricacao;

    public Veiculo(String cor, int qtdPneus, String modelo, int anoDeFabricacao) {
        this.cor = cor;
        this.qtdPneus = qtdPneus;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdPneus() {
        return qtdPneus;
    }
    public void setQtdPneus(int qtdPneus) {
        this.qtdPneus = qtdPneus;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
}
