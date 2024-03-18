package Listas.Lista_01.Questao_02;

public class Aluno {
    private int nota1, nota2, media;
    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public void calc_media(){
        media = (nota1 + nota2) / 2;

        if (media >= 70){
            System.out.println("Aluno aprovado" + media);
        }
        else if (media < 40 ) {
            System.out.println("Aluno reprovado: " + media);
        }
        else {
            System.out.println("Aluno na final: " + media);
        }
    }

}
