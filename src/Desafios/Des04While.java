package Desafios;

import java.util.Scanner;

public class Des04While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor ="";
        int contador = 1;


        while (!valor.equalsIgnoreCase("sair")){
            if (contador<=10) {
                contador++;
                System.out.println("Oque deseja?");
                valor = entrada.nextLine();
            }else {
                System.out.println("digite ''sair'' para sair ");
                System.out.println("Oque deseja?");
                valor = entrada.nextLine();
            }
        }
    }
}
