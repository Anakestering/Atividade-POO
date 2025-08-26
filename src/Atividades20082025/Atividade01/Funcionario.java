package Atividades20082025.Atividade01;

/*Exercício 1: Funcionário da Fábrica
Crie uma classe Funcionario que represente um trabalhador de uma indústria. A
classe deve ter atributos para nome, matrícula, turno (manhã, tarde, noite) e salário
base. Implemente métodos para calcular o salário final (considerando adicional noturno
de 20% para turno da noite) e exibir os dados do funcionário.*/

public class Funcionario {

    private String nome = "Ana";
    private int matricula = 164621;
    private String turno; // "manhã", "tarde", "noite"
    private double salarioBase;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void CalcularSalario() {

        if (turno.equalsIgnoreCase("noite")) {
           salarioBase = salarioBase * 1.20; // Adicional noturno de 20%
        }

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", turno='" + turno + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
