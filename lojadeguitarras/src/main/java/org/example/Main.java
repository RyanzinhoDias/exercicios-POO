package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Inventario inventarioGuitarras = new Inventario();

        menu();
        int opcao;
        do {
            System.out.print("\nEscolha qual opção você deseja: ");
            opcao = teclado.nextInt();

            switch (opcao){
                case(1):
                    System.out.print("NrSerial: ");
                    teclado.nextLine();
                    String nrSerial = teclado.nextLine();
                    System.out.print("Preço: ");
                    int preco = teclado.nextInt();
                    System.out.print("Fabricante: ");
                    teclado.nextLine();
                    String fabricante = teclado.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = teclado.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = teclado.nextLine();

                    Guitarra minhaGuitarra = new Guitarra(nrSerial, preco, fabricante, modelo, tipo);
                    inventarioGuitarras.adicionar(minhaGuitarra);
                    break;
                case(2):
                    teclado.nextLine();
                    System.out.print("Digite o nrSerial da guitarra que você deseja excluir: ");
                    inventarioGuitarras.excluirGuitarra(teclado.nextLine());
                    for(Guitarra g:inventarioGuitarras.getListaGuitarras()){
                        System.out.printf("nrSerial: %s\nPreço: %d\nFabricante: %s\nModelo: %s\nTipo: %s\n",
                                g.getNrSerial(),g.getPreco(), g.getFabricante(), g.getModelo(), g.getTipo());
                    }
                    break;
                case(3):
                    teclado.nextLine();
                    System.out.print("Digite o nrSerial da guitarra que você deseja editar: ");
                    inventarioGuitarras.editarGuitarra(teclado.nextLine());

                    System.out.print("NrSerial: ");
                    nrSerial = teclado.nextLine();
                    System.out.print("Preço: ");
                    preco = teclado.nextInt();
                    System.out.print("Fabricante: ");
                    teclado.nextLine();
                    fabricante = teclado.nextLine();
                    System.out.print("Modelo: ");
                    modelo = teclado.nextLine();
                    System.out.print("Tipo: ");
                    tipo = teclado.nextLine();

                    Guitarra minhaGuitarraEditada = new Guitarra(nrSerial, preco, fabricante, modelo, tipo);
                    inventarioGuitarras.adicionar(minhaGuitarraEditada);
                    break;
                case(4):
                    teclado.nextLine();
                    System.out.print("Fabricante: ");
                    inventarioGuitarras.listarGuitarras(teclado.nextLine());
                    break;
                case(5):
                    teclado.nextLine();
                    System.out.print("nrSerial: ");
                    inventarioGuitarras.obterGuitarra(teclado.nextLine());
                    break;
                case(6):
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção incorreta, tente novamente...");
            }
        }while (opcao!=6);

    }

    public static void menu() {
        System.out.println("""
                1-Adicionar Gruitarra;
                2-Excluir Guitarra;
                3-Editar Guitarra;
                4-Consultar todas as guitarras
                5-Obter Guitarras;
                6-Sair;""");
    }
}