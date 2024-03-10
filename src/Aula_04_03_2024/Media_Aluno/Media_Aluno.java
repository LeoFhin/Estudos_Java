package Aula_04_03_2024.Media_Aluno;

public class Media_Aluno {
    String nome;
    int nota1;
    int nota2;
    int nota3;

    int media;

    public void media() {
        media = (nota1 + nota2 + nota3) / 3;
    }

}
