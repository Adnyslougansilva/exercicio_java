package medium;

import javax.swing.*;

public class Exercicio06_medium {
    public static void main(String[] args) {
        int numeroFatorialDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro, para calcular o fatorial"));
        if (numeroFatorialDigitado == 0){
            System.out.println("O fatorial do numero digitado e:0");
        }
        for (int i = numeroFatorialDigitado; i > 1 ; i--){
            numeroFatorialDigitado = numeroFatorialDigitado * (i-1);
        }
        System.out.println("O fatorial do nosso numero digitado é:" + numeroFatorialDigitado);
    }
}
