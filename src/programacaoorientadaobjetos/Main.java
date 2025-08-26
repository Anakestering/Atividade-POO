package programacaoorientadaobjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
//        String nome; //"Filipe"
//        Conta conta;
//        //construir um objeto conta
//        conta = new Conta();
//        //Setter
//        conta.setNumero(01);
//        conta.getNumero();
//
//        conta.setTitular("Filipe");
//        conta.setSaldo(110000);
//        conta.imprimirDados();
//
//        //criar uma conta2
//        //pedir para o usuario digitar os dados
//        Conta conta2;
//        conta2 = new Conta();
//        /*chamado um método construtor de conta*/
//        System.out.println("Digite o numero da conta:");
//        conta2.setNumero(scanner.nextInt());
//        System.out.println("Digite o titular da conta:");
//        conta2.setTitular(scanner.next());
//        conta2.setSaldo(0);
//        conta2.depositar();
//        conta2.imprimirDados();


        //construir um objeto conta
        Cliente cliente = new Cliente();
        cliente.formulario();

        Cliente cliente1 = new Cliente();
        cliente.formulario();

        System.out.println(cliente.toString());

    }
}