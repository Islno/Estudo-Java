package TestesMalucos;

public class Igual {
    String nome;

    public static void main(String[] args) {
        Igual a1 = new Igual();
        a1.nome = "a";

        Igual b1 = new Igual();
        b1.nome = "a";

        if (a1 == b1) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        if (a1.equals(b1)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        String a = "a";
        String b = "a";

        if (a == b) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
