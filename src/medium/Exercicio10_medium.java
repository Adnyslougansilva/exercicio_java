package medium;

import javax.swing.*;

public class Exercicio10_medium {
    public static void main(String[] args) {
        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento Fibonacci que voce deseja"));
        int [] vetorFibonacci =  new int [elemento];
        vetorFibonacci[0] = 0;
        vetorFibonacci[1] = 1;
        for (int i = 2; i < vetorFibonacci.length; i++){
            vetorFibonacci[i] = vetorFibonacci[i-1] + vetorFibonacci[i-2];
        }
        for (int i = 0; i < vetorFibonacci.length; i++){
            System.out.println(vetorFibonacci[i]);
        }
    }
}
