package Arrays;

import java.util.Scanner;

public class Des01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas que deseja adicionar: ");

        int qtdeNotas = entrada.nextInt();
        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextInt();
        }
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A média é: " + media);
    }
}
