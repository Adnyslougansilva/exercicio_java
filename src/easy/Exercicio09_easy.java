package easy;

import javax.swing.*;

public class Exercicio09_easy {
    public static void main(String[] args) {

        int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número de 1 Até 10!"));

        if (tabuada <= 0 || tabuada > 10) {
            System.out.println("Número inválido!");
        } else {
            for (int i = 0; i <= 10; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
        }
    }
}

