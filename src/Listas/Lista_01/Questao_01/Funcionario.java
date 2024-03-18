package Listas.Lista_01.Questao_01;

public class Funcionario {
    private int matricula;
    private String nome;
    private double salario_bruto;
    private double inss;
    private double salario_liquido;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario_bruto() {
        return salario_bruto;
    }

    public void setSalario_bruto(double salario_bruto) {
        this.salario_bruto = salario_bruto;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getSalario_liquido() {
        return salario_liquido;
    }

    public void setSalario_liquido(double salario_liquido) {
        this.salario_liquido = salario_liquido;
    }

    public void calc_inss() {
        inss = salario_bruto * 0.15;
        System.out.println("Dedução do inss: " + inss);
    }

    public void calc_salario_liquido(){
        salario_liquido = salario_bruto - inss;
        System.out.println("Salario líquido: " + salario_liquido);
    }

    public void resultados (){
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário bruto: " + salario_bruto);
    }
}
