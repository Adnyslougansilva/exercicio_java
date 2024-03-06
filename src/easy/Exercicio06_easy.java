package easy;

import javax.swing.*;

public class Exercicio06_easy {

    public String verificaAprovacaoAluno(double nota1, double nota2) {

            double media = (nota1 + nota2) / 2;

            if (media >5){
                return ("Passou");
            }
            else if (media ==5){

                return ("Fazer Exame");
            }
            else {
                return ("Reprovou");
            }

    }

}

