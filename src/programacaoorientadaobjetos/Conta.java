package programacaoorientadaobjetos;

import java.util.Scanner;

//servi de molde
public class Conta { //conta conta2 contauzzcamvbau

    //Privar a variavel
    private int numero;
    private String titular;
    private double saldo;

    //Getter - pegar o conteudo da variavel de forma organizada
    public int getNumero(){
        return numero;
    }
    //Setter -  setar o conteudo(declarar)
    public void setNumero(int numero){
            this.numero = numero;
    }


    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }


    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }



    //funções da conta
    public void imprimirDados(){//conta.imprimirDados();
        System.out.println("*** Dados da Conta ***");
        System.out.println("Numero: "+this.numero);
        System.out.println("Titular:"+this.titular);
        System.out.println("Saldo:"+this.saldo);
    }
    public void sacar(){

    }
    public void depositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você quer depositar?");
        double valorDeposito = scanner.nextDouble();
        this.saldo += valorDeposito;
        System.out.println("Saldo Atual:"+this.saldo);
    }
}