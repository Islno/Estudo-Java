package Arrays;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        // notasAlunoA[3] = 6.5; Não é possível adicionar um valor a mais no array

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        System.out.println(Arrays.toString(notasAlunoA));
        double totalAluno = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            System.out.println(notasAlunoA[i]);
            totalAluno += notasAlunoA[i];
            System.out.println("Total das notas" + totalAluno);
        }

    }
}
