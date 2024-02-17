package easy;

import javax.swing.*;

public class Exercicio10_easy {
    public static void main(String[] args) {

        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor investido"));
        double taxaJuros = 0.12;
        int tempoInvestido = 10;

        taxaJuros = taxaJuros * tempoInvestido;

        double valorTotal = (valorInvestimento * taxaJuros) +valorInvestimento;

        System.out.println("Valor Investido: "+valorInvestimento);
        System.out.println("Taxa de juros acumulada: "+(taxaJuros*100) + "%");
        System.out.println("Valor Total: "+valorTotal);

    }// fim main
}//fim classe


