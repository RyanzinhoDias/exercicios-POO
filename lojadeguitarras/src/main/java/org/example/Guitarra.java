package org.example;

public class Guitarra {
    private String nrSerial;
    private int preco;
    private String fabricante;
    private String modelo;
    private String tipo;

    public Guitarra(String nrSerial, int preco, String fabricante, String modelo, String tipo){
        this.nrSerial = nrSerial;
        this.preco = preco;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getNrSerial() {
        return nrSerial;
    }
    public void setNrSerial(String nrSerial) {
        this.nrSerial = nrSerial;
    }

    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
