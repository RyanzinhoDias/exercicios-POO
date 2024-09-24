package org.example;

public class Notebook extends Computador{
    private float polegadas;
    private String tipoBateria;

    public Notebook(String processador, int qtdMemoria, String qtdDisco, float polegadas, String tipoBateria) {
        super(processador, qtdMemoria, qtdDisco);
        this.polegadas = polegadas;
        this.tipoBateria = tipoBateria;
    }

    public float getPolegadas() {
        return polegadas;
    }
    public void setPolegadas(float polegadas) {
        this.polegadas = polegadas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }
    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }
}
