package org.example;

public class Computador {
    private String marca;
    private int qtdmemoria;
    private int qtdDisco;

    public Computador(String marca, int qtdmemoria, int qtdDisco){
        this.marca = marca;
        this.qtdmemoria = qtdmemoria;
        this.qtdDisco = qtdDisco;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdmemoria() {
        return qtdmemoria;
    }
    public void setQtdmemoria(int qtdmemoria) {
        this.qtdmemoria = qtdmemoria;
    }

    public int getQtdDisco() {
        return qtdDisco;
    }
    public void setQtdDisco(int qtdDisco) {
        this.qtdDisco = qtdDisco;
    }

    public void imprimir(){
        System.out.printf("Marca: %s\nQuantidade de memória: %d\nQuantidade de Disco: %d", getMarca(), getQtdmemoria(), getQtdDisco());
    }

    public void upgrad(int memoriaUp, int discoUp){
        setQtdmemoria(getQtdmemoria()+memoriaUp);
        setQtdDisco(getQtdDisco()+discoUp);
    }
}
