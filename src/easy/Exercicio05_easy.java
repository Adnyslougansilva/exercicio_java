package easy;

import javax.print.attribute.standard.Media;
import javax.swing.*;

public class Exercicio05_easy {

    public static void main(String[] args) {
        do {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Número Inteiro!"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Número Inteiro!"));
            int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro Número Inteiro!"));

            int somar = num1 + num2 + num3;
            int subtrair = num2 - num1;
            int multiplicar = num1 * num2 * num3;
            int media = multiplicar / 3;

            System.out.println("A soma dos números é" +somar);
            System.out.println("A subtração dos números é" +subtrair);
            System.out.println("A multiplicação dos números é" +multiplicar);
            System.out.println("A Média dos números é" +media);

        } while (JOptionPane.showInputDialog("Deseja Continuar Digite S , ou Para Sair Clique em Outra Tecla").equals("S"));
    }

}
