package medium;

import javax.swing.*;

public class Exercicio02_medium {
    public double calcularInvestimentoJurosCompostos(double valorInvestimento) {

            int tempoInvestimento = 10;
            double valorTotal = 0.0;
            double taxaJuros = 0.12;
            valorTotal = valorInvestimento;

            for (int i = 0; i < tempoInvestimento; i++) {
                valorTotal = (valorTotal * taxaJuros) + valorTotal;
            }
            return valorTotal;
    }
    public double calcularValorDosJuros(double valorTotal, double valorInvestido){
        return (valorTotal - valorInvestido);
    }
}
