package Aula_11_03_2024.Pessoa;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         Aluno al = new Aluno();
         Professor pr = new Professor();

         int login;

         System.out.println("Digite 1 se vc está logando como Professor: ");
         System.out.println("Digite 2 se vc está logando como Aluno: ");
         login = sc.nextInt();

         switch (login) {

             case 1: // Se o valor for A
                 System.out.println("Você é um Professor");
                 System.out.println("Digite o nome do professor: ");
                 pr.setNome(sc.next());
                 System.out.println("Qual o valor há hora: ");
                 pr.setValor_hora(sc.nextInt());
                 System.out.println("Digite a quantidade de horas trabalhadas: ");
                 pr.setQtd_hora(sc.nextInt());
                 pr.calc_salario();
                 break;

             case 2: // Se o valor for B
                 System.out.println("Você é um Aluno");
                 System.out.println("Digite o nome do Aluno: ");
                 al.setNome(sc.next());
                 System.out.println("Digite a primeira nota do aluno: ");
                 al.setNota1(sc.nextInt());
                 System.out.println("Digite a segunda nota do aluno: ");
                 al.setNota2(sc.nextInt());
                 al.calc_media();
                 break;

             default: // Se o valor nao for nenhuma das opções
                 System.out.println("Opção invalida");
         }
     }





}
