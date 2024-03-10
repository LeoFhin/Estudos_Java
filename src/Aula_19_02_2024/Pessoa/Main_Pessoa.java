package Aula_19_02_2024.Pessoa;
import java.util.Scanner;
public class Main_Pessoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.println("antiga" + p.idade);
        p.niver();

        System.out.println("atual: " + p.idade);

        System.out.println("Digite o seu nome: ");
        p.nome = sc.next();

        System.out.println("Dígite a sua idade: ");
        p.idade = sc.nextInt();

        System.out.println("Seu nome é " + p.nome + "Sua idade é: " +p.idade );
    }
}
