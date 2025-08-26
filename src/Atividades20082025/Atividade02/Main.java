package Atividades20082025.Atividade02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maquina maquina = new Maquina();
        System.out.print("Defina status da máquina: ");
        maquina.setStatus(scanner.next());
        maquina.ligar();
        System.out.print("Quantas horas ficou ligada: ");
        maquina.setHorastrabalhadas(scanner.nextInt());
        maquina.producaoDiara();




    }
}
