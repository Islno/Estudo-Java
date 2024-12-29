package Oo;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Pedro");

        Curso c1 = new Curso("Java Completo");
        Curso c2 = new Curso("Web 2023");
        Curso c3 = new Curso("React Native");

        a1.adicionarCurso(c1);
        a1.adicionarCurso(c2);
        a1.adicionarCurso(c3);

        a2.adicionarCurso(c1);
        a2.adicionarCurso(c2);
        a2.adicionarCurso(c3);

        a3.adicionarCurso(c1);
        a3.adicionarCurso(c2);
        a3.adicionarCurso(c3);

        for (Aluno aluno : c1.alunos) {
            System.out.println("Estou matriculado no curso " + c1.nome + "...");
            System.out.println("...e o aluno é: " + aluno.nome);
        }
        System.out.println(c1.alunos);


    }
}
