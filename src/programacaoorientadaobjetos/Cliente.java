package programacaoorientadaobjetos;

import java.util.Date;
import java.util.Scanner;

//Deixar private e criar os hetters e setter

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    private String email;
    private String senha;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void formulario(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cliente: ");
        setNome(scanner.next());
        System.out.print("Senha: ");
        setSenha(scanner.next());
        System.out.print("CPF: ");
        setCpf(scanner.next());
        System.out.print("Data de nascimento: ");
        setDataNascimento(scanner.next());
        System.out.print("Telefone:");
        setTelefone(scanner.next());
        System.out.print("Email: ");
        setEmail(scanner.next());
    }


    // Cliente.toString();
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}

