package Desafios;

import java.util.Scanner;

public class Des08Par {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        if (numero > 10 || numero < 0){
            System.out.println("Numero Invalido");
        }else{
            if (numero % 2 == 0){
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
        }
    }
}
