package medium;

import javax.swing.*;

public class ExecucaoMedium {
    public static void main(String[] args) {

//        Exercicio01_medium exercicio01_medium = new Exercicio01_medium();
//        int numero = 9;
//        System.out.println(exercicio01_medium.verificaparOuImpar(numero));

        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Investimento!"));
        Exercicio02_medium exercicio02_medium = new Exercicio02_medium();
        double valorTotal = exercicio02_medium.calcularInvestimentoJurosCompostos(valorInvestimento);

        System.out.println("O valor investido foi de R$ " + valorInvestimento);
        System.out.println("O Valor total com Juros foi de R$ " + valorTotal);
        System.out.println("O Valor de juros foi de R$ " + exercicio02_medium.calcularValorDosJuros(
                valorTotal, valorInvestimento));

    }
}
