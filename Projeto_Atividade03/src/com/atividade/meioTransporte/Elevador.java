package com.atividade.meioTransporte;

public class Elevador {

    private int andarAtual;
    private int totalDeAndares;
    private int capacidade;
    private int quantidadePessoas;

    public Elevador(){
        andarAtual = 0; // Térreo
        totalDeAndares = 9;
        capacidade = 6;
        quantidadePessoas = 0;
    }

    public void AcrescentarPessoa(int pessoasEntraram) {
        int tmpQntPessoas = this.quantidadePessoas + pessoasEntraram;
        // Validações
        if(tmpQntPessoas > this.capacidade) {
            this.quantidadePessoas = 6;
            System.out.println(tmpQntPessoas - this.quantidadePessoas + " Pessoa(s) não entraram: Limite Atingido (" + this.quantidadePessoas + " Pessoas)");
        }else if(tmpQntPessoas <= this.capacidade){
            this.quantidadePessoas = tmpQntPessoas;
        }
    }

    public void RemoverPessoa(int pessoasSairam) {
        int tmpQntPessoas = this.quantidadePessoas - pessoasSairam;
        // Validações
        if (tmpQntPessoas <= 0) {
            this.quantidadePessoas = 0;
        } else if (tmpQntPessoas < this.quantidadePessoas) {
            this.quantidadePessoas = tmpQntPessoas;
        }
    }

    public void SubirAndar(int subirAndar) {
        int tmpAndarAtual = this.andarAtual + subirAndar;
        // Validações
        if (tmpAndarAtual >= this.totalDeAndares) {
            this.andarAtual = this.totalDeAndares;
            System.out.println("Você chegou no topo");
        } else if (tmpAndarAtual < this.totalDeAndares) {
            this.andarAtual = tmpAndarAtual;
        }
    }

    public void DescerAndar(int descerAndar) {
        int tmpAndarAtual = this.andarAtual - descerAndar;
        // Validações
        if (tmpAndarAtual <= 0) {
            this.andarAtual = 0;
            System.out.println("Você está no térreo");
        } else if (tmpAndarAtual <= this.andarAtual) {
            this.andarAtual = tmpAndarAtual;
        }
    }

    public void getStatus() {
        System.out.println("\nQuantidade de Pessoas.: "+this.quantidadePessoas);
        System.out.println("Andar Atual...........: "  +this.andarAtual);
    }
}
