package Desafios.Desafio11;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        System.out.println("Peso atual: " + peso);
        peso += comida.peso;
        System.out.println("Peso atual: " + peso);
    }
}

