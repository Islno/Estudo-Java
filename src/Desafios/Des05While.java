package Desafios;

import java.util.Scanner;

public class Des05While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1){
            System.out.println("Digite uma nota: ");
            nota = entrada.nextDouble();

            if (nota>=0 || nota <=10){
                total += nota;
                contador++;
            }else {
                System.out.println("nota invalida");
            }
        }
        double media = total/contador;
        System.out.println("media dos alunos: "+media);

    }
}
