package com.atividade.main;

import com.atividade.faculdade.Aluno;

public class Main {

    public static void main(String[] args) {
        Aluno alunoUm;
        alunoUm = new Aluno();

        alunoUm.Nome = "Jorge";
        alunoUm.Nota1 = 5.0;
        alunoUm.Nota2 = 7.0;
        alunoUm.NotaTrabalho = 8.0;

        System.out.println("Nome Aluno: "+alunoUm.Nome);
        System.out.println("Média: "+alunoUm.CalcularMedia());
        System.out.println("Está Aprovado: "+alunoUm.EstaAprovado());

        System.out.println();

        Aluno alunoDois;
        alunoDois = new Aluno();

        alunoDois.Nome = "Maria";
        alunoDois.Nota1 = 6.0;
        alunoDois.Nota2 = 8.0;
        alunoDois.NotaTrabalho = 2.0;

        System.out.println("Nome Aluno: "+alunoDois.Nome);
        System.out.println("Média: "+alunoDois.CalcularMedia());
        System.out.println("Está Aprovado: "+alunoDois.EstaAprovado());
    }
}
