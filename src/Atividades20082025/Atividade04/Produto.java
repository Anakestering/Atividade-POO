package Atividades20082025.Atividade04;

/*Exercício 4: Produto Industrial
Desenvolva uma classe Produto que represente um item fabricado. Deve conter
atributos para código, nome, peso e preço de custo. Crie métodos para calcular o preço
de venda (acréscimo de 30% sobre o custo) e exibir as especificações do produto.*/

public class Produto {

    private double codigo = 001;
    private String nome = "cafeteira";
    private double peso = 1.5;
    private double precoCusto = 150.00;

    public double getCodigo() {
        return codigo;
    }
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void calcularPrecoVenda (){
        double precoVenda = precoCusto * 1.3;
        System.out.println("Preço de venda do produto " + nome + ": R$ " + precoVenda);
    }

    public void exibir (){
        System.out.println("o código do produto é: " + codigo);
        System.out.println("o nome do produto é: " + nome);
        System.out.println("o peso do produto é: " + peso + "kg");
        System.out.println("o preço de custo do produto é: R$ " + precoCusto);
        calcularPrecoVenda();

    }
}
