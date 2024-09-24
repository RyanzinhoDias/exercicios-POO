import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Funcionario meuFuncionario = new Funcionario("nome", "end", 0, "10", "0", "0");

        menu();

        int opcao;
        do {
            System.out.print("\nEscolha a opção que você deseja: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    meuFuncionario.setNome(teclado.nextLine());
                    teclado.nextLine();
                    System.out.print("Endereço: ");
                    meuFuncionario.setEndereco(teclado.nextLine());
                    //teclado.nextLine();
                    System.out.print("RG: ");
                    meuFuncionario.setRg(teclado.nextLine());
                    //teclado.nextLine();
                    System.out.print("CPF: ");
                    meuFuncionario.setCpf(teclado.nextLine());
                    //teclado.nextLine();
                    System.out.print("Data de aniversário: ");
                    meuFuncionario.setDataAniversario(teclado.nextLine());
                    //teclado.nextLine();
                    System.out.print("Salário: ");
                    meuFuncionario.setSalario(teclado.nextDouble());
                    meuFuncionario.contratar();
                    System.out.println("Parabéns você foi contrado!");
                    break;
                case 2:
                    meuFuncionario.demitir();
                    System.out.println("Desejamos boa sorte.");
                    break;
                case 3:
                    System.out.print("Digite 1 para aumento de salário ou 2 para redução:");
                    teclado.nextLine();
                    String aux = teclado.nextLine();
                    switch(aux) {
                        case "1":
                            System.out.print("Valor do aumento: ");
                            meuFuncionario.aumentoSalario(teclado.nextDouble());
                            break;
                        case "2":
                            System.out.print("Valor da redução: ");
                            meuFuncionario.reducaoSalario(teclado.nextDouble());
                            break;
                    }
                    System.out.println("Novo salário é: " + meuFuncionario.getSalario());
                    break;
                case 4:
                    meuFuncionario.entrarDeFerias();
                    break;
                case 5:
                    meuFuncionario.voltardasFerias();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }
        }while(opcao != 6);
    }

    public static void menu(){
        System.out.println("1 - Contratar;\n2 - Demitir;\n3 - Alterar Salário;\n4 - Entrar de férias;\n5 - Voltar das férias;\n6 - Sair.");
    }
}