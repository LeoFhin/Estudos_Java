package Aula_04_03_2024.Funcionarios;
import java.util.Scanner;
public class Main_Funcionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite o valor da hora trabalhada: R$ ");
        f.setValorHora(sc.nextDouble());

        System.out.println("Dígite a quantidade de horas trabalhadas: ");
        f.setHorasTrabalhadas(sc.nextInt());

        f.calcularSalario();
        System.out.print("O valor da hora: " + f.getValorHora() + " R$, trabalhando " +
                +f.gethorasTrabalhadas() + "horas");
    }
}
