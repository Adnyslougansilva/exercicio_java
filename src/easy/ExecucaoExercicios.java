package easy;

import javax.swing.*;

public class ExecucaoExercicios {

    public static void main(String[] args) {
//        Exercicio02_easy exercicio02Easy = new Exercicio02_easy();
//        System.out.println(exercicio02Easy.exibirPalavra("Estudo faz bem!"));

//        Exercicio03_easy exercicio03_easy = new Exercicio03_easy();
//        String primeiroValor = JOptionPane.showInputDialog("Digite um valor (pode ser numerico ou texto)!");
//        String segundoValor = JOptionPane.showInputDialog("Digite um valor (pode ser numerico ou texto!");
//        String texto = exercicio03_easy.trocaValorDigitado(primeiroValor, segundoValor);
//        System.out.println(texto);

        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        int numeroDigitado = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero inteiro!"));
        System.out.println("O Dobro do numero é  = " + exercicio04_easy.calcularDobro(numeroDigitado));
  }
}
