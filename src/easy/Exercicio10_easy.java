package easy;

import javax.swing.*;

public class Exercicio10_easy {
    public double calcularInvestimentoJurosSimples(double valorInvestimento) {

        double taxaJuros = 0.12;
        int tempoInvestido = 10;

        taxaJuros = taxaJuros * tempoInvestido;

        double valorTotal = (valorInvestimento * taxaJuros) +valorInvestimento;

        return  valorTotal;

    }// fim main

    public double calcularValorDeJuros(double valorTotal, double valorInvestimento){
        return (valorTotal - valorInvestimento);
    }
}//fim classe


