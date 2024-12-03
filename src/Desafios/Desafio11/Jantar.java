package Desafios.Desafio11;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João", 99.8);
        Comida c1 = new Comida("Arroz", 0.2);
        Comida c2 = new Comida("Feijão", 0.3);

        p1.comer(c1);
        p1.comer(c2);

    }
}
