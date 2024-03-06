package easy;

import javax.swing.*;

public class Exercicio09_easy {
    public void  calculaExibeTabuada(int tabuada) {

        if (tabuada <= 0 || tabuada > 10) {
            System.out.println("Número inválido!");
        } else {
            for (int i = 0; i <= 10; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
        }
    }
}

