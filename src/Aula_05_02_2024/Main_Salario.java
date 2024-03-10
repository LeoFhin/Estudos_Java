package Aula_05_02_2024;

public class Main_Salario {
    public static void Mainq4(String[] args) {

        double salario = 6000;

        if (salario <= 900) {
            System.out.println("isento");
        } else if (salario <= 1500) {
            System.out.println("Desconto de 5%");
        } else if (salario <= 2500) {
            System.out.println("Desconto de 10%");
        } else {
            System.out.println("Desconto de 20%");
        }
    }
}
