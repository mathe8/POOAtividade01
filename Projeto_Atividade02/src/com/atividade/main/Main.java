package com.atividade.main;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

import com.atividade.data.Data;

public class Main {

    public static void main(String[] args) {

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);
        String[] exploded;

        System.out.println("Digite a primeira data no fomato dd/MM/yyyy: ");
        String dataUmString = input.next();
        exploded = dataUmString.split("/");

        Data dataUm = new Data();
        dataUm.setDia(Integer.parseInt(exploded[0]));
        dataUm.setMes(Integer.parseInt(exploded[1]));
        dataUm.setAno(Integer.parseInt(exploded[2]));
        Date dataUmCompleta = dataUm.getDataMontada();
        System.out.println("Primeira Data: "+formatter.format(dataUmCompleta));

        System.out.println();

        System.out.println("Digite a segunda data no fomato dd/MM/yyyy: ");
        String dataDoisString = input.next();
        exploded = dataDoisString.split("/");

        Data dataDois = new Data();
        dataDois.setDia(Integer.parseInt(exploded[0]));
        dataDois.setMes(Integer.parseInt(exploded[1]));
        dataDois.setAno(Integer.parseInt(exploded[2]));
        Date dataDoisCompleta = dataDois.getDataMontada();
        System.out.println("Segunda Data: "+formatter.format(dataDoisCompleta));

        System.out.println();

        // Exibe o resultado da comparação das duas datas
        int resultadoComparacao = dataUm.compararDatas(dataUmCompleta, dataDoisCompleta);
        System.out.println("Resultado: "+resultadoComparacao);

    }
}
