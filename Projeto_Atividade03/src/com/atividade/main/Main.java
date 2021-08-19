package com.atividade.main;

import com.atividade.meioTransporte.Elevador;

public class Main {

    public static void main(String[] args) {

        // Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio.
        // A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo),
        // capacidade do elevador e quantas pessoas estão presentes nele.
        // A classe deve também disponibilizar os seguintes métodos:
        // construtor: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
        // entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
        // sair: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
        // sobe: para subir um andar (não deve subir se já estiver no último andar);
        // desce: para descer um andar (não deve descer se já estiver no térreo);
        // status: para imprimir a quantidade de pessoas e o andar em que o elevador está no momento.

        Elevador elevadorPredio = new Elevador();

        elevadorPredio.AcrescentarPessoa(6);
        elevadorPredio.RemoverPessoa(1);
        elevadorPredio.RemoverPessoa(1);
        elevadorPredio.AcrescentarPessoa(6);

        elevadorPredio.AcrescentarPessoa(4);
        elevadorPredio.RemoverPessoa(5);

        elevadorPredio.AcrescentarPessoa(5);
        elevadorPredio.RemoverPessoa(6);

        elevadorPredio.SubirAndar(1);
        elevadorPredio.SubirAndar(2);
        elevadorPredio.SubirAndar(3);
        elevadorPredio.SubirAndar(2);

        elevadorPredio.DescerAndar(1);
        elevadorPredio.DescerAndar(2);
        elevadorPredio.DescerAndar(2);
        elevadorPredio.SubirAndar(6);
        elevadorPredio.DescerAndar(9);

        elevadorPredio.getStatus();

    }
}
