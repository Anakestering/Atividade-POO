package Atividades20082025.Atividade02;

/*Exercício 2: Máquina de Produção
Desenvolva uma classe Maquina que modele uma máquina industrial. Ela deve ter
atributos para identificação, capacidade máxima de produção por hora e status
(ligada/desligada). Crie métodos para ligar/desligar a máquina e calcular a produção
diária baseada em horas trabalhadas.
*/

public class Maquina {

    private String identificacao = "empilhadeira";
    private int capacidadeMaximaProducao = 100;
    private String status = "desligada"; // Padrão inicial é desligada
    private int horastrabalhadas;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public int getCapacidadeMaximaProducao() {
        return capacidadeMaximaProducao;
    }
    public void setCapacidadeMaximaProducao(int capacidadeMaximaProducao) {
        this.capacidadeMaximaProducao = capacidadeMaximaProducao;
    }

    public String getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getHorastrabalhadas() {
        return horastrabalhadas;
    }
    public void setHorastrabalhadas(int horastrabalhadas) {
        this.horastrabalhadas = horastrabalhadas;
    }

    public void ligar(){
        if (status.equalsIgnoreCase("ligada")) {
            status = "ligada";
            System.out.println("Máquina " + identificacao + " ligada.");
        } else {
            System.out.println("Máquina " + identificacao + " já está desligada.");
        }
    }

    public void producaoDiara (){
        int producaoDiaria = capacidadeMaximaProducao * horastrabalhadas;
        System.out.println("Produção diária da máquina " + identificacao + " foi de: " + producaoDiaria + " unidades.");
    }
}
