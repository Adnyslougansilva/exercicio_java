package easy;

import com.sun.source.util.SourcePositions;

import javax.swing.*;
import java.sql.SQLOutput;

public class Exercicio04_easy {

    public static void main(String[] args) {
        do {
            int entradaNum = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero inteiro!"));
            int dobroNum = 2;
            int resultado = dobroNum * entradaNum;
            System.out.println("O Dobro do numero é  = " + resultado);
        } while (JOptionPane.showInputDialog("Deseja continuar digite s , ou para sair clique em outra tecla").equals("s"));
    }
}

