package org.example;

public class Computador {
    private String processador;
    private int qtdMemoria;
    private String qtdDisco;

    public Computador(String processador, int qtdMemoria, String qtdDisco) {
        this.processador = processador;
        this.qtdMemoria = qtdMemoria;
        this.qtdDisco = qtdDisco;
    }

    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getQtdMemoria() {
        return qtdMemoria;
    }
    public void setQtdMemoria(int qtdMemoria) {
        this.qtdMemoria = qtdMemoria;
    }

    public String getQtdDisco() {
        return qtdDisco;
    }
    public void setQtdDisco(String qtdDisco) {
        this.qtdDisco = qtdDisco;
    }
}
