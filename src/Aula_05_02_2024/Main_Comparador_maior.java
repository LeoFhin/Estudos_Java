package Aula_05_02_2024;

public class Main_Comparador_maior {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 18;
        int total;

        total = num1 - num2;

        if (num1 > num2) {
            System.out.println("o meu é maior");
        } else if (num1 == num2) {
            System.out.println("os nossos sao iguais");
        } else {
            System.out.println("o seu é menor");
        }
    }
}
