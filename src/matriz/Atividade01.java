package matriz;

import java.util.Scanner;

/*1. Questão – Soma dos Elementos
Escreva um programa em Java que: - Crie um array de 5 números inteiros. - Solicite que o usuário
digite cada número. - Utilize um laço for para calcular a soma de todos os elementos do array. -
Exiba a soma final.*/


public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            soma += numeros[i];
        }

        System.out.println("A soma dos números é: " + soma);

    }
}
