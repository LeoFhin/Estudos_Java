package Listas.Lista_01.Questao_01;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); // Cria um Scanner para a entrada de dados do teclado
        Funcionario fc = new Funcionario(); // Instacia o objeto Funcionario

        //Solicita e armazena o dado da Matricula
        System.out.println("Dígite seu número de matricula: ");
        fc.setMatricula(sc.nextInt());

        //Solicita e armazena o dado do Nome
        System.out.println("Dígite seu nome: ");
        fc.setNome(sc.next());

        //Solicita e armazena o dado do salario bruto
        System.out.println("Dígite seu salario Bruto: ");
        fc.setSalario_bruto(sc.nextDouble());

        fc.resultados(); //chama o metodo "resultados"
        fc.calc_inss(); // Chama o metodo "Calculo do inss"
        fc.calc_salario_liquido(); // Chama o metodo "Calculo salario liquido"

    }
}
