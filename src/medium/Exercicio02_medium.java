package medium;

import javax.swing.*;

public class Exercicio02_medium {
    public static void main(String[] args) {

            double valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Investimento!"));
            double valorAcumulado = valorInvestido;
            double valorJuros = 0;
            double taxaJuros = 0.12;

            for (int i = 0; i < 10; i++) {
                double juros = valorAcumulado * taxaJuros;
                valorJuros = valorJuros + juros;
                valorAcumulado = valorAcumulado + juros;
            }
            System.out.println("Valor total com juros por 10 Anos é R$ " + valorAcumulado);
            System.out.println("O Valor de Juros por 10 Anos é R$ " + valorJuros);
            System.out.println("O Valor inicial investido foi de R$ " + valorInvestido);

    }
}
