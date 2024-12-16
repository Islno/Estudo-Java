package Arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //entrada pra pedir o numero de alunos e notas
        System.out.println("Digite o numero de alunos: ");
        int numAlunos = entrada.nextInt();

        System.out.println("Digite o numero de notas: ");
        int numNotas = entrada.nextInt();
        //fim da entrada

        // criação da matriz de notas de acordo com o numero de alunos e notas
        double[][] notasDaTurma = new double[numAlunos][numNotas];
        double total = 0;

        //percorrendo a matriz
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Digite a nota %d do aluno %d: ", j, i);
                total += notasDaTurma[i][j] = entrada.nextDouble();
            }
        }
        double media = total / (numAlunos * numNotas);
        System.out.println("Media da turma: " + media);
    }
}