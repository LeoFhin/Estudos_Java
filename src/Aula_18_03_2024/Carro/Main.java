package Aula_18_03_2024.Carro;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Carro c = new Carro("Chevrolet", "Ônix", 2022);
        Carro c1 = new Carro();
        Carro c2 = new Carro("Ferrari", 2024);

        Scanner sc = new Scanner(System.in);

        System.out.println("Imprimindo o carro: ");
        System.out.println(c.getMarca());
        System.out.println(c.getModelo());
        System.out.println(c.getAno());

        System.out.println("Marca:");
        c.setMarca(sc.next());

        System.out.println("Modelo: ");
        c.setModelo(sc.next());

        System.out.println("Ano: ");
        c.setAno(sc.nextInt());

        System.out.println("Imprimindo novo carro: ");
        System.out.println(c.getMarca());
        System.out.println(c.getModelo());
        System.out.println(c.getAno());
    }
}
