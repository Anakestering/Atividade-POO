package matriz;

import java.util.Scanner;

/*3. Questão – Contagem de Números Pares
Escreva um programa em Java que: - Crie um array com 6 números inteiros digitados pelo usuário.
- Utilize um laço for para contar quantos números do array são pares. - Exiba o total de números
pares encontrados.*/

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];
        int par = 0;

        for(int i =0; i < numeros.length; i++ ){
            System.out.print("Digite o " +(i+1)+"º número: ");
            numeros[i] = scanner.nextInt();

            if(numeros[i] % 2 == 0) {
                par++;
            }
        }

        System.out.print("Quantidade de números pares é de: "+par);

    }
}
