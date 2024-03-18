package Listas.Lista_01.Questao_02;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); // Cria um scanner para entrada de dados do teclado
        Aluno al = new Aluno(); // Instancia um objeto Aluno

        // Solicita e armazena a primeira nota do aluno
        System.out.println("Informe a primera nota: ");
        al.setNota1(sc.nextInt());

        // Solicita e armazena a segunda nota do aluno
        System.out.println(("Informe a segunda nota: "));
        al.setNota2(sc.nextInt());

        // Calcula e exibe a média do aluno
        al.calc_media();

    }
}
