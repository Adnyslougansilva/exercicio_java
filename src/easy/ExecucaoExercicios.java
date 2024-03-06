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

//        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
//        int numeroDigitado = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero inteiro!"));
//        System.out.println("O Dobro do numero é  = " + exercicio04_easy.calcularDobro(numeroDigitado));

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Número Inteiro!"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Número Inteiro!"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro Número Inteiro!"));

        Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
        System.out.println("A soma dos números é: " + exercicio05_easy.calcularSoma(num1, num2, num3));
        System.out.println("A subtração dos números é: " + exercicio05_easy.calcularSubtrair(num1, num2, num3));
        System.out.println("A multiplicação dos números é: " + exercicio05_easy.calcularMultiplicar(num1, num2, num3));
        System.out.println("A Média dos números é: " + exercicio05_easy.calcularMedia(num1, num2, num3));
  }
}
