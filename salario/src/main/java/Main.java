import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Funcionario testeFuncionario = new Funcionario("nome", "dep", 0, 0,  0, 0);

        System.out.print("NOME: ");
        testeFuncionario.setNome(teclado.nextLine());
        System.out.print("DEPARTAMENTO: ");
        testeFuncionario.setDepartamento(teclado.nextLine());
        System.out.print("HORAS TRABALHADAS: ");
        testeFuncionario.setHorasTrabalhadas(teclado.nextFloat());
        System.out.print("HORAS EXTRAS TRABALHADAS: ");
        testeFuncionario.setHorasExtrasTrabalhadas(teclado.nextFloat());
        System.out.print("SALÁRIO POR HORA: ");
        testeFuncionario.setSalarioPorHora(teclado.nextFloat());
        System.out.print("SALARIO POR HORA EXTRA: ");
        testeFuncionario.setSalarioPorHoraExtra(teclado.nextFloat());

        System.out.println();
        testeFuncionario.mostrarDados();

        System.out.println();
        System.out.println(testeFuncionario.calculaSalarioMensal());

    }
}