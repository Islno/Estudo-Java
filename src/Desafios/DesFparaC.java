package Desafios;

import java.util.Scanner;

public class DesFparaC {
    public static void main(String[] args) {
        Scanner temperaturaF  = new Scanner(System.in);

        System.out.println("Digite a temperatura");
        double fahrenheit = temperaturaF.nextDouble();

        double celsius = (fahrenheit  - 32) / 1.8;
        System.out.println(celsius);

        Scanner temperaturaC  = new Scanner(System.in);

        System.out.println("Digite a temperatura");
        double celsius2 = temperaturaC.nextDouble();

        double fahrenheit2 = (celsius2 * 1.8) + 32;
        System.out.println(fahrenheit2);
    }
}
