package Aula_05_02_2024;

public class Main_CalcularMedia {
    public static void main(String[] args) {

        double nota1 = 35;
        double nota2 = 75;
        double nota3 = 80;
        double media;

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 70) {
            System.out.println("APROVADO");
        }

        else if ((media > 40) && (media < 70)) {
            System.out.println("FINAL");
        }

        else {
            System.out.println("REPROVADO");
        }

        System.out.println(media);
    }
}
