package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Cinza", 4, "Polo GTS", 2024, 5, "Automático", "GTS 250 TSI\n");
        Moto minhaMoto = new Moto("Preta", 2, "Lander 250 ABS", 2024, 250);

        System.out.println(meuCarro.getCor() + "\n" + meuCarro.getQtdPneus() + "\n" + meuCarro.getModelo() + "\n" + meuCarro.getAnoDeFabricacao() + "\n" + meuCarro.getTipoCambio() + "\n" + meuCarro.getMotor()+"\n");
        System.out.println(minhaMoto.getCor() + "\n" + minhaMoto.getQtdPneus() + "\n" + minhaMoto.getModelo() + "\n" + minhaMoto.getAnoDeFabricacao());
    }
}