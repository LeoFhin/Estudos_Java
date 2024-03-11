package Aula_11_03_2024.Pessoa;

public class Aluno extends Pessoa{
    double nota1, nota2, media;
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    public double getMedia() {
        return media;
    }


    public void calc_media(){
        media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é: " + media);
    }

}
