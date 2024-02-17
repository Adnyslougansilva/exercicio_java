package easy;

import javax.swing.*;

public class Exercicio06_easy {

    public static void main(String[] args) {
        do {
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Primeira Nota!"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Segunda Nota!"));
            double media = (nota1 + nota2) / 2;


            if (media >5){
                System.out.print("Passou");
            }
            else if (media ==5){

                System.out.println("Fazer Exame");
            }
            else {
                System.out.println("Reprovou");
            }
        }while (JOptionPane.showInputDialog("Deseja Continuar Digite S , Ou Para Sair Clique Em Outra Tecla").equals("S"));

    }

}

