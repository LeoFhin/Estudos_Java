package Aula_04_03_2024.Media_Aluno;
import java.util.Scanner;
public class Main_Media_Aluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Media_Aluno a = new Media_Aluno();
        System.out.println("Digite o seu nome: ");
        a.nome = sc.next();

        System.out.println("Digite a primeira nota: ");
        a.nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        a.nota2 = sc.nextInt();

        System.out.println("Dígite a terceira nota: ");
        a.nota3 = sc.nextInt();

        a.media();

        if (a.media >= 70) {
            System.out.println("Aluno aprovado");
        } else if (a.media <= 40) {
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Aluno na final");
        }

        System.out.println("O seu nome é: " + a.nome + " Sua média é " + a.media);

    }
}


