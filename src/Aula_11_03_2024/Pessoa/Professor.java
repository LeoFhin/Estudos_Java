package Aula_11_03_2024.Pessoa;

public class Professor extends Pessoa {
    private int qtd_hora, valor_hora, salario;
    public int getQtd_hora() {
        return qtd_hora;
    }

    public void setQtd_hora(int qtd_hora) {
        this.qtd_hora = qtd_hora;
    }

    public int getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(int valor_hora) {
        this.valor_hora = valor_hora;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void calc_salario(){
        salario = valor_hora * qtd_hora;
        System.out.println("O valor do seu salario é:" + salario);
    }
}
