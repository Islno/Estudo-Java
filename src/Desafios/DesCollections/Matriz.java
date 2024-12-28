package Desafios.DesCollections;

import java.util.Scanner;


import java.util.Scanner;

public class Matriz{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz (n x n): ");
        int n = entrada.nextInt();

        // Validação para garantir que o tamanho seja adequado
        if (n < 1) {
            System.out.println("O tamanho da matriz deve ser maior que 0.");
            return;
        }

        // Criando e preenchendo a matriz
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n -1) {
                    matriz[i][j] = '*'; // Preenche as diagonais
                } else {
                    matriz[i][j] = '°'; // Preenche com espaços
                }
            }
        }

        // Exibindo o "X"
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(); // Quebra de linha
        }
    }
}
