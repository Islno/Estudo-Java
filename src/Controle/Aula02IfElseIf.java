package Controle;

import javax.swing.*;
import java.util.Scanner;

public class Aula02IfElseIf {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Digiter uma nota: ");
        double nota =  entrada.nextDouble();

        if (nota >10 || nota <0){
            System.out.println("Nota invalida ");
        } else if (nota>=8.1) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
