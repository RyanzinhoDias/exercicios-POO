package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculadora minhaCalculadora = new Calculadora();
        Memoria minhaMemoria = new Memoria();

        minhaMemoria.armazenarMemoria(minhaCalculadora.soma(9,1));
        minhaMemoria.armazenarMemoria(minhaCalculadora.subtracao(15,9));
        minhaMemoria.armazenarMemoria(minhaCalculadora.multiplicacao(65,4));
        minhaMemoria.armazenarMemoria(minhaCalculadora.divisao(98, 3));
        minhaMemoria.armazenarMemoria(minhaCalculadora.quociente(7,3));
        minhaMemoria.armazenarMemoria(minhaCalculadora.resto(7,3));

        System.out.println("Antes de limpar dados da memória:");
        minhaMemoria.exibirRegistrosMemoria();

        minhaMemoria.limparDados();
        System.out.println("Após limpar dados de memória:");
        minhaMemoria.exibirRegistrosMemoria();
        minhaMemoria.limparDados();
    }
}