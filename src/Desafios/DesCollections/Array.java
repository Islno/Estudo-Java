package Desafios.DesCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;

        for (int i = 1; i<=5 ; ++i) {
            System.out.println("Digite cinco números: ");
            int num = entrada.nextInt();
            lista.add(num);
        }
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > maior) {
                maior = lista.get(i);
                posicao = i + 1;
            }
        }
        System.out.println("O maior número é: " + maior + " sua posição é: " + posicao);
    }
}
