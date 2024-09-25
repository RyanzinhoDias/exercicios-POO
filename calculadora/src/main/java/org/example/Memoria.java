package org.example;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
    private List<Float> listaMemoria;

    public Memoria() {
        this.listaMemoria = new ArrayList<>();
    }

    public List<Float> getListaMemoria() {
        return listaMemoria;
    }

    public void setListaMemoria(List<Float> listaMemoria) {
        this.listaMemoria = listaMemoria;
    }

    public void armazenarMemoria(float metodo) {
        listaMemoria.add(metodo);
    }

    public void exibirRegistrosMemoria() {
        int i = 0;
        for (Float registro : listaMemoria) {
            System.out.printf("%d - ", i);
            System.out.println(registro);
            i++;
        }
    }

    public void limparDados() {
        listaMemoria.clear();
    }
}