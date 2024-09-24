package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Inventario {
    private List<Guitarra> listaGuitarras;

    public Inventario (){
        this.listaGuitarras = new ArrayList<>();
    }

    public List<Guitarra> getListaGuitarras() {
        return listaGuitarras;
    }
    public void setListaGuitarras(List<Guitarra> listaGuitarras) {
        this.listaGuitarras = listaGuitarras;
    }

    public void adicionar(Guitarra guitarra){
        this.listaGuitarras.add(guitarra);
    }

    public void obterGuitarra(String nrSerial){
            for(Guitarra guitarra: listaGuitarras){
                if (Objects.equals(guitarra.getNrSerial(), nrSerial)){
                    System.out.println();
                    System.out.printf("nrSerial: %s\nPreço: %d\nFabricante: %s\nModelo: %s\nTipo: %s\n",
                            guitarra.getNrSerial(),guitarra.getPreco(), guitarra.getFabricante(), guitarra.getModelo(), guitarra.getTipo());
                }
            }
    }

    public void listarGuitarras(String fabricante){
        for(Guitarra guitarra:listaGuitarras){
            if (Objects.equals(guitarra.getFabricante(), fabricante)){
                System.out.println();
                System.out.printf("nrSerial: %s\nPreço: %d\nFabricante: %s\nModelo: %s\nTipo: %s\n",
                        guitarra.getNrSerial(),guitarra.getPreco(), guitarra.getFabricante(), guitarra.getModelo(), guitarra.getTipo());
            }
        }
    }

    public void excluirGuitarra(String nrSerial){
        listaGuitarras.removeIf(guitarra -> Objects.equals(guitarra.getNrSerial(), nrSerial));
    }

    public void editarGuitarra(String nrSerial){
        listaGuitarras.removeIf(guitarra -> Objects.equals(guitarra.getNrSerial(), nrSerial));

    }

}
