package easy;

import javax.swing.*;

public class Exercicio11_easy {
    public static void main(String[] args) {//Inicio main

        int numeroInt = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro"));
        int soma = 2;

        for (int i = 0; i <= 99; i++) {
            numeroInt = numeroInt + soma;
            System.out.println("Iteração: " + i + " - valor: " + numeroInt);
        }
        System.out.println("Fim das iterações!");

    }//fim main
}//fim classe
