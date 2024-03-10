package Aula_04_03_2024.Pessoa;
import java.util.Scanner;
public class Main_Pessoa {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa ();

        System.out.println("Digite o seu idade: ");
        p.setIdade(sc.nextInt());
        System.out.println("Idade: " + p.getIdade());

        System.out.println("Dígite o seu nome: ");
        p.setNome(sc.nextLine());
        System.out.println("Nome: " + p.getNome());
    }
}
