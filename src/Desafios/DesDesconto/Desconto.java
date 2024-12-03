package Desafios.DesDesconto;

public class Desconto {
    String nome;
    double preco;
    private static double desconto = 0.25;

    Desconto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
