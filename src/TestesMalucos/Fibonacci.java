package TestesMalucos;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números da sequência de Fibonacci você quer ver? ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.println("Fibonacci Sequence até " + n + ":");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextNumber = a + b;
            a = b;
            b = nextNumber;
        }
    }
}