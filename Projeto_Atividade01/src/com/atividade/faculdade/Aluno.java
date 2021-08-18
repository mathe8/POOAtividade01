package com.atividade.faculdade;

public class Aluno {

    public String Nome;
    public Double Nota1;
    public Double Nota2;
    public Double NotaTrabalho;

    public Double CalcularMedia() {
        return ((2.5*Nota1)+(2.5*Nota2)+(2*NotaTrabalho))/7;
    }

    public Boolean EstaAprovado() {
        return CalcularMedia() >= 6;
    }
}
