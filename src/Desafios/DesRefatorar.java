package Desafios;

import java.util.Scanner;

public class DesRefatorar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                System.out.println("Não é primo");
            } else {
                System.out.println("É primo");
            }
        }
    }
}
