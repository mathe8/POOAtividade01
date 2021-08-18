package com.atividade.data;

import java.util.Date;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public int compararDatas(Date dataCompleta, Date dataDois) {
        if (dataCompleta.compareTo(dataDois) > 0){
            System.out.println("* Data Principal é maior que a Segunda Data");
            return 1;
        } else if (dataCompleta.compareTo(dataDois) < 0){
            System.out.println("* Segunda data é maior que a Data Principal");
            return -1;
        } else {
            System.out.println("* Data Principal é igual a Segunda Data");
            return 0;
        }
    }

    public void setDia(int dia) { // Sombreamento: declarar um parâmetro/variável com mesmo nome de outra variável de um escopo superior
        if (dia > 31 || dia < 1) {
            System.out.println("Dia inválido");
            System.exit(1);
        } else {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (mes > 12 || mes < 0) {
            System.out.println("Mês inválido");
            System.exit(1);
        } else {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        if (ano > 3000 || ano < 2000) {
            System.out.println("Ano inválido");
            System.exit(1);
        } else {
            this.ano = ano;
        }
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public Date getDataMontada(){
        return new Date(getMes()+"/"+getDia()+"/"+getAno());
    }
}


