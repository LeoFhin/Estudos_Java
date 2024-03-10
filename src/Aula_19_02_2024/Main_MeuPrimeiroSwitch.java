package Aula_19_02_2024;

public class Main_MeuPrimeiroSwitch {
    public static void main(String[] args) {

        String x = "A"; //variavel determinada como uma str

        switch (x) {

            case "A" : // Se o valor for A
                System.out.println("Opção 0 escolhida");
                break;

            case "B" : // Se o valor for B
                System.out.println("Opção 1 escolhida");
                break;

            case "C" : // Se o valor for C
                System.out.println("Opção 2 escolhida");
                break;

            default: // Se o valor nao for nenhuma das opções
                System.out.println("Opção invalida");
        }

    }
}
