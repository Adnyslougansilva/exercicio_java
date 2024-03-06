package medium;

public class Exercicio01_medium {

    public String verificaparOuImpar(int numero) {

        if (numero % 2 == 0) {
           return ("Par: " + numero);
        } else {
            return ("Ímpar: " + numero);
        }
    }
}