package Listas.Lista_01.Questao_01;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Funcionario fc = new Funcionario();

        System.out.println("Dígite seu número de matricula: ");
        fc.setMatricula(sc.nextInt());

        System.out.println("Dígite seu nome: ");
        fc.setNome(sc.next());

        System.out.println("Dígite seu salario Bruto: ");
        fc.setSalario_bruto(sc.nextDouble());

        fc.resultados();
        fc.calc_inss();
        fc.calc_salario_liquido();

    }
}
