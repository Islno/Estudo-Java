package Desafios;

import java.util.Scanner;

public class DesDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero da semana: ");

        int diaDaSemana = entrada.nextInt();

        if (diaDaSemana == 0){
            System.out.println("É Domingo");
        } else if (diaDaSemana == 1) {
            System.out.println("É Segunda");
        }else if (diaDaSemana == 2) {
            System.out.println("É Terça");
        }else if (diaDaSemana == 3) {
            System.out.println("É Quarta");
        }else if (diaDaSemana == 4) {
            System.out.println("É Quinta");
        }else if (diaDaSemana == 5) {
            System.out.println("É Sexta");
        }else if (diaDaSemana == 6) {
            System.out.println("É Sabado");
        }

    }
}
