package Listas.Lista_04.Questão_01;
import java.util.Scanner;
public class Main {
    public static void  main(String [] args){
        Professor pr = new Professor();
        Aluno al = new Aluno();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do professor: ");
        pr.setNome(sc.next());

        System.out.println("Digte a idade do professor: ");
        pr.setIdade(sc.nextInt());

        System.out.println("Digite o sálario do professor: ");
        pr.setSalario(sc.nextDouble());

        System.out.println("Digite o nome do aluno: ");
        al.setNome(sc.next());

        System.out.println("Digite a idade do aluno: ");
        al.setIdade(sc.nextInt());

        System.out.println("Digite a matricula do aluno: ");
        al.setMatricula(sc.nextInt());

        System.out.println("Dados professor: ");
        System.out.println("Nome: " + pr.getNome());
        System.out.println("Idade: " + pr.getIdade());
        System.out.println("Sálario: " + pr.getSalario());

        System.out.println("Dados Aluno: ");
        System.out.println("Nome: " + al.getNome());
        System.out.println("Idade: " + al.getIdade());
        System.out.println("Sálario: " + al.getMatricula());
    }
}
