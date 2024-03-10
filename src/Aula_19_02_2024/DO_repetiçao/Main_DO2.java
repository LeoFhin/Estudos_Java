package Aula_19_02_2024.DO_repetiçao;
import java.util.Scanner;
public class Main_DO2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        String r;

        do {
            System.out.println("Digite o seu nome: ");
            nome = sc.next();
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();

            System.out.println("para ver novamente digite S, para cancelar digite N");
            r = sc.next();

            if (r.equalsIgnoreCase("N")) {
                break;
            }
        }
        while (r.equalsIgnoreCase("S"));
    }
}
