package Desafios.DesCollections;

import java.util.*;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
        int senhas = 5;

        for (int i =0; i<senhas; i++) {
            System.out.println("Digite o nome do cliente: ");
            String nome = entrada.nextLine();
            fila.add(nome);
        }
        System.out.println("Fila de atendimento: ");
        while (!fila.isEmpty()) {
            System.out.println("Cliente sendo atendido: " + fila.poll());
            if (!fila.isEmpty()) {
                System.out.println("Próximo cliente a ser atendido: " + fila.peek());
            }
        }
    }
}
