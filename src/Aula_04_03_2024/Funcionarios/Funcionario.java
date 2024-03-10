package Aula_04_03_2024.Funcionarios;

public class Funcionario {
    private double valorHora, salario;
    private int horasTrabalhadas;

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int gethorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void calcularSalario() {
        salario = valorHora * horasTrabalhadas;
        System.out.println("O salário do funcionário é: R$ " + salario);
    }
}
