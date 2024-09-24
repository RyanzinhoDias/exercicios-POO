package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Notebook meuNotebook = new Notebook("Intel i7 13ª gen", 32, "1TB", 15.6f, "Bateria para Notebook Acer Nitro 5");
        Desktop meuDesktop = new Desktop("i9 12ªgen", 32, "1TB", "Terabyte");

        System.out.println(meuNotebook.getQtdDisco() + "\n" + meuNotebook.getTipoBateria() + "\n" + meuNotebook.getProcessador() + "\n" + meuNotebook.getQtdMemoria() + "\n" + meuNotebook.getPolegadas());
        System.out.println("\n"+meuDesktop.getTipoDaFonte()+"\n"+meuDesktop.getQtdDisco()+"\n"+meuDesktop.getProcessador()+"\n"+meuDesktop.getQtdMemoria());

    }
}