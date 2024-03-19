package Aula_18_03_2024.Carro;

public class Carro {
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    private String marca, modelo;
    private int ano;

    public Carro(){

    }
    public Carro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
}

