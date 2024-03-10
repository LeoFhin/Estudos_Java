package Aula_19_02_2024.DO_repetiçao;
import java.util.Scanner;
public class Main_DO {
    public static void main(String[] args) {

        String r;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Caso escolha A: Comprar camisa, Caso escolha B: Comprar calça");

            String x = sc.next();

            switch (x) {

                case "A":
                    System.out.println("valor R$74.00");
                    break;

                case "B":
                    System.out.println("Valor R$ 120,00");
                    break;
            }

            System.out.println("Para ver novamente digite S, Para encerrar o processo digite N: ");
            r = sc.next();
            if (r.equalsIgnoreCase("N")) {
                break;
            }

        }

        while (r.equalsIgnoreCase("S"));
    }
}
