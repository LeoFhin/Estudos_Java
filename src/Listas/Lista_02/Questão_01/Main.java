package Listas.Lista_02.Questão_01;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        Maçã mc = new Maçã();

        System.out.println("Dígite a quantidade de maçãs: ");
        mc.setQuantidade(sc.nextInt());

        if (mc.getQuantidade() < 12){
            System.out.println("Valor da compra: " + (mc.getQuantidade() * mc.getCusto1()));
        }
        else{
            System.out.println("Valor da compra: " + (mc.getQuantidade()) * mc.getCusto2());
        }
    }
}
