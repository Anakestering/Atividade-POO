package Atividades20082025.Atividade01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.print("Turno: ");
        funcionario.setTurno(scanner.next());
        System.out.print("Salario base: ");
        funcionario.setSalarioBase(scanner.nextDouble());
        funcionario.CalcularSalario();
        System.out.println(funcionario.toString());
    }
}
