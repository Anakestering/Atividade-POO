package matriz;

import java.util.Scanner;

/*2. Questão – Maior Número no Array
Escreva um programa em Java que: - Crie um array para armazenar 8 números inteiros. - Peça ao
usuário para preencher o array. - Use um laço for para encontrar o maior número do array. - Mostre
na tela o maior valor encontrado.
*/

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[8];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " +(i+1)+"º número: ");
            numeros[i] = scanner.nextInt();
        }
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número informado é o "+maior+".");


    }
}
