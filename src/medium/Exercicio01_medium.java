package medium;

public class Exercicio01_medium {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            } else {
                System.out.println("Ímpar: " + i);
            }
        }
    }
}