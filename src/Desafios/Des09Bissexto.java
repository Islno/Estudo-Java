package Desafios;

import java.util.Scanner;

public class Des09Bissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = entrada.nextInt();

        if((ano % 4 ==0 && ano % 100 !=0) ||(ano % 400 == 0)){
            System.out.println("Ano Bissexto");
        }else{
            System.out.println("Ano Não Bissexto");
        }
    }
}
